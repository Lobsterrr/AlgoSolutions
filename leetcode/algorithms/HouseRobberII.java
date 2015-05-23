/*
 * After robbing those houses on that street, the 
 * thief has found himself a new place for his 
 * thievery so that he will not get too much 
 * attention. This time, all houses at this place 
 * are arranged in a circle. That means the first 
 * house is the neighbor of the last one. 
 * Meanwhile, the security system for these 
 * houses remain the same as for those in the 
 * previous street.
 * 
 * Given a list of non-negative integers 
 * representing the amount of money of each house, 
 * determine the  * imum amount of money you can 
 * rob tonight without alerting the police.
 */
public class HouseRobberII {

    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        int pre = 0;
        int r1 = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            int tmp = r1;
            r1 = Math.max(r1, pre + nums[i]);
            pre = tmp;
        }
        int r2 = nums[1];
        pre = 0;
        for (int i = 2; i < nums.length; i++) {
            int tmp = r2;
            r2 = Math.max(r2, pre + nums[i]);
            pre = tmp;
        }
        return Math.max(r1, r2);
    }

/***********************************************************/

    public int rob(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = Math.max(result, rob(nums, i));
        }
        return result;
    }

    public int rob(int[] nums, int startPos) {
        int result = nums[startPos];
        int pre = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int tmp = result;
            result = Math.max(result, pre + nums[(i + startPos) % nums.length]);
            pre = tmp;
        }
        return result;
    }

}
