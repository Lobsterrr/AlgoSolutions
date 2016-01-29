/*
 * Given an integer matrix, find the length of the longest increasing path.
 * 
 * From each cell, you can either move to four directions: left, right, up or 
 * down. You may NOT move diagonally or move outside of the boundary (i.e. 
 * wrap-around is not allowed).
 * 
 * Example 1:
 * 
 * nums = [
 *   [9,9,4],
 *   [6,6,8],
 *   [2,1,1]
 * ]
 * Return 4
 * The longest increasing path is [1, 2, 6, 9].
 * 
 * Example 2:
 * 
 * nums = [
 *   [3,4,5],
 *   [3,2,6],
 *   [2,2,1]
 * ]
 * Return 4
 * The longest increasing path is [3, 4, 5, 6]. Moving diagonally is not allowed.
 */
public class LongestIncreasingPathInAMatrix {

    public int[][] path;

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        path = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                dfs(matrix, i, j);
            }
        }
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                result = Math.max(result, path[i][j]);
            }
        }
        return result + 1;
    }

    public void dfs(int[][] matrix, int i, int j) {
        int[] v1 = {0, 0, -1, 1};
        int[] v2 = {-1, 1, 0, 0};
        for (int k = 0; k < 4; ++k) {
            int x = i + v1[k];
            int y = j + v2[k];
            if (0 <= x && x < matrix.length && 0 <= y && y < matrix[0].length 
                    && matrix[i][j] < matrix[x][y] && path[i][j] >= path[x][y]) {
                path[x][y] = path[i][j] + 1;
                dfs(matrix, x, y);
            }
        }
    }

}
