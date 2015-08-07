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


    }

}
