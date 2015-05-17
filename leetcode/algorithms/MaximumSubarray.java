/* Find the contiguous subarray within an array (containing at 
 * least one number) which has the largest sum.

 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 */ 
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int thisSum = 0;
        for (int i = 0; i < nums.length; i++) {
            thisSum += nums[i];
            result = Math.max(result, thisSum);
            thisSum = Math.max(thisSum, 0);
        }
        return result;
    }

/****************** Below is from wikipedia ******************/

    public int maxSubArray(int[] nums) {
        int max_so_far = nums[0];
        int max_ending_here = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max_ending_here = Math.max(0, max_ending_here) + nums[i];
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }

}
