class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        long count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixSum = 0;

        for(int num : nums){
            prefixSum += num;
            int rem = prefixSum % k;
            if(rem < 0) rem += k; // for -ve numbers.
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }
        return count;
    }
}

//Key point : If two prefix sums have the same remainder when divided by k, then the subarray between those two points has a sum divisible by k (i.e) ((sumj - sumi)%k = 0).
