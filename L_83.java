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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        //Here if we have 1 node then this code works ..no need of separate statement
        ListNode pre = head;
        ListNode temp = head.next;

        while(temp != null){
            if(pre.val == temp.val){
                temp = temp.next;
            }else{
                pre.next = temp;
                pre = temp;
                temp = temp.next;
            }
        }
        pre.next = null;  //we can also write pre.next = temp; bcoz here temp value is null 
        return head;
    }
}
