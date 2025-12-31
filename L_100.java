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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(p);
        queue.add(q);

        while(!queue.isEmpty()){
            TreeNode pnode = queue.poll();
            TreeNode qnode = queue.poll();

            if(pnode == null && qnode == null){
                continue;
            }
            if(pnode == null || qnode == null || pnode.val != qnode.val){
                return false;
            }
            queue.add(pnode.left);
            queue.add(qnode.left);
            queue.add(pnode.right);
            queue.add(qnode.right);
        }
        return true;        
    }
}



// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         Queue<TreeNode> p_q = new LinkedList<>();
//         Queue<TreeNode> q_q = new LinkedList<>();

//         p_q.add(p);
//         q_q.add(q);

//         while(!p_q.isEmpty() && !q_q.isEmpty()){
//             TreeNode pnode = p_q.poll();
//             TreeNode qnode = q_q.poll();

//             if(pnode == null && qnode == null){
//                 continue;
//             }
//             if(pnode == null || qnode == null || pnode.val != qnode.val){
//                 return false;
//             }
//             p_q.add(pnode.left);
//             p_q.add(pnode.right);
//             q_q.add(qnode.left);
//             q_q.add(qnode.right);
//         }
//         return true;        
//     }
// }
