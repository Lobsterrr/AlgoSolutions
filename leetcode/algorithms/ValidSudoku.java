/*
 * Determine if a Sudoku is valid, according to: 
 * Sudoku Puzzles - The Rules.
 * The Sudoku board could be partially filled, where 
 * empty cells are filled with the character '.'.
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        int row;
        int[] col = new int[9];
        int[] block = new int[9];
        for(int i = 0; i < 9; i++) {
            row = 0;
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.')
                    continue;
                int bit = 1 << (board[i][j] - '1');
                if((row & bit) != 0 || (col[j] & bit) != 0 || (block[i / 3 * 3 + j / 3] & bit) != 0)
                    return false;
                row |= bit;
                col[j] |= bit;
                block[i / 3 * 3 + j / 3] |= bit;
            }
        }
        return true;
    }

/*****************************************************************************/

    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length == 0)
            return false;
        int xLen = board.length;
        int yLen = board[0].length;
        boolean[][] row = new boolean[xLen][yLen];
        boolean[][] col = new boolean[xLen][yLen];
        boolean[][] block = new boolean[xLen][yLen];
        for (int i = 0; i < xLen; ++i) {
            for (int j = 0; j < yLen; ++j) {
                if (board[i][j] == '.')
                    continue;
                int c = board[i][j] - '1';
                if (row[i][c] || col[c][j] || block[i / 3 * 3 + j / 3][c])
                    return false;
                row[i][c] = col[c][j] = block[i / 3 * 3 + j / 3][c] = true;
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length == 0)
            return false;
        int xLen = board.length;
        int yLen = board[0].length;
        int[] col = new int[9];
        int[] block = new int[9];
        for (int i = 0; i < xLen; ++i) {
            int row = 0;
            for (int j = 0; j < yLen; ++j) {
                if (board[i][j] == '.')
                    continue;
                int mask = 1 << (board[i][j] - '1');
                if ((row & mask) != 0 || (col[j] & mask) != 0 || 
                        (block[i / 3 * 3 + j / 3] & mask) != 0)
                    return false;
                row |= mask;
                col[j] |= mask;
                block[i / 3 * 3 + j / 3] |= mask;
            }
        }
        return true;
    }

}
