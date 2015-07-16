/*
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

 * Solve it without division and in O(n).
 * 
 * For example, given [1,2,3,4], return [24,12,8,6].
 * 
 * Follow up:
 * Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] leftProduct = new int[len];
        int[] rightProduct = new int[len];
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                leftProduct[i] = 1;
                rightProduct[len - 1 - i] = 1;
            } else if (i == 1) {
                leftProduct[i] = nums[i - 1];
                rightProduct[len - 1 - i] = nums[len - i];
            } else {
                leftProduct[i] = nums[i - 1] * leftProduct[i - 1];
                rightProduct[len - 1 - i] = nums[len - i] * rightProduct[len - i];
            }
        }
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }
        return result;
    }

}
