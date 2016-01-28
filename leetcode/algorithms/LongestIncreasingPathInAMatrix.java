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
        
    }

    public void dfs(int[][] matrix, int i, int j, int currentLength) {
        if (isInMatrix(matrix, i, j) {
            int tmp = matrix[i][j];
            matrix[i][j] = Integer.MIN_VALUE;
            
        }
    }

    public boolean isInMatrix(int[][] matrix, int i, int j) {
        return 0 <= i && i < matrix.length && 0 <= j && j < matrix[0].length;
    }

}
