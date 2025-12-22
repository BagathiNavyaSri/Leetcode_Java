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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int max = 0;

        //Mid node
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Rev order
        ListNode nxtNode = slow;
        ListNode prev = null;
        while(slow != null){
            nxtNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nxtNode;
        }

        //Sum calculation and max updation
        while(prev != null){
            int sum = head.val + prev.val;
            max = Math.max(max, sum);
            head = head.next;
            prev = prev.next;
        }
        return max;
    }
}
