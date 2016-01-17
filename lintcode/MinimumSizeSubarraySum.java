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
    // O(n) time, O(1) space.
    public int minimumSize(int[] nums, int s) {
        int result = Integer.MAX_VALUE;
        for (int i = 0, j = 0, sum = 0; i < nums.length; ++i) {
            sum += nums[i];
            while (sum >= s) {
                sum -= nums[j++];
                result = Math.min(result, i - j + 2);
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    // O(nlgn) time, O(n) space.
    public int minimumSize(int[] nums, int s) {
        int[] sums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; ++i) {
            sums[i + 1] = sums[i] + nums[i];
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length; ++i) {
            int high = findRight(i, nums.length, sums, s);
            result = Math.min(result, high - i + 1);
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public int findRight(int low, int high, int[] sums, int s) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sums[mid] >= s) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low; 
    }

}
