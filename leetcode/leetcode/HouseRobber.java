/*
You are a professional robber planning to rob houses along a street. Each house
has a certain amount of money stashed, the only constraint stopping you from 
robbing each of them is that adjacent houses have security system connected and
it will automatically contact the police if two adjacent houses were broken 
into on the same night.

Given a list of non-negative integers representing the amount of money of each 
house, determine the maximum amount of money you can rob tonight without 
alerting the police.
 */
public class HouseRobber {

    public int rob(int[] nums) {
        int result = 0;
        for (int i = 0, prevSum = 0; i < nums.length; ++i) {
            int tmp = prevSum;
            prevSum = Math.max(prevSum, result);
            result = Math.max(result, tmp + nums[i]);
        }
        return result;
    }

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            if (i == 0) {
                dp[i] = nums[i];
            } else if (i == 1) {
                dp[i] = Math.max(dp[i - 1], nums[i]);
            } else {
                dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
            }
        }
        return dp[nums.length - 1];
    }

}
