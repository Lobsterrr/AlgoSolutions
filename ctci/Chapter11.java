public class Chapter11 {

    public int[] findElement(int[][] mat, int n, int m, int x) {
        int i = 0;
        int j = m - 1;
        while (i < n && j >= 0) {
            if (mat[i][j] == x) {
                return new int[] {i, j};
            } else if (mat[i][j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }

    // 1.5
    public int findString(String[] str, int n, String x) {
        if (str == null || str.length == 0) {
            return -1;
        }

    }

}
