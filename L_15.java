class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Instead of Taking res as Set
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < n-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;    //because if there are consecutive same values then duplicates will occur.. so we are skipping those values.
            int l = i+1, r = n-1;
            while(l < r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while(l < r && nums[l] == nums[l+1]) l++;
                    while(l < r && nums[r] == nums[r-1]) r--;
                    l++;
                    r--;
                }else if(sum > 0){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return res;
    }
}


// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Arrays.sort(nums);
//         Set<List<Integer>> res = new HashSet<>();   //to remove the duplicate lists in the output

//         for(int i = 0; i< nums.length - 2;i++){
//             if(nums[i] > 0){ //if first number is greater than 0 then we cant get sum =0 ..bcoz a negative number should be presnt
//                 break; 
//             }
//             int left = i+1;
//             int right = nums.length-1;
//             while(left < right){
//                 int sum = nums[i] + nums[left]+nums[right];
//                 if(sum == 0){
//                     res.add(Arrays.asList(nums[i], nums[left], nums[right]));
//                     left++;
//                     right--;
//                 }else if(sum > 0){
//                     right--;
//                 }else{
//                     left++;
//                 }
//             }
//         }
//         return new ArrayList<>(res);
//     }
// }
