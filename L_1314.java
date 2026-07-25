class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        // prefix matrix 
        int[][] prefix = new int[m+1][n+1];
        //here we are starting from first index because, to overcome index out of bounds error we are adding an extra row (i.e) index 0 , so by default they will be initialized with 0;
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                prefix[i][j] = mat[i-1][j-1] 
                            + prefix[i-1][j] 
                            + prefix[i][j-1] 
                            - prefix[i-1][j-1];
            }
        }

        //answer matrix
        int[][] answer = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int r1 = Math.max(0, i-k);
                int c1 = Math.max(0, j-k);
                int r2 = Math.min(m-1, i+k);
                int c2 = Math.min(n-1, j+k);

                r1++;
                c1++;
                r2++;
                c2++; // we do this because we know that whatever value we want in answer matrix is one more in the prefix matrix.

                answer[i][j] = prefix[r2][c2] 
                            - prefix[r1-1][c2] 
                            - prefix[r2][c1-1]
                            + prefix[r1-1][c1-1];
                
            }
        }
        return answer;

    }
}




// class Solution {
//     public int[][] matrixBlockSum(int[][] mat, int k) {
//         int m = mat.length;
//         int n = mat[0].length;

//         int[][] answer = new int[m][n];

//         for(int i = 0; i < m; i++){
//             for(int j = 0; j < n; j++){
//                 int sum = 0;

//                 for(int r = i-k; r <= i+k; r++){
//                     for(int c = j-k; c <= j+k; c++){
//                         if(r >=0 && r < m && c >= 0 && c < n){
//                             sum += mat[r][c];
//                         }
//                     }
//                 }
//                 answer[i][j] = sum;
//             }
//         }

//         return answer;
//     }
// }
