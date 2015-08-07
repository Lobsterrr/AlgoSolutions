/*
 * Given a 2D board and a list of words from the 
 * dictionary, find all words in the board.
 * 
 * Each word must be constructed from letters of 
 * sequentially adjacent cell, where "adjacent" 
 * cells are those horizontally or vertically 
 * neighboring. The same letter cell may not be 
 * used more than once in a word.
 * 
 * For example,
 * Given words = ["oath","pea","eat","rain"] and 
 * board =
 * 
 * [
 *   ['o','a','a','n'],
 *   ['e','t','a','e'],
 *   ['i','h','k','r'],
 *   ['i','f','l','v']
 * ]
 * Return ["eat","oath"].
 * Note:
 * You may assume that all inputs are consist of 
 * lowercase letters a-z.
 * 
 */
public class WordSearchII {
    
    // TLE
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<String>();
        for (int k = 0; k < words.length; k++) {
            for (int i = 0; i < board.length; ++i) {
                for (int j = 0; j < board[0].length; ++j) {
                    if (dfs(board, i, j, words[k]))
                        result.add(words[k]);
                }
            }
        }
        return result;
    }

    public boolean dfs(char[][] board, int i, int j, String word) {
        if (0 <= i && i < board.length && 0 <= j && j < board[0].length && word.charAt(0) == board[i][j]) {
            if (word.length() == 1)
                return true;
            board[i][j] = '#';
            boolean check = dfs(board, i + 1, j, word.substring(1)) || 
                    dfs(board, i - 1, j, word.substring(1)) || 
                    dfs(board, i, j + 1, word.substring(1)) || 
                    dfs(board, i, j - 1, word.substring(1));
            board[i][j] = word.charAt(0);
            if (check)
                return true;
        }
        return false;
    }

}
