/*
 * Given a matrix of m x n elements (m rows, n columns), 
 * return all elements of the matrix in ZigZag-order.

Example
Given a matrix:

[
  [1, 2,  3,  4],
  [5, 6,  7,  8],
  [9,10, 11, 12]
]
return [1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12]
 */
public class MatrixZigzagTraversal {

    /**
     * @param matrix: a matrix of integers
     * @return: an array of integers
     */ 
    public int[] printZMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            return null;
        }
        int xLen = matrix.length;
        int yLen = matrix[0].length;
        int[] result = new int[xLen * yLen];
        int index = 0;
        for (int i = 0; i < xLen + yLen - 1; ++i) {
            if (i % 2 == 0) {
                for (int row = Math.min(i, xLen - 1); row >= Math.max(0, i - yLen + 1); --row) {
                    result[index++] = matrix[row][i - row];
                }
            } else {
                for (int col = Math.min(i, yLen - 1); col >= Math.max(0, i - xLen + 1); --col) {
                    result[index++] = matrix[i - col][col];
                }
            }
        }
        return result;
    }

    public int[] printZMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            return null;
        }
        int xLen = matrix.length;
        int yLen = matrix[0].length;
        int[] result = new int[xLen * yLen];
        int i = 0;
        int j = 0;
        int k = 0;
        int count = 0;
        while (k < xLen * yLen) {
            if (count % 2 == 0) {
                while (k < xLen * yLen && i >= 0 && j < yLen) {
                    result[k++] = matrix[i--][j++];
                }
                i++;
                j--;
                if (j == yLen - 1) {
                    i++;
                } else {
                    j++;
                }
            } else {
                while (k < xLen * yLen && i < xLen && j >= 0) {
                    result[k++] = matrix[i++][j--];
                }
                i--;
                j++;
                if (i < xLen - 1) {
                    i++;
                } else {
                    j++;
                }
            }
            count++;
        }
        return result;
    }

}
