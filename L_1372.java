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
    int mx = 0;
    public int longestZigZag(TreeNode root) {
        dfs(root.left, "left", 1);
        dfs(root.right, "right", 1);
        return mx;
    }

    public void dfs(TreeNode root, String dir, int len){
        if(root == null){
            return;
        }
        if(dir.equals("left")){
            dfs(root.left, "left", 1);
            dfs(root.right, "right", len+1);
        }else{
            dfs(root.left, "left", len+1);
            dfs(root.right, "right", 1);
        }
        mx = Math.max(mx, len);
    }
}
