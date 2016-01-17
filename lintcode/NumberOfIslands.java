/*
 *
 */
public class NumberOfIslands {

    public int numIslands(boolean[][] grid) {
        int xLen = grid.length;
        int yLen = grid[0].length;
        int[][] matrix = new int[xLen][yLen];
        for (int i = 0; i < xLen; ++i) {
            for (int j = 0; j < yLen; ++j) {
                if (grid[i][j]) {
                    matrix[i][j] = 1;
                }
            }
        }


    }

    public void dfs(int[][] matrix, int x, int y) {
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length || matrix[x][y] != 1) {
            return;
        }
        matrix[x][y] = 2;
        dfs(matrix, x - 1, y);
        dfs(matrix, x + 1, y);
        dfs(matrix, x, y - 1);
        dfs(matrix, x, y + 1);
    }

}
