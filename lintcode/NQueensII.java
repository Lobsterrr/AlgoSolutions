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
        int[] rows = new int[n];
        dfs(board, rows, 0);
        return result;
    }

    public void dfs(int[][] board, int[] rows, int row, int n) {
        if (row == n) {
            result++;
            return;
        }
        for (int i = 0; i < n; ++i) {
            if (canPlace(board, rows, row, i)) {
                board[row][i] = 1;
                dfs(board, rows, row + 1);
                board[row][i] = 0;
            }
        }
    }
    
    public boolean canPlace(int[][] board, int[] rows, int x, int y) {
        for (int i = 0; i < rows.length; ++i) {
            if (board[i][y] == 1 || board[x][i] == 1 || board[i][i - x + y] == 1 || board[i][x + y - i] == 1) {
                return false;
            }
        }
        return true;
    } 

}
