class Solution {
    public static void sortColors(int[] nums) {
        //DUTCH NATIONAL FLAG ALGORITHM
        int n = nums.length;
         int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { 
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}



// class Solution{
//     public static void sortColors(int[] nums){
//         int c_0 = 0, c_1 = 0, c_2 = 0;
//         for(int num : nums){
//             if(num == 0)    c_0++;
//             else if(num == 1)   c_1++;
//             else   c_2++;
//         }
//         int i = 0;
//         while(c_0 > 0){
//             nums[i++] = 0;
//             c_0--;
//         }
//         while(c_1 > 0){
//             nums[i++] = 1;
//             c_1--;
//         }
//         while(c_2 > 0){
//             nums[i++] = 2;
//             c_2--;
//         }
//     }
// }





