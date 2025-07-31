import java.util.*;
class L_3452 {
    public static int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i<nums.length;i++){
            boolean leftGood = i-k<0 || nums[i]>nums[i-k];
            boolean rightGood = i+k>=nums.length || nums[i]>nums[i+k];
            if( leftGood && rightGood){
                sum+=nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(sumOfGoodNumbers(nums, k));
        sc.close();
        
    }
}

// class Solution {
//     public int sumOfGoodNumbers(int[] nums, int k) {
//         int sum = 0;
//         for(int i = 0; i<nums.length;i++){
//             if((i-k<0 || nums[i]>nums[i-k]) && ( i+k>=nums.length || nums[i]>nums[i+k] )){
//                 sum+=nums[i];
//             }
//         }
//         return sum;
//     }
// }