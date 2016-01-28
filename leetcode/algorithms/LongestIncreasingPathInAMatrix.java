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

    int maxLen = Integer.MIN_VALUE;

    public int longestIncreasingPath(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                dfs(matrix, i, j, 1);
            }
        }
        return maxLen;
    }

    public void dfs(int[][] matrix, int i, int j, int currentLength) {
        if (!canGoOn(matrix, i, j)) {
            maxLen = Math.max(maxLen, currentLength);
            return;
        }
        int tmp = matrix[i][j];
        matrix[i][j] = Integer.MIN_VALUE;
        if (isInMatrix(matrix, i - 1, j) && tmp < matrix[i - 1][j]) {
            dfs(matrix, i - 1, j, currentLength + 1);
        }
        if (isInMatrix(matrix, i + 1, j) && tmp < matrix[i + 1][j]) {
            dfs(matrix, i + 1, j, currentLength + 1);
        }
        if (isInMatrix(matrix, i, j - 1) && tmp < matrix[i][j - 1]) {
            dfs(matrix, i, j - 1, currentLength + 1);
        }
        if (isInMatrix(matrix, i, j + 1) && tmp < matrix[i][j + 1]) {
            dfs(matrix, i, j + 1, currentLength + 1);
        }
        matrix[i][j] = tmp;
    }

    public boolean isInMatrix(int[][] matrix, int i, int j) {
        return 0 <= i && i < matrix.length && 0 <= j && j < matrix[0].length;
    }

    public boolean canGoOn(int[][] matrix, int i, int j) {
        return isInMatrix(matrix, i, j) && 
            (isInMatrix(matrix, i - 1, j) && matrix[i][j] < matrix[i - 1][j] || 
             isInMatrix(matrix, i + 1, j) && matrix[i][j] < matrix[i + 1][j] ||
             isInMatrix(matrix, i, j - 1) && matrix[i][j] < matrix[i][j - 1] ||
             isInMatrix(matrix, i, j + 1) && matrix[i][j] < matrix[i][j + 1]);
    }

}
