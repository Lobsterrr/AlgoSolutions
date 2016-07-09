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

    // 11.7
    public int getHeight(int[] men, int n) {
        if (men == null || men.length == 0) {
            return 0;
        }
        int[] dp = new int[men.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < men.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (men[i] > men[j]) {
                    dp[i] = Math.max(dp[i], dp[j]);
                }
            }
        }
        return dp[men.length - 1];
    }

}
