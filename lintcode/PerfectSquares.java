/*
 * Given a positive integer n, find the least number of 
 * perfect square numbers (for example, 1, 4, 9, 16, ...) 
 * which sum to n.

Example
Given n = 12, return 3 because 12 = 4 + 4 + 4
Given n = 13, return 2 because 13 = 4 + 9
 */
public class PerfectSquares {

    /**
     * @param n a positive integer
     * @return an integer
     */
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min, dp[i - j] + 1);
            }
            dp[i] = min;
        }
        return dp[n];
    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            if (i * i <= n) {
                dp[i * i] = 1;
            }
            if (dp[i] == 0) {
                dp[i] = Integer.MAX_VALUE;
                for (int j = 1; j <= i / 2; ++j) {
                    dp[i] = Math.min(dp[i], dp[j] + dp[i - j]);
                }
            }
        }
        return dp[n];
    }

}
