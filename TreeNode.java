// import java.util.*;
// class L_94 {
//     public static class TreeNode {
//         int val;
//         TreeNode left;
//         TreeNode right;
//         TreeNode(int val){ 
//             this.val = val; 
//         }
//         TreeNode(int val, TreeNode left, TreeNode right) {
//             this.val = val;
//             this.left = left;
//             this.right = right;
//         }
//     }
//     public static List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> result = new ArrayList<>();
//         Traversal(root, result);
//         return result;
//     }
//     private static void Traversal(TreeNode node, List<Integer> result){
//         if(node == null)return;
//         Traversal(node.left, result);
//         result.add(node.val);
//         Traversal(node.right, result);
//     }
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println(inorderTraversal());
//         sc.close();
//     }
// }
