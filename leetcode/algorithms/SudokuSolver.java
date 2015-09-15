/*
 * Write a program to solve a Sudoku puzzle by filling the empty cells.

 * Empty cells are indicated by the character '.'.

 * You may assume that there will be only one unique solution.
 */
public class SudokuSolver {

    public void solveSudoku(char[][] board) {

    }

    public void dfs(char[][] board, int row) {
        if (row == board.length)
            return;
        for (int i = 0; i < board.length; ++i) {
            if (board[row][i] == '.') {
                
            }
        }
    }

    public boolean canPlace(int i) {

    }

}
