/*
 * Given an integer array, find a subarray with sum closest to zero. Return the indexes of the first number and last number.

Example
Given [-3, 1, 1, -3, 5], return [0, 2], [1, 3], [1, 1], [2, 2] or [0, 4].

Challenge 
O(nlogn) time
 */
public class SubarraySumClosest {

    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    public int[] subarraySumClosest(int[] nums) {
        int start = 0;
        int end = 0;
        int curStart = 0;
        int curEnd = 0;
        int closestSum = Integer.MAX_VALUE;
        for (int i = 0, curSum = 0; i < nums.length; ++i) {
            curSum += nums[i];
            if (Math.abs(curSum) < closestSum) {
                closestSum = Math.abs(curSum);
                start = curStart;
                end = i;
            }
        }
    }

}
