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
    public boolean isValidBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();

        traverse(root, inorder);

        for(int i = 0; i < inorder.size()-1; i++){
            if(inorder.get(i) >= inorder.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public void traverse(TreeNode root, List<Integer> inorder){
        if(root == null){
            return;   //Here we cant return root because its return type is void
        }
        traverse(root.left, inorder);
        //inorder list add root
        inorder.add(root.val);
        traverse(root.right, inorder);

    }
}
