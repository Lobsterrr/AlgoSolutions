/*
 * There are n coins with different value in a line. Two players take turns to take one or two coins from left side until there are no more coins left. The player who take the coins with the most value wins.

Could you please decide the first player will win or lose?

Example
Given values array A = [1,2,2], return true.

Given A = [1,2,4], return false.
 */
public class CoinsInALineII {

    /**
     * @param values: an array of integers
     * @return: a boolean which equals to true if the first player will win
     */
    public boolean firstWillWin(int[] values) {
        if (values.length <= 2) {
            return true;
        }
        int[] dp = new int[values.length + 1];
        dp[values.length] = 0;
        dp[values.length - 1] = values[values.length - 1];
        dp[values.length - 2] = values[values.length - 1] + values[values.length - 2];
        dp[values.length - 3] = values[values.length - 3] + values[values.length - 2];
        for (int i = values.length - 4; i >= 0; --i) {
            int value1 = values[i] + Math.min(dp[i + 2], dp[i + 3]);
            int value2 = values[i] + values[i + 1] + Math.min(dp[i + 3], dp[i + 4]);
            dp[i] = Math.max(value1, value2);
        }
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return dp[0] > sum - dp[0];
    }

}
