class Solution {
    int nr = 0;
    int nc = 0;
    public int numIslands(char[][] grid) {
        nr = grid.length;
        nc = grid[0].length;

        int cnt = 0;
        for(int row = 0; row < nr; row++){
            for(int col = 0; col < nc; col++){
                if(grid[row][col] == '1'){
                    cnt++;
                    dfs(grid, row, col);
                }
            }
        }
        return cnt;
    }

    public void dfs(char[][] grid, int row, int col){
        if(row < 0 || row > (nr - 1) || col < 0 || col > (nc - 1) || grid[row][col] != '1'){
            return;
        } 
        grid[row][col] = '2';   //any value other than '1'
        
        // Here our traversal is in the following way : Left, Right, Top, Down

        dfs(grid, row, col-1); //left
        dfs(grid, row, col+1); //right
        dfs(grid, row-1, col); //top
        dfs(grid, row+1, col); //down

    }
}
