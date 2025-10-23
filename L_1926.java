class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int nr = maze.length;          
        int nc = maze[0].length;       
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{entrance[0], entrance[1], 0});
        maze[entrance[0]][entrance[1]] = '+';
        int[][] dir = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];
            int step = curr[2];
            for (int[] d : dir) {
                int curRow = row + d[0];
                int curCol = col + d[1];
                if (curRow >= 0 && curRow < nr && curCol >= 0 && curCol < nc && maze[curRow][curCol] == '.') {
                    if (curRow == 0  || curRow == nr - 1 || curCol == 0 || curCol == nc - 1) {
                        return step + 1;
                    }
                    maze[curRow][curCol] = '+';
                    queue.offer(new int[]{curRow, curCol, step + 1});
                }
            }
        }
        return -1;
    }
}
