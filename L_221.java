class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];
        int mx = 0;

        for(int j = 0; j< n; j++){      //updating rows as it is
            if(matrix[0][j] == '1'){
                dp[0][j] = 1;
            }
            mx = Math.max(mx, dp[0][j]);     
        }

        for(int i = 0; i < m; i++){     //updating columns as it is
            if(matrix[i][0] == '1'){
                dp[i][0] = 1;
            }
            mx = Math.max(mx, dp[i][0]);
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == '1'){
                    int leftg = dp[i][j-1];
                    int top = dp[i-1][j];
                    int diag = dp[i-1][j-1];
                    dp[i][j] = Math.min(diag, Math.min(top, left))+1;
                    mx = Math.max(mx, dp[i][j]);
                }

            }
        }
        return mx*mx;
        
    }
}
