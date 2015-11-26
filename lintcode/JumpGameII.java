/*
 *
 */
public class JumpGameII {

    public int jump(int[] A) {
        int[] dp = new int[A.length];
        for (int i = 0; i < A.length; ++i) {
            for (int j = i + 1; j < A.length && j <= i + A[i]; ++j) {
                if (dp[j] == 0) {
                    dp[j] = dp[i] + 1;
                } else {
                    dp[j] = Math.min(dp[j], dp[i] + 1);
                }
            }
        }
        return dp[A.length - 1];
    }

}
