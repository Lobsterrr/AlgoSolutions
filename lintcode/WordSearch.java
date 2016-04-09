/*
 *
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (dfs(board, word, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(0) || board[i][j] == '#') {
            return false;
        }
        if (word.length() == 1) {
            return true;
        }
        for (int x = -1; x <= 1; ++x) {
            if (x == -1 || x == 1) {
                char tmp = board[i][j];
                board[i][j] = '#';
                if (dfs(board, word.substring(1), i + x, j)) {
                    return true;   
                }
                board[i][j] = tmp; 
            } else if (x == 0) {
                for (int y = -1; y <= 1; y += 2) {
                    char tmp = board[i][j];
                    board[i][j] = '#';
                    if (dfs(board, word.substring(1), i, j + y)) {
                        return true;
                    }
                    board[i][j] = tmp; 
                }
            }
        }
        return false;
    }

}
