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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int mx = Integer.MIN_VALUE;
        int res = 0;
        int level = 0;
        while(!queue.isEmpty()){
            level++;
            int qlen = queue.size();
            int tot = 0;
            for(int i = 0; i < qlen; i++){
                TreeNode node = queue.poll();
                tot += node.val;
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            if(mx < tot){
                mx = tot;
                res = level;
            }
        }
        return res;
    }
}
