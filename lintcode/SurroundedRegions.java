/*
 *
 */
public class SurroundedRegions {

    public void surroundedRegions(char[][] board) {

    }

    public void dfs(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || 
                j >= board[i].length || board[i][j] == 'X') {
            return;
        }
        board[i][j] = '#';
        dfs(board, i - 1, j);
        dfs(board, i + 1, j);
        dfs(board, i, j - 1);
        dfs(board, i, j + 1);
    }

}
