/*
 * Follow up for N-Queens problem.

Now, instead outputting board configurations, 
return the total number of distinct solutions.

Example
For n=4, there are 2 distinct solutions.
 */
public class NQueensII {

    /**
     * Calculate the total number of distinct N-Queen solutions.
     * @param n: The number of queens.
     * @return: The total number of distinct solutions.
     */
    int result = 0;

    public int totalNQueens(int n) {
        int[][] board = new int[n][n];
        dfs(board, 0);
        return result;
    }

    public void dfs(int[][] board, int row) {
        if (row == board.length) {
            result++;
            return;
        }
        for (int i = 0; i < board.length; ++i) {
            if (canPlace(board, row, i)) {
                board[row][i] = 1;
                dfs(board, row + 1);
                board[row][i] = 0;
            }
        }
    }
    
    public boolean canPlace(int[][] board, int row, int col) {
        for (int i = 0; i < board.length; ++i) {
            if (board[row][i] == 1 || board[i][col] == 1 || 
                    board[i][Math.abs(i - row + col) % board.length] == 1 || 
                    board[i][Math.abs(row + col - i) % board.length] == 1) {
                return false;
            }
        }
        return true;
    }

}
