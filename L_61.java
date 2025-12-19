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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        int n = 0;
        ListNode temp = head;
        while(temp.next != null){    
            temp = temp.next;
            n++;
        }
        temp.next = head;
        k = k % (n+1);         //pattern repeats if k > length of linkedlist
        int jumps = n - k;
        ListNode p = head;
        while(jumps > 0){
            p = p.next;
            jumps--;
        }
        ListNode res = p.next;
        p.next = null;
        return res;       
    }
}
