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
    }

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            dp[i] = nums[i] + (i < 2 ? 0 : dp[i - 2]);
        }
        return dp[nums.length - 1];
    }

}
