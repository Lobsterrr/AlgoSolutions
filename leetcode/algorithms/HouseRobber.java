/*
 * You are a professional robber planning to rob houses 
 * along a street. Each house has a certain amount of 
 * money stashed, the only constraint stopping you from 
 * robbing each of them is that adjacent houses have 
 * security system connected and it will automatically 
 * contact the police if two adjacent houses were 
 * broken into on the same night.

 * Given a list of non-negative integers representing 
 * the amount of money of each house, determine the 
 * maximum amount of money you can rob tonight without 
 * alerting the police.
 */

public class HouseRobber {

    public int rob(int[] num) {
        if (num.length == 0)
            return 0;
        int result = num[0];
        int pre = 0;
        for (int i = 1; i < num.length; i++) {
            int tmp = result;
            result = Math.max(result, pre + num[i]);
            pre = tmp;
        }
        return result;
    }

    public int rob(int[] num) {
        int result = 0;
        int pre = 0;
        for (int i = 0; i < num.length; i++) {
            int tmp = pre;
            pre = Math.max(pre, result);
            result = Math.max(result, tmp + num[i]);
        }
        return result;
    }
    
}
