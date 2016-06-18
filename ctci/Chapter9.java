public class Chapter9 {

    public int countWays(int x, int y) {
        int[] dp = new int[y];
        for (int i = 0; i < x; ++i) {
            for (int j = 0; j < y; ++j) {
                if (i == 0 || j == 0) {
                    dp[j] = 1;
                } else {
                    dp[j] += dp[j - 1];
                }
            }
        }
        return dp[y - 1];
    }

}
