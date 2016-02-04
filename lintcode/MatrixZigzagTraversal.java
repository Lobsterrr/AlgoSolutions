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
        int xLen = matrix.length;
        if (xLen == 0) {
            return null;
        }
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
                if (i < xLen) {
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
