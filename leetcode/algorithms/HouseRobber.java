/*
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 * 
 */

public class HouseRobber {

    public int rob(int[] num) {
        if (num.length == 0)
            return 0;
        int[] dp = new int[num.length];
        boolean[] isUsed = new boolean[num.length];
        for (int i = 0; i < num.length; i++) {
            if (i == 0) {
                dp[i] += num[i];
                isUsed[i] = true;
            } else if (i == 1) {
                if (num[i] > num[i - 1]) {
                    dp[i] = num[i];
                    isUsed[i] = true;
                } else {
                    dp[i] = dp[i - 1];
                }
            } else {
                if (!isUsed[i - 1]) {
                    dp[i] = dp[i - 1] + num[i];
                    isUsed[i] = true;
                } else {
                    if (dp[i - 1] >= dp[i - 2] + num[i]) {
                        dp[i] = dp[i - 1];
                    } else {
                        dp[i] = dp[i - 2] + num[i];
                        isUsed[i] = true;
                    }
                }
            }
        }
        return dp[num.length - 1];
    }
    
}
