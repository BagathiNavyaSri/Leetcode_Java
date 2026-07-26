class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 
        int prefixsum = 0;

        for(int i = 0; i < nums.length; i++){
            prefixsum += nums[i];
            int rem = prefixsum % k;  //A subarray sum is a multiple of k if (prefixSum[j]     - prefixSum[i]) % k == 0.   This is mathematically equivalent to saying that prefixSum[j] % k must be equal to prefixSum[i] % k 
            if(map.containsKey(rem)){
                if(i - map.get(rem) >= 2){
                    return true;
                }
            }else{
                map.put(rem, i);
            }
            
        }
        return false;
    }
}
