class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        Set<Integer> rowidx=new HashSet<>();
        Set<Integer> colidx=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rowidx.add(i);
                    colidx.add(j);
                }
            }
        }
        for(int row:rowidx){
            for(int j=0;j<n;j++){
                matrix[row][j]=0;
            }
        }
        for(int col:colidx){
            for(int i=0;i<m;i++){
                matrix[i][col]=0;
            }
        }
    }
}










// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;

//         boolean firstRowZero = false;
//         boolean firstColZero = false;

//         // Check if first row has zero
//         for (int j = 0; j < n; j++) {
//             if (matrix[0][j] == 0) {
//                 firstRowZero = true;
//                 break;
//             }
//         }

//         // Check if first column has zero
//         for (int i = 0; i < m; i++) {
//             if (matrix[i][0] == 0) {
//                 firstColZero = true;
//                 break;
//             }
//         }

//         // Use first row & column as markers
//         for (int i = 1; i < m; i++) {
//             for (int j = 1; j < n; j++) {
//                 if (matrix[i][j] == 0) {
//                     matrix[i][0] = 0;  // mark row
//                     matrix[0][j] = 0;  // mark column
//                 }
//             }
//         }

//         // Set zeroes based on markers
//         for (int i = 1; i < m; i++) {
//             for (int j = 1; j < n; j++) {
//                 if (matrix[i][0] == 0 || matrix[0][j] == 0) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }

//         // Handle first row
//         if (firstRowZero) {
//             for (int j = 0; j < n; j++) {
//                 matrix[0][j] = 0;
//             }
//         }

//         // Handle first column
//         if (firstColZero) {
//             for (int i = 0; i < m; i++) {
//                 matrix[i][0] = 0;
//             }
//         }
//     }
// }
