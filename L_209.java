class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int mnLen = Integer.MAX_VALUE; //since we want min value we intialize to max value
        int currSum = 0;
        int currLen = nums.length;

        for(int right = 0;right < nums.length; right++){
            currSum += nums[right];

            while(currSum >= target){
                currLen = right - left + 1;
                mnLen = Math.min(mnLen, currLen);
                currSum -= nums[left];
                left++;
            }
        }
        return (mnLen == Integer.MAX_VALUE)? 0 : mnLen;
    }
}
