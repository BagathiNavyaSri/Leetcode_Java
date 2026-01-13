class Solution {
    public int countBinarySubstrings(String s) {
        int group_cnt = 1;
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                group_cnt++;
            }else{
                res.add(group_cnt);
                group_cnt = 1;
            }
        }
        res.add(group_cnt);

        int sum = 0;
        for(int i = 0; i < res.size()-1; i++){
            sum += Math.min(res.get(i), res.get(i+1));
        }
        return sum;
    }
}
