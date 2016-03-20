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
        for (int i = 0; i * i <= n; ++i) {
            dp[i * i] = 1;
        }
        for (int i = 1; i <= n; ++i) {
            for (int j = 0; j <= i - 1; ++j) {
                if (dp[i] == 0) {
                    dp[i] = dp[j] + dp[i - j];
                } else {
                    dp[i] = Math.min(dp[i], dp[j] + dp[i - j]);
                }
            }
        }
        return dp[n];
    }

}
