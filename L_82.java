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
            return null;
        }
        ListNode dummy = new ListNode(99);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode temp = head;

        while(temp != null){
            if((temp.next != null) && temp.val == temp.next.val){
                while(temp.next != null && temp.val == temp.next.val){ //if the value is repeated more than 2 times
                    temp = temp.next;
                }
                pre.next = temp.next;
            }else{
                pre = pre.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}
