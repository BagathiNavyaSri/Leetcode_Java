class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currsum = 0;
        int left = 0;
        for(int i = 0; i < k; i++){
            currsum += nums[i];
        }
        int maxsum = currsum;

        for(int right = k;right < nums.length; right++){
            currsum += nums[right];
            currsum -= nums[left];
            left++;
            maxsum = Math.max(maxsum,currsum);
        }

        return (double)maxsum/k;
    }
}
