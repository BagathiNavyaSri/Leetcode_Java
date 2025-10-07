//First do transpose of the main matrix, then reverse the rows
class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        //Transpose of matrix
        for(int i = 0; i<m; i++){
            for(int j = i+1; j<m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Rows reversal
        int left;
        int right;
        for(int i = 0; i<m; i++){
            left = 0;
            right = m-1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

}
