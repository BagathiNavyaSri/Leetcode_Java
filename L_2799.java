class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int num : nums){
            s.add(num);
        }

        Map<Integer, Integer> dict = new HashMap<>();
        int left = 0;
        int count = 0;

        for(int right = 0; right < nums.length; right++){
            int ch = nums[right];
            dict.put(ch, dict.getOrDefault(ch, 0) + 1);

            while(dict.size() == s.size()){
                count += nums.length - right;

                int del_ch = nums[left];
                dict.put(del_ch, dict.getOrDefault(del_ch, 0) - 1);

                if(dict.get(del_ch) == 0){
                    dict.remove(del_ch);
                }
                left++;
            }
        }
        return count;
    }
}
