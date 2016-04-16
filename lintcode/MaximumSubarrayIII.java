/*
 * Given an array of integers and a number k, find k non-overlapping subarrays 
 * which have the largest sum.

The number in each subarray should be contiguous.

Return the largest sum.

Example
Given [-1,4,-2,3,-2,3], k=2, return 8

Note
The subarray should contain at least one number
 */
public class MaximumSubarrayIII {

    /**
     * @param nums: A list of integers
     * @param k: An integer denote to find k non-overlapping subarrays
     * @return: An integer denote the sum of max k non-overlapping subarrays
     */
    public int maxSubArray(int[] nums, int k) {
        if (nums.length < k) {
            return 0;
        }
        int len = nums.length;
        int[][] dp = new int[k + 1][len + 1];
        for (int i = 1; i <= k; ++i) {
            for (int j = i; j <= len; ++j) {
                dp[i][j] = Integer.MIN_VALUE;
                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + maxSubArray(nums, j - 1, len - 1));
            }
        }
        return dp[k][len];
    }

    public int maxSubArray(int[] nums, int start, int end) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = start, curSum = 0; i <= end; ++i) {
            curSum += nums[i];
            maxSum = Math.max(maxSum, curSum);
            curSum = Math.max(0, curSum);
        }
        return maxSum;
    }

}
