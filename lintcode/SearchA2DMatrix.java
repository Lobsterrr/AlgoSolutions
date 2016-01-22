/*
 * Write an efficient algorithm that searches for a value in an m x n matrix.

This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
Example
Consider the following matrix:

[
    [1, 3, 5, 7],
    [10, 11, 16, 20],
    [23, 30, 34, 50]
]
Given target = 3, return true.

Challenge
O(log(n) + log(m)) time
 */
public class SearchA2DMatrix {

    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int xLen = matrix.length;
        int yLen = matrix[0].length;
        int low = 0;
        int high = xLen * yLen - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int x = mid / yLen;
            int y = mid % yLen;
            if (matrix[x][y] == target) {
                return true;
            }
            if (matrix[x][y] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

}
