/*
 *
 */
public class RangeSumQuery2DImmutable {

}

class NumMatrix {

    int[][] matrix;
    int[][] sum;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
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
                    sum[i][j] = sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1] + matrix[i][j];
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
