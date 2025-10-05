class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        int left = 0;

        while(top <= bottom && left <= right){
            if(top <= bottom){
                for(int start = left; start <= right; start++){   //top row
                    result.add(matrix[top][start]);
                }
                top++;
            }

            if(left <= right){
                for(int start = top; start <= bottom; start++){  //right column
                    result.add(matrix[start][right]);  
                }
                right--;
            }

            if(bottom >= top){                
                for(int start = right; start >= left; start--){  //bottom row
                    result.add(matrix[bottom][start]);
                }
                bottom--;
            }

            if(left <= right){
                for(int start = bottom; start >= top; start--){  //left column
                    result.add(matrix[start][left]);
                }
                left++;
            }
        }
        return result;
    }
}
