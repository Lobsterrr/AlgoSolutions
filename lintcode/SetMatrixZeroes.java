/*
 *
 */
public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        if (matrix.length == 0) {
            return;
        }
        List<Integer> rows = new ArrayList<Integer>();
        List<Integer> cols = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for (int row : rows) {
            for (int j = 0; j < matrix[0].length; ++j) {
                matrix[row][j] = 0;
            }
        }
        for (int col : cols) {
            for (int i = 0; i < matrix.length; ++i) {
                matrix[i][col] = 0;
            }
        }
    }

}
