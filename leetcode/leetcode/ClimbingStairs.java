/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you 
climb to the top?

Note: Given n will be a positive integer.
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; ++i) {
            dp[i] = dp[i - 1] + dp[i - 1];
        }
        return dp[n];
    }

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int prev = 1;
        int cur = 2;
        for (int i = 3; i <= n; ++i) {
            cur ^= prev;
            prev ^= cur;
            cur ^= prev;
            cur += prev;
        }
        return cur;
    }

}
