// class Solution {
//     public static int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] res = new int[n];
//         res[0] = 1;

//         for(int i = 1; i < n; i++){
//             res[i] = res[i-1]*nums[i-1];
//         }
//         int rightprod = 1;
//         for(int i = n-1; i >= 0; i--){
//             res[i] = res[i]*rightprod;
//             rightprod *= nums[i];
//         }
//     return res;
//     }
// }

class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] p_arr = new int[nums.length];
        int[] l_arr = new int[nums.length];
        int[] r_arr = new int[nums.length];
        l_arr[0] = 1;
        r_arr[nums.length-1] = 1;
        for(int i = 1; i<= nums.length-1; i++){
            l_arr[i] = l_arr[i-1]*nums[i-1];
        }
        for(int i = nums.length-2; i>= 0;i--){
            r_arr[i] = r_arr[i+1] * nums[i+1];
        }
        for(int i = 0; i<nums.length; i++){
            p_arr[i] = l_arr[i] * r_arr[i];
        }
        return p_arr;
    }

}
