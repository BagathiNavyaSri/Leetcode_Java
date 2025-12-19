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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        if(length == n) return head.next;
        ListNode ptr = head;
        int jumps = length - n - 1;
        while(jumps > 0){
            ptr = ptr.next;
            jumps--;
        }
        ptr.next = ptr.next.next;
        return head;
    }
}

//Instead of returning head.next..without altering head u can create dummy node

// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode dummy=new ListNode(99);
//         dummy.next=head;
//         int length=0;
//         ListNode temp=head;
//         while(temp != null){
//             length++;
//             temp=temp.next;
//         }
//         ListNode ptr=dummy;
//         int jump=length-n;
//         while(jump>0){
//             ptr=ptr.next;
//             jump--;
//         }
//         ptr.next=ptr.next.next;
//         return dummy.next;
//     }
// }
