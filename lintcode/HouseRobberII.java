/*
 * After robbing those houses on that street, the thief has found himself a new place for his thievery so that he will not get too much attention. This time, all houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, the security system for these houses remain the same as for those in the previous street.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

 Notice

This is an extension of House Robber.

Example
nums = [3,6,4], return 6
 */
public class HouseRobberII {

    /**
     * @param nums: An array of non-negative integers.
     * return: The maximum amount of money you can rob tonight
     */
    public int houseRobber2(int[] nums) {
        int sum1 = rob(nums, 0, nums.length - 2);
        int sum2 = rob(nums, 1, nums.length - 1);
    }

    public int rob(int[] nums, int start, int end) {
        int[] dp = new int[nums.length + 1];
        dp[start + 1] = nums[start];
        for (int i = start + 1; i <= end; ++i) {
            dp[i + 1] = Math.max(dp[i], dp[i - 1] + nums[i]);
        }
        return dp[nums.length];
    } 

}
