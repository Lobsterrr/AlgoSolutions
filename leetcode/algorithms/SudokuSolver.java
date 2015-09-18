/*
 * Write a program to solve a Sudoku puzzle by filling the empty cells.

 * Empty cells are indicated by the character '.'.

 * You may assume that there will be only one unique solution.
 */
public class SudokuSolver {

    public void solveSudoku(char[][] board) {

    }

    public void dfs(char[][] board, int row, int col) {
        if (row == board.length - 1 && col == board[0].length - 1)
            return;
        if (board[row][col] != '.') {
            if (col == board[0].length - 1)
                dfs(board, row + 1, 0);
            else
                dfs(board, row, col + 1);
        } else {
            for (char c = '1'; c <= '9'; ++c) {
                if (canPlace(board, row, col, c)) {
                    board[row][col] = c;
                    if (col = board[0].length - 1)
                        dfs(board, row + 1, 0);
                    else
                        dfs(board, row, col + 1);
                    board[row][col] = '.';
                }
            }
        }
    }

    public boolean canPlace(int[][] board, int row, int col, char c) {
        for (int col = 0; col < board.length; ++col) {
            
        }
    }

}
