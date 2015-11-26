/*
 *
 */
public class JumpGameII {

    public int jump(int[] A) {
        int farreach = 0;
        int count = 0;
        int end = 0;
        for (int i = 0; i < A.length - 1; ++i) {
            farreach = Math.max(farreach, i + A[i]);
            if (i >= end) {
                count++;
                end = farreach;
            }
        }
        return count;
    }

/*******************************************************************/

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
