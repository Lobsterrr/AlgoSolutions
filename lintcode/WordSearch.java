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
        char tmp = board[i][j];
        board[i][j] = '#';
        boolean result = dfs(board, word.substring(1), i - 1, j) || dfs(board, word.substring(1), i + 1, j) || dfs(board, word.substring(1), i, j - 1) || dfs(board, word.substring(1), i, j + 1)
        board[i][j] = tmp;
        return result;
    }

}
