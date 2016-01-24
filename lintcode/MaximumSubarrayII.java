/*
 * Given an array of integers, find two non-overlapping subarrays which have the largest sum.
The number in each subarray should be contiguous.
Return the largest sum.

Example
For given [1, 3, -1, 2, -1, 2], the two subarrays are [1, 3] and [2, -1, 2] or [1, 3, -1, 2] and [2], they both have the largest sum 7.

Note
The subarray should contain at least one number

Challenge
Can you do it in time complexity O(n) ?
 */
public class MaximumSubarrayII {

    /**
     * @param nums: A list of integers
     * @return: An integer denotes the sum of max two non-overlapping subarrays
     */
    public int maxTwoSubArrays(ArrayList<Integer> nums) {
        int[] leftMax = new int[nums.size()];
        int[] rightMax = new int[nums.size()];
        for (int i = 0, leftLocalMax = 0, rightLocalMax = 0; i < nums.size(); ++i) {
            leftLocalMax += nums.get(i);
            rightLocalMax += nums.get(nums.size() - 1 - i);
            leftMax[i] = Math.max(i == 0 ? Integer.MIN_VALUE : leftMax[i - 1], leftLocalMax);
            rightMax[nums.size() - 1 - i] = Math.max(i == 0 ? Integer.MIN_VALUE : rightMax[nums.size() - i], rightLocalMax);
            leftLocalMax = Math.max(leftLocalMax, 0);
            rightLocalMax = Math.max(rightLocalMax, 0);
        }
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size() - 1; ++i) {
            result = Math.max(result, leftMax[i] + rightMax[i + 1]);
        }
        return result;
    }

}
