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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        boolean flag = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            Stack<Integer> stack = new Stack<>();
            List<Integer> arr = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(flag){   //it means if flag is true
                    //right to left -> stack
                    stack.add(node.val);
                     
                }else{
                    //left to right -> list
                    arr.add(node.val);
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            flag = !flag;
            while(!stack.isEmpty()){
                arr.add(stack.pop());
            }            
            res.add(arr);
        }
        return res;
    }
}
