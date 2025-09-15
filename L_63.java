class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        if(obstacleGrid[0][0] == 1){         //Checking for obstacle at starting position (0,0)
            dp[0][0] = 0;
        }else{
            dp[0][0] = 1;
        }

        for(int j = 1; j < n; j++){     //Filling row 0
            if(obstacleGrid[0][j] != 1 && dp[0][j-1] != 0){
                    dp[0][j] = 1;
            }else{
                dp[0][j] = 0;
            }
        }

        for(int i = 1; i < m; i++){     //Filling column 0
            if(obstacleGrid[i][0] != 1 && dp[i-1][0] != 0){
                dp[i][0] = 1;
            }else{
                dp[i][0] = 0;
            }
        }

        for(int i = 1; i < m; i++){      //starting from (1.1) to (m-1, n-1)
            for(int j = 1; j < n; j++){
                if(obstacleGrid[i][j] != 1){
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
