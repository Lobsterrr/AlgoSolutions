/*
 * Given a 2D matrix matrix, find the sum of the elements 
 * inside the rectangle defined by (row1, col1), (row2, col2).

 * Example:
 * Given matrix = [
 *   [3, 0, 1, 4, 2],
 *   [5, 6, 3, 2, 1],
 *   [1, 2, 0, 1, 5],
 *   [4, 1, 0, 1, 7],
 *   [1, 0, 3, 0, 5]
 * ]
 * 
 * sumRegion(2, 1, 4, 3) -> 8
 * sumRegion(1, 1, 2, 2) -> 11
 * sumRegion(1, 2, 2, 4) -> 12
 * Note:
 * You may assume that the matrix does not change.
 * There are many calls to sumRegion function.
 * You may assume that row1 ¡Ü row2 and col1 ¡Ü col2.
 */
public class RangeSumQuery2DImmutable {

}

class NumMatrix {

    int[][] sum;

    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return;
        int xLen = matrix.length;
        int yLen = matrix[0].length;
        sum = new int[xLen + 1][yLen + 1];
        for (int i = 0; i < xLen; ++i) {
            for (int j = 0; j < yLen; ++j) {
                sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum[row2 + 1][col2 + 1] - sum[row1][col2 + 1] - sum[row2 + 1][col1] + sum[row1][col1];
    }

}











class NumMatrix {

    int[][] sum;

    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return;
        int xLen = matrix.length;
        int yLen = matrix[0].length;
        sum = new int[xLen][yLen];
        for (int i = 0; i < xLen; ++i) {
            for (int j = 0; j < yLen; ++j) {
                if (i == 0 && j == 0) {
                    sum[i][j] = matrix[i][j];
                } else if (i == 0 && j > 0) {
                    sum[i][j] = sum[i][j - 1] + matrix[i][j];
                } else if (i > 0 && j == 0) {
                    sum[i][j] = sum[i - 1][j] + matrix[i][j];
                } else {
                    sum[i][j] = sum[i][j - 1] + sum[i - 1][j] 
                        - sum[i - 1][j - 1] + matrix[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int result = sum[row2][col2];
        if (row1 > 0) {
            result -= sum[row1 - 1][col2];
        }
        if (col1 > 0) {
            result -= sum[row2][col1 - 1];
        }
        if (row1 > 0 && col1 > 0) {
            result += sum[row1 - 1][col1 - 1];
        }
        return result;
    }

}

// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.sumRegion(1, 2, 3, 4);
