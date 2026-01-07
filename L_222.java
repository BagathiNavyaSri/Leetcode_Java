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
    public int countNodes(TreeNode root) {
        int leftdep = leftdepth(root);
        int rightdep = rightdepth(root);
        if(leftdep == rightdep){
            return (int)Math.pow(2, leftdep) - 1;
        }
        else{
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }
    public int leftdepth(TreeNode root){
        int dep = 0;
        while(root != null){
            dep++;
            root = root.left;
        }
        return dep;
    }
    public int rightdepth(TreeNode root){
        int dep = 0;
        while(root != null){
            dep++;
            root = root.right;
        }
        return dep;
    }
}



//The below one takes time complexity of O(n)

// class Solution {
//     public int countNodes(TreeNode root) {
//         int count = 0; 
//         if(root == null) return count;
//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.add(root);
//         while(!queue.isEmpty()){
//             TreeNode node = queue.poll();
//             count++;
//             if(node.left != null){
//                 queue.add(node.left);
//             }
//             if(node.right != null){
//                 queue.add(node.right);
//             }
//         }
//         return count;
//     }
// }
