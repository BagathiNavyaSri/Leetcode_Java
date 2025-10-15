class Solution {
    public int islandPerimeter(int[][] grid) {
        int nr = grid.length;
        int nc = grid[0].length;
        int perimeter = 0;
        for(int row = 0; row < nr ; row++){
            for(int col = 0; col < nc; col++){
                if(grid[row][col] == 1){
                    perimeter += 4;
                    if(col > 0 && grid[row][col-1] == 1){
                        perimeter -= 2;
                    }
                    if(row > 0 && grid[row-1][col] == 1){
                        perimeter -= 2;
                    }
                }
            }
        }

        return perimeter;
    }
}


// class Solution {
//     public int islandPerimeter(int[][] grid) {
//         int nr = grid.length;
//         int nc = grid[0].length;
//         int perimeter = 0;
//         for(int row = 0; row < nr ; row++){
//             for(int col = 0; col < nc; col++){
//                 if(grid[row][col] == 1){
//                     perimeter += 4;
//                 }
//                 if(col > 0 && grid[row][col] == 1 && grid[row][col-1] == 1){
//                     perimeter -= 2;
//                 }
//                 if(row > 0 && grid[row][col] == 1 && grid[row-1][col] == 1){
//                     perimeter -= 2;
//                 }
//             }
//         }

//         return perimeter;
//     }
// }
