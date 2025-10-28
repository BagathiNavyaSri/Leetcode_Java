class Solution {
    public int countValidSelections(int[] nums) {
        int count = 0;
        int t_sum = 0;
        for(int num : nums) t_sum += num;
        for(int i = 0; i<nums.length; i++){
                int left = i-1;
                int l_sum = 0;
                while(left >= 0){
                    l_sum += nums[left];
                    left--;
                }
                if(nums[i] == 0){
                    if(l_sum == (t_sum - l_sum)){
                        count += 2;
                    }else if(Math.abs(l_sum - (t_sum - l_sum)) == 1){
                        count += 1;
                    }            
                }
        }
        return count;
    }
}
