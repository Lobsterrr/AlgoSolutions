/*
Given an array of non-negative integers, you are initially positioned at the 
first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

For example:
Given array A = [2,3,1,1,4]

The minimum number of jumps to reach the last index is 2. (Jump 1 step from 
index 0 to 1, then 3 steps to the last index.)

Note:
You can assume that you can always reach the last index.
 */
public class JumpGameII {

    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j <= i + nums[i] && j < nums.length; ++j) {
                dp[j] = Math.min(dp[j], dp[i] + 1);
            }
        }
        return dp[nums.length - 1];
    }

}
