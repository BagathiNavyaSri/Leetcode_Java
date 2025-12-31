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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while(!queue.isEmpty()){
            TreeNode l_node = queue.poll();
            TreeNode r_node = queue.poll();

            if(l_node == null && r_node == null){
                continue;
            }
            if(l_node == null || r_node == null || l_node.val != r_node.val){
                return false;
            }
            queue.add(l_node.left);
            queue.add(r_node.right);
            queue.add(l_node.right);
            queue.add(r_node.left);
        }
        return true;
    }
}




// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         Queue<TreeNode> left = new LinkedList<>();
//         Queue<TreeNode> right = new LinkedList<>();
//         left.add(root.left);
//         right.add(root.right);

//         while(!left.isEmpty() && !right.isEmpty()){
//             TreeNode l_node = left.poll();
//             TreeNode r_node = right.poll();

//             if(l_node == null && r_node == null){
//                 continue;
//             }
//             if(l_node == null || r_node == null || l_node.val != r_node.val){
//                 return false;
//             }
//             left.add(l_node.left);
//             left.add(l_node.right);
//             right.add(r_node.right);
//             right.add(r_node.left);
//         }
//         return true;
//     }
// }
