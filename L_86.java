/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lesserList = new ListNode(99);
        ListNode greaterList = new ListNode(99);
        ListNode sptr = lesserList;
        ListNode gptr = greaterList;
        while(head != null){
            if(head.val < x){
                sptr.next = head;    //becuase sptr is initially a dummy node
                sptr = sptr.next;
            }else{
                gptr.next = head;   //becuase gptr is initially a dummy node
                gptr = gptr.next;   
            }
            head = head.next;
        }
        sptr.next = greaterList.next;   
        gptr.next = null;
        return lesserList.next; 
    }
}
