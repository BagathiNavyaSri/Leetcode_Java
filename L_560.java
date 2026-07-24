class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int right = 0; right < nums.length; right++){
            prefixSum += nums[right];
            int target = prefixSum - k;

            if(map.containsKey(prefixSum-k)){
                count += map.get(prefixSum-k);     //By checking if (prefix_sum - K) exists in the map, you can instantly determine how many subarrays ending at the current position sum to K.
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
}


// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int count = 0;

//         for (int start = 0; start < nums.length; start++) {
//             int sum = 0;
//             for (int end = start; end < nums.length; end++) {
//                 sum += nums[end];
//                 if (sum == k) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

