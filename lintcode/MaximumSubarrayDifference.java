/*
 * Given an array with integers.

Find two non-overlapping subarrays A and B, which |SUM(A) - SUM(B)| is the 
largest.

Return the largest difference.

Example
For [1, 2, -3, 1], return 6.

Note
The subarray should contain at least one number

Challenge
O(n) time and O(n) space.
 */
public class MaximumSubarrayDifference {

    /**
     * @param nums: A list of integers
     * @return: An integer indicate the value of maximum difference between two
     *          Subarrays
     */
    // O(n) time, O(n) space.
    public int maxDiffSubArrays(int[] nums) {
        int[] leftMax = new int[nums.length];
        int[] leftMin = new int[nums.length];
        int[] rightMax = new int[nums.length];
        int[] rightMin = new int[nums.length];
        int globalMax = Integer.MIN_VALUE;
        int globalMin = Integer.MAX_VALUE;
        for (int i = 0, localMax = 0, localMin = 0; i < nums.length; ++i) {
            localMax += nums[i];
            globalMax = Math.max(globalMax, localMax);
            localMax = Math.max(localMax, 0);
            leftMax[i] = globalMax;

            localMin += nums[i];
            globalMin = Math.min(globalMin, localMin);
            localMin = Math.min(localMin, 0);
            leftMin[i] = globalMin;
        }

        globalMax = Integer.MIN_VALUE;
        globalMin = Integer.MAX_VALUE;
        for (int i = nums.length - 1, localMax = 0, localMin = 0; i >= 0; --i) {
            localMax += nums[i];
            globalMax = Math.max(globalMax, localMax);
            localMax = Math.max(localMax, 0);
            rightMax[i] = globalMax;

            localMin += nums[i];
            globalMin = Math.min(globalMin, localMin);
            localMin = Math.min(localMin, 0);
            rightMin[i] = globalMin;
        }
        
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; ++i) {
            result = Math.max(result, Math.abs(leftMax[i] - rightMin[i + 1]));
            result = Math.max(result, Math.abs(leftMin[i] - rightMax[i + 1]));
        }
        return result;
    }

/*****************************************************************************/

    // O(n^2) time, O(1) space.
    public int maxDiffSubArrays(int[] nums) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; ++i) {
            int tmpMaxDiff = Math.max(Math.abs(maxSubArray(nums, 0, i) - 
                        minSubArray(nums, i + 1, nums.length - 1)), 
                    Math.abs(minSubArray(nums, 0, i) - 
                        maxSubArray(nums, i + 1, nums.length - 1)));
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
