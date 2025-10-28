class Solution {
    public int numberOfBeams(String[] bank) {
        int res = 0;
        int prev_cnt = 0;

        for(String row : bank){
            int curr_cnt = 0;
            for(char ch : row.toCharArray()){
                if(ch == '1'){
                    curr_cnt++;
                }
            }
            if(curr_cnt > 0){
                res += prev_cnt*curr_cnt;
                prev_cnt = curr_cnt;
            }
        }
        return res;
    }
}
