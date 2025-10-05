class Solution {
    public int[][] generateMatrix(int n) {

        if(n == 1) return new int[][]{{1}};
        int[][] matrix = new int[n][n];
        int top = 0;
        int right = n-1;
        int bottom = n-1;
        int left = 0;
        int i = 1;
        while(top <= bottom && left <= right){
            if(top <= bottom){         //filling the top row  from left to right
                for(int start = left; start <= right; start++){
                    matrix[top][start] = i++;
                }
                top++;
            }

            if(right >= left){     //filling right column from top to bottom
                for(int start = top; start <= bottom; start++){
                    matrix[start][right] = i++;
                }
                right--;
            }

            if(bottom >= top){    //filling the bottom row from right to left
                for(int start = right; start >= left; start--){
                    matrix[bottom][start] = i++;
                }
                bottom--;
            }
 
            if(left <= right){     //filling the left column from bottom to top
                for(int start = bottom; start >= top; start--){
                    matrix[start][left] = i++;
                }
                left++;
            }
        }
        return matrix;

    }
}
