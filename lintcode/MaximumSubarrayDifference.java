/*
 *
 */
public class MaximumSubarrayDifference {

    public int maxDiffSubArrays(int[] nums) {
        return maxSubArray(nums) - minSubArray(nums);
    }

    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0, curSum = 0; i < nums.length; ++i) {
            curSum += nums[i];
            maxSum = Math.max(maxSum, curSum);
            curSum = Math.max(curSum, 0);
        }
        return maxSum;
    }

    public int minSubArray(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        for (int i = 0, curSum = 0; i < nums.length; ++i) {
            curSum += nums[i];
            minSum = Math.min(minSum, curSum);
            curSum = Math.min(curSum, 0);
        }
        return minSum;
    }

}
