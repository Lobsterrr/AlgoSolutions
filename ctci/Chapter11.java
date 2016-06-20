public class Chapter11 {

    public int[] findElement(int[][] mat, int n, int m, int x) {
        int i = 0;
        int j = m - 1;
        while (0 <= i && i < n && 0 <= j && j < m) {
            if (mat[i][j] == x) {
                return new int[2] {i, j};
            } else if (mat[i][j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }

}
