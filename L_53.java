class Solution {
    public int maxSubArray(int[] nums) {
        //KADANE'S ALGORITHM
        int maxSum = nums[0];   
        int currSum = 0;

        for(int num : nums){
            currSum += num;
            maxSum = Math.max(maxSum, currSum);

            if(currSum < 0 ){
                currSum = 0;
            }

        }
        return maxSum;
    }
}

//Logic: The algorithm maintains a current_sum. If the current_sum becomes negative, it effectively resets to zero, as adding a negative sum to future elements would only decrease the potential maximum.


// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxSum = nums[0];   
//         int currentSum = nums[0]; // current subarray sum

//         for (int i = 1; i < nums.length; i++) {
//             currentSum = Math.max(nums[i], currentSum + nums[i]);
//             maxSum = Math.max(maxSum, currentSum);
//         }

//         return maxSum;
//     }
// }

