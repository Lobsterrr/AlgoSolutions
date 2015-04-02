/*
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 * 
 */

public class HouseRobber {

    public int rob(int[] num) {
        int sum1 = num[0];
        int sum2 = num[1];
        int i = 0;
        while (i + 2 < num.length) {
            if (i + 3 < num.length) {
                i = num[i + 2] >= num[i + 3] ? i + 2 : i + 3;
            } else {
                i += 2;
            }
            sum1 += num[i];
        }
        i = 1;
        while (i + 2 < num.length) {
            if (i + 3 < num.length) {
                i = num[i + 2] >= num[i + 3] ? i + 2 : i + 3;
            } else {
                i += 2;
            }
            sum2 += num[i];
        }
        return Math.max(sum1, sum2);
    }
    
}
