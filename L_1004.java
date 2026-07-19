//MORE OPTIMIZED
class Solution {
public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0, z_count = 0;

        for(int right = 0; right < n; right++){
            if(nums[right] == 0){
                z_count++;
            }

            if(z_count > k){
                if(nums[left] == 0){
                    z_count--;
                }
                left++;
            }
        }
        return n-left;
    }
}


// class Solution {
// public int longestOnes(int[] nums, int k) {
//         int n = nums.length;
//         int left = 0, z_count = 0;
//         int curr_len = 0, max_len = 0;

//         for(int right = 0; right < n; right++){
//             if(nums[right] == 0){
//                 z_count++;
//             }
            
//             while(z_count > k){
//                 if(nums[left] == 0){
//                     z_count--;
//                 }
//                 left++;
//             }
//             curr_len = right-left+1;
//             max_len = Math.max(curr_len, max_len);
//         }
//         return max_len;
//     }
// }

