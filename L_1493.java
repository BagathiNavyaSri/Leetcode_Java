class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int z_count = 0;    //counting the number of zeroes
        int maxLen = 0;
        int currLen = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                z_count++;
            }
            while(z_count > 1){
                if(nums[left] == 0){
                    z_count--;
                }
                left++;
            }
            currLen = right-left;
            maxLen = Math.max(maxLen, currLen);
        }
        return maxLen;
    }
}
