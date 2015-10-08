/*
 * According to the Wikipedia's article: "The Game of Life, also known simply 
 * as Life, is a cellular automaton devised by the British mathematician John 
 * Horton Conway in 1970."

 * Given a board with m by n cells, each cell has an initial state live (1) or 
 * dead (0). Each cell interacts with its eight neighbors (horizontal, 
 * vertical, diagonal) using the following four rules (taken from the above 
 * Wikipedia article):
 * 
 * Any live cell with fewer than two live neighbors dies, as if caused by 
 * under-population.
 * Any live cell with two or three live neighbors lives on to the next 
 * generation.
 * Any live cell with more than three live neighbors dies, as if by 
 * over-population..
 * Any dead cell with exactly three live neighbors becomes a live cell, as if 
 * by reproduction.
 * Write a function to compute the next state (after one update) of the board 
 * given its current state.
 * 
 * Follow up: 
 * Could you solve it in-place? Remember that the board needs to be updated at 
 * the same time: You cannot update some cells first and then use their updated 
 * values to update other cells.
 * In this question, we represent the board using a 2D array. In principle, the 
 * board is infinite, which would cause problems when the active area 
 * encroaches the border of the array. How would you address these problems?
 */
public class GameOfLife {

    public void gameOfLife(int[][] board) {
        int xLen = board.length;
        int yLen = board[0].length;
        for (int i = 0; i < xLen; ++i) {
            for (int j = 0; j < yLen; ++j) {
                if (check(board, i, j)) {
                    board[i][j] |= 1 << 1;
                }
            }
        }
        for (int i = 0; i < xLen; ++i) {
            for (int j = 0; j < yLen; j++) {
                board[i][j] /= 2;
            }
        }
    }

    public boolean check(int[][] board, int i, int j) {
        int count = 0;
        for (int a = -1; a <= 1; ++a) {
            for (int b = -1; b <= 1; ++b) {
                if (a == 0 && b == 0 || i + a < 0 || i + a >= board.length || 
                        j + b < 0 || j + b >= board[0].length)
                    continue;
                count += (board[i + a][j + b] & 1) == 1 ? 1 : 0;
            }
        }
        return board[i][j] == 0 && count == 3 || 
            board[i][j] == 1 && 2 <= count && count <= 3;
    }

    public void gameOfLife(int[][] board) {
        int xLen = board.length;
        int yLen = board[0].length;
        int[][] copy = new int[xLen][yLen];
        for (int i = 0; i < xLen; ++i) {
            for (int j = 0; j < yLen; ++j) {
                copy[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < xLen; ++i) {
            for (int j = 0; j < yLen; ++j) {
                board[i][j] = check(copy, i, j) ? 1 : 0;
            } 
        }
    }

    public boolean check(int[][] board, int i, int j) {
        int count = 0;
        for (int a = -1; a <= 1; ++a) {
            for (int b = -1; b <= 1; ++b) {
                if (a == 0 && b == 0 || i + a < 0 || i + a >= board.length || 
                        j + b < 0 || j + b >= board[0].length)
                    continue;
                count += board[i + a][j + b] == 1 ? 1 : 0;
            }
        }
        return board[i][j] == 0 && count == 3 || 
            board[i][j] == 1 && 2 <= count && count <= 3;
    }
    
}
