/*
 * Write a program to solve a Sudoku puzzle by filling the empty cells.

 * Empty cells are indicated by the character '.'.

 * You may assume that there will be only one unique solution.
 */
public class SudokuSolver {

    public void solveSudoku(char[][] board) {
        dfs(board, 0, 0);
    }

    public boolean dfs(char[][] board, int row, int col) {
        if (col >= board[0].length)
            return dfs(board, row + 1, 0);
        if (row >= board.length)
            return true;
        if (board[row][col] == '.') {
            for (char c = '1'; c <= '9'; ++c) {
                board[row][col] = c;
                if (canPlace(board, row, col)) {
                    if (dfs(board, row, col + 1))
                        return true;
                }
                board[row][col] = '.';
            }
        } else {
            return dfs(board, row, col + 1);
        }
        return false;
    }

    public boolean canPlace(char[][] board, int row, int col) {
        for (int i = 0; i < board.length; i++) {
            if (i != row && board[i][col] == board[row][col])
                return false;
        }
        for (int j = 0; j < board[0].length; ++j) {
            if (j != col && board[row][j] == board[row][col])
                return false;
        }
        for (int i = row / 3 * 3; i < row / 3 * 3 + 3; ++i) {
            for (int j = col / 3 * 3; j < col / 3 * 3 + 3; ++j) {
                if (i != row && j != col && board[i][j] == board[row][col])
                    return false;
            }
        }
        return true;
    }

}
