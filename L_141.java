/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;   //takes 1 step
            fast = fast.next.next;   //takes 2 steps
            if(slow == fast){     //check the total node(address also)
                return true;
            }
        }
        return false;
    }
}
