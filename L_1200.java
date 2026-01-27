class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length-1; i++){
            int diff = arr[i+1] - arr[i];
            if(diff < minDiff){
                res.clear();
                res.add(Arrays.asList(arr[i], arr[i+1]));
                minDiff = diff;
            }else if(diff == minDiff){
                res.add(Arrays.asList(arr[i], arr[i+1]));
                minDiff = diff;
            }
        }
        return res;
    }
}
