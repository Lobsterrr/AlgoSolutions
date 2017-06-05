/*
Find the contiguous subarray within an array (containing at least one number) 
which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.
 */
public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        int result = Integer.MIN_VALUE;
        for (int i = 0, maxProduct = Integer.MIN_VALUE, minProduct = Integer.MAX_VALUE; i < nums.length; ++i) {
            maxProduct = Math.max(nums[i], Math.max(nums[i] * maxProduct, nums[i] * minProduct));
            minProduct = Math.min(nums[i], Math.min(nums[i] * maxProduct, nums[i] * minProduct));
            result = Math.max(result, maxProduct);
        }
        return result;
    }

}
