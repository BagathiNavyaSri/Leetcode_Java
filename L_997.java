class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] res = new int[n + 1];
        res[0] = 0;
        for(int i = 0; i< trust.length; i++){
            res[trust[i][0]] -= 1;
            res[trust[i][1]] += 1;
        }

        for(int i = 1; i < res.length; i++){
            if(res[i] == n-1){
                return i;
            }
        }
        return -1;
    }
}
