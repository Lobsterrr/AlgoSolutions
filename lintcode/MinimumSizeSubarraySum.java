/*
 * Given an array of n positive integers and a positive integer s, 
 * find the minimal length of a subarray of which the sum ≥ s. If 
 * there isn't one, return -1 instead.

Example
Given the array [2,3,1,2,4,3] and s = 7, the subarray [4,3] has the 
minimal length under the problem constraint.

Challenge
If you have figured out the O(n) solution, try coding another 
solution of which the time complexity is O(n log n).
 */
public class MinimumSizeSubarraySum {

    /**
     * @param nums: an array of integers
     * @param s: an integer
     * @return: an integer representing the minimum size of subarray
     */
    public int minimumSize(int[] nums, int s) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            sum += nums[j++];
            if (sum >= s) {
                while (sum >= s) {
                    sum -= nums[i++];
                }
                result = Math.min(result, j - i + 1);
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public int minimumSize(int[] nums, int s) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            int sum = 0;
            for (int j = i; sum < s && j < nums.length; ++j) {
                sum += nums[j];
                if (sum >= s) {
                    result = Math.min(result, j - i + 1);
                }
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }

}
