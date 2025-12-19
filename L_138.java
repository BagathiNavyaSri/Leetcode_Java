/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node curr = head;
        while(curr != null){
            Node newNode = new Node(curr.val);     //creating newNode between two exisiting nodes
            newNode.next = curr.next;               //giving connections
            curr.next = newNode;
            curr = curr.next.next;
        }
        Node ptr = head;
        while(ptr != null){
            if(ptr.random != null){
                ptr.next.random = ptr.random.next;                
            }
            ptr = ptr.next.next;
        }
        Node newhead = head.next;
        Node temp = head;
        Node newtemp = newhead;
        while(temp != null){
            temp.next = temp.next.next;
            temp = temp.next;
            if(temp != null){
                newtemp.next = newtemp.next.next;
                newtemp = newtemp.next;
            }
        }
        return newhead;
    }
}
