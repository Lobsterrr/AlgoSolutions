/*
 * Write an efficient algorithm that searches for a value in an m x n 
 * matrix. This matrix has the following properties:

 * Integers in each row are sorted in ascending from left to right.
 * Integers in each column are sorted in ascending from top to bottom.
 * For example,
 * 
 * Consider the following matrix:
 * 
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * Given target = 5, return true.
 * 
 * Given target = 20, return false.
 */
public class SearchA2DMatrixII {

    // O(m + n)
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        while (0 <= i && j < matrix[0].length && matrix[i][j] != target) {
            if (matrix[i][j] < target)
                j++;
            else
                i--;
        }
        return 0 <= i && j < matrix[0].length && matrix[i][j] == target;
    }

/*****************************************************************************/
    // TODO
    public boolean searchMatrix(int[][] matrix, int target) {
        
    }

    public boolean binarySearch(int[] matrix, int target, int rowLow, int rowHigh, int colLow, int colHigh) {
        int row = rowLow + (rowHigh - rowLow) / 2;
        int j = colLow + (colHigh - colLow) / 2;
        if (matrix[row][j] == target)
            return true;
        while () {
            if (matrix[row][j] == target)
                return true;
            else if (matrix
        }
    }

}
