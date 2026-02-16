class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(new ArrayList<>(),nums, res);
        return res;
    }

    public void backtrack(ArrayList<Integer> curr, int[] nums, List<List<Integer>> res){
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int num : nums){
            if(curr.contains(num)){
                continue;
            }
            curr.add(num);
            backtrack(curr, nums, res);
            curr.remove(curr.size() - 1);

        }
    }
}
