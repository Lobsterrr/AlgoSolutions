/*
 * Given a boolean 2D matrix, find the number of islands.

Example
Given graph:

[
  [1, 1, 0, 0, 0],
  [0, 1, 0, 0, 1],
  [0, 0, 0, 1, 1],
  [0, 0, 0, 0, 0],
  [0, 0, 0, 0, 1]
]
return 3.

Note
0 is represented as the sea, 1 is represented as the island. 
If two 1 is adjacent, we consider them in the same island. 
We only consider up/down/left/right adjacent.
 */
public class NumberOfIslands {

    /**
     * @param grid a boolean 2D matrix
     * @return an integer
     */
    public int numIslands(boolean[][] grid) {
        
    }

    public void dfs(boolean[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || !grid[x][y]) {
            return;
        }
        grid[x][y] = false;
        dfs(grid, x - 1, y);
        dfs(grid, x + 1, y);
        dfs(grid, x, y - 1);
        dfs(grid, x, y + 1);
    }

    public int numIslands(boolean[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
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
        int result = 0;
        for (int i = 0; i < xLen; ++i) {
            for (int j = 0; j < yLen; ++j) {
                if (matrix[i][j] == 1) {
                    result++;
                    dfs(matrix, i, j);
                }
            }
        }
        return result;
    }

    public void dfs(int[][] matrix, int x, int y) {
        if (x < 0 || x >= matrix.length || y < 0 || 
                y >= matrix[0].length || matrix[x][y] != 1) {
            return;
        }
        matrix[x][y] = 2;
        dfs(matrix, x - 1, y);
        dfs(matrix, x + 1, y);
        dfs(matrix, x, y - 1);
        dfs(matrix, x, y + 1);
    }

}
