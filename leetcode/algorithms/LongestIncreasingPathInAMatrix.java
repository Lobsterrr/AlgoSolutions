/*
 * Given an integer matrix, find the length of the longest increasing path.
 * 
 * From each cell, you can either move to four directions: left, right, up or down. You may NOT move diagonally or move outside of the boundary (i.e. wrap-around is not allowed).
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
    int row;
    int col;

    public int longestIncreasingPath(int[][] matrix) {
        row = matrix.length;
        if (row == 0) {
            return 0;
        }
        col = matrix[0].length;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                dfs(matrix, i, j);
            }
        }
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                result = Math.max(result, path[i][j]);
            }
        }
        return result;
    }

    public void dfs(int[][] matrix, int i, int j) {
        
    }

}
