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

}
