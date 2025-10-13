class Solution {
    int nr = 0, nc = 0;
    public void solve(char[][] board) {
        nr = board.length;
        nc = board[0].length;

        for(int col = 0; col < nc; col++){ // first row
            if(board[0][col] == 'O') dfs(board, 0, col);
        }
        for(int col = 0; col < nc; col++){ //last row
            if(board[nr-1][col] == 'O') dfs(board, nr-1, col);
        }
        for(int row = 0; row < nr; row++){ //first col
            if(board[row][0] == 'O') dfs(board, row, 0);
        }
        for(int row = 0; row < nr; row++){ //last col
            if(board[row][nc-1] == 'O') dfs(board, row, nc-1);
        }

        for(int row = 0; row < nr; row++){
            for(int col = 0; col < nc; col++){
                if(board[row][col] == 'O'){
                    board[row][col] = 'X';
                }else if(board[row][col] == '1'){
                    board[row][col] = 'O';
                }
            }
        }
    }

    public void dfs(char[][] board, int row, int col ){
        if(row < 0 || row > nr-1 || col < 0 || col > nc-1 || board[row][col] != 'O'){
            return;
        }
        board[row][col] = '1';
        dfs(board, row, col-1); //left
        dfs(board, row, col+1); //right
        dfs(board, row-1, col); //top
        dfs(board, row+1, col); //down
    }
}
