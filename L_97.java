class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s2.length();    //here we are taking rows as s2(left side)
        int n = s1.length();   //here we are taking columns as s1(top)
        if((m + n) != s3.length()) return false;
        
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;

        for(int i = 0; i <= m;i++){
            for(int j = 0; j <= n; j++){
                if((j > 0) && (dp[i][j-1]) && (s1.charAt(j-1) == s3.charAt(i + j - 1))){
                    dp[i][j] = true;
                }
                
                if((i > 0) && (dp[i-1][j]) && (s2.charAt(i-1) == s3.charAt(i + j - 1))){
                    dp[i][j] = true;
                }
                //Here we are not assigning false because by default at the time of creation all the elements are False
            }
        }
        return dp[m][n];
    }
}
