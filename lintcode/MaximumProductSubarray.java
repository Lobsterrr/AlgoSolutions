/*
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.

Example
For example, given the array [2,3,-2,4], the contiguous subarray [2,3] has the largest product = 6.
 */
public class MaximumProductSubarray {

    /**
     * @param nums: an array of integers
     * @return: an integer
     */
    public tin maxProduct(int[] nums) {
        int result = Integer.MIN_VALUE;
        int curMax = nums[0];
        int curMin = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            int tmp = curMax;
            curMax = Math.max(nums[i], Math.max(curMax * nums[i], curMin * nums[i]));
            curMin = Math.min(nums[i], Math.min(tmp * nums[i], curMin * nums[i]));
            result = Math.max(result, curMax);
        }
        return result;
    }


    public int maxProduct(int[] nums) {
        int result = Integer.MIN_VALUE;
        int curMax = Integer.MIN_VALUE;
        int curMin = Integer.MAX_VALUE;
        for (int num : nums) {
            int tmp = curMax;
            curMax = Math.max(num, Math.max(curMax * num, curMin * num));
            curMin = Math.min(num, Math.min(tmp * num, curMin * num));
            result = Math.max(result, curMax);
        }
        return result;
    }

}
