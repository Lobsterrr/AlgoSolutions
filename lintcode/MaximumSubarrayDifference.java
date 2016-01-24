/*
 *
 */
public class MaximumSubarrayDifference {

/*****************************************************************************/

    // O(n^2) time, O(1) space.
    public int maxDiffSubArrays(int[] nums) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; ++i) {
            int tmpMaxDiff = Math.max(Math.abs(maxSubArray(nums, 0, i) - minSubArray(nums, i + 1, nums.length - 1)), 
                    Math.abs(minSubArray(nums, 0, i) - maxSubArray(nums, i + 1, nums.length - 1)));
            result = Math.max(result, tmpMaxDiff);
        }
        return result;
    }

    public int maxSubArray(int[] nums, int low, int high) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = low, curSum = 0; i <= high; ++i) {
            curSum += nums[i];
            maxSum = Math.max(maxSum, curSum);
            curSum = Math.max(curSum, 0);
        }
        return maxSum;
    }

    public int minSubArray(int[] nums, int low, int high) {
        int minSum = Integer.MAX_VALUE;
        for (int i = low, curSum = 0; i <= high; ++i) {
            curSum += nums[i];
            minSum = Math.min(minSum, curSum);
            curSum = Math.min(curSum, 0);
        }
        return minSum;
    }

}
