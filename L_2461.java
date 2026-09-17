class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long maxsum = 0;
        long windowsum = 0;
        int left = 0;
        Set<Integer> hs = new HashSet<>();

        for(int right = 0; right < n; right++){
            while(hs.contains(nums[right])){
                hs.remove(nums[left]);
                windowsum -= nums[left];
                left++;
            }

            hs.add(nums[right]);
            windowsum += nums[right];

            while( right-left+1 > k){
                hs.remove(nums[left]);
                windowsum -= nums[left];
                left++;
            }

            if(right-left+1 == k){
                maxsum = Math.max(maxsum, windowsum);
            }
        }
        return maxsum;
    }
}


// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {
//         int n = nums.length;
//         long maxsum = 0;
//         long windowsum = 0;
//         int left = 0;
//         Set<Integer> hs = new HashSet<>();

//         for(int right = 0; right < n; right++){
//             while(hs.contains(nums[right]) || right-left+1 > k){
//                 hs.remove(nums[left]);
//                 windowsum -= nums[left];
//                 left++;
//             }

//             hs.add(nums[right]);
//             windowsum += nums[right];

//             if(right-left+1 == k){
//                 maxsum = Math.max(maxsum, windowsum);
//             }
//         }
//         return maxsum;
//     }
// }

// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {
//         int n = nums.length;
//         long maxsum = 0;
//         long windowsum = 0; 
//         Map<Integer, Integer> map = new HashMap<>();
//         int left = 0;
//         for(int right = 0; right < n; right++){
//             map.put(nums[right], map.getOrDefault(nums[right], 0)+1);
//             windowsum += nums[right];

//             while(map.get(nums[right]) > 1 || right-left+1 > k){
//                 map.put(nums[left], map.get(nums[left])-1);
//                 windowsum -= nums[left];
//                 if(map.get(nums[left]) == 0){
//                     map.remove(nums[left]);
//                 }
//                 left++;
//             }
            
//             if(right-left+1 == k){
//                 maxsum = Math.max(windowsum, maxsum);
//             }
//         }
//         return maxsum;
//     }
// }
