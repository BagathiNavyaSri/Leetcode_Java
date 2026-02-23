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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;

        ListNode middle = findMiddle(head);
        TreeNode bst = new TreeNode(middle.val);
        if(middle == head){
            return bst;
        }
        bst.left = sortedListToBST(head);
        bst.right = sortedListToBST(middle.next);
        return bst;
    }

    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; //To assign to the node before middle node..to break the connection between previous nodes and middle node for left tree
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev != null){
            prev.next = null;
        }
        return slow;
    }
}
