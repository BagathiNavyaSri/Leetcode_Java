/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        int lenA = 0, lenB = 0;
        while(p1 != null){  //Finding length of linkedlistA
            lenA++;
            p1 = p1.next;
        }
        while(p2 != null){  //Finding length of linkedlistB
            lenB++;
            p2 = p2.next;
        }
        while(lenA > lenB){      //skipping the nodes of A to make lenA == lenB
            headA = headA.next;
            lenA--;
        }
        while(lenB > lenA){      //skipping the nodes of B to make lenA == lenB
            headB = headB.next;
            lenB--;
        }
        while(headA != headB){ 
            headA = headA.next;
            headB = headB.next;
        }
        return headA;        //you can return headA/headB         
    }
}


// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode p1 = headA;
//         ListNode p2 = headB;
//         int lenA = 0, lenB = 0;
//         while(p1 != null){  //Finding length of linkedlistA
//             lenA++;
//             p1 = p1.next;
//         }
//         while(p2 != null){  //Finding length of linkedlistB
//             lenB++;
//             p2 = p2.next;
//         }
//         while(lenA > lenB){      //skipping the nodes of A to make lenA == lenB
//             headA = headA.next;
//             lenA--;
//         }
//         while(lenB > lenA){      //skipping the nodes of B to make lenA == lenB
//             headB = headB.next;
//             lenB--;
//         }
//         while(headA != null){
//             if(headA == headB){
//                 return headA;
//             }
//             headA = headA.next;
//             headB = headB.next;
//         }
//         return null;         //you can return either headA/headB/null  beacause u come out of while loop
//     }
// }
