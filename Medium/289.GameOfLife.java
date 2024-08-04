class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = countLiveNeighbors(board, i, j);

                // Rule 1 or Rule 3
                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[i][j] = 2; // 2 signifies the cell was alive but now is dead
                }
                
                // Rule 4
                if (board[i][j] == 0 && liveNeighbors == 3) {
                    board[i][j] = 3; // 3 signifies the cell was dead but now is alive
                }
            }
        }

        // Final update to the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 0;
                }
                if (board[i][j] == 3) {
                    board[i][j] = 1;
                }
            }
        }
    }

    private int countLiveNeighbors(int[][] board, int row, int col) {
        int liveNeighbors = 0;
        int m = board.length;
        int n = board[0].length;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                int r = row + i;
                int c = col + j;

                if (r >= 0 && r < m && c >= 0 && c < n && (board[r][c] == 1 || board[r][c] == 2)) {
                    liveNeighbors++;
                }
            }
        }

        return liveNeighbors;
    }
}
