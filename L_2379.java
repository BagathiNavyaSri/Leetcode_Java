//Here we solve it using Sliding window problem
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int curr_count = 0;
        int min_count = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++){
            if(blocks.charAt(i) == 'W'){
                curr_count++;
            }
        }
        min_count = curr_count;

        for(int right = k; right < blocks.length(); right++){
            if(blocks.charAt(left) == 'W'){
                curr_count--;
            }
            if(blocks.charAt(right) == 'W'){
                curr_count++;
            }
            min_count = Math.min(min_count, curr_count);
            left++;    //right pointer updation is done in for loop
        }
        return min_count;
    }
}
