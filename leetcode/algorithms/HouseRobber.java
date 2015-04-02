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
        int result = 0;
        boolean isPreUsed = false;
        int pre = 0;
        for (int i = 0; i < num.length; i++) {
            if (i == 0) {
                result = num[i];
                isPreUsed = true;
            } else if (i == 1) {
                if (num[i] > num[i - 1]) {
                    pre = result;
                    result = num[i];
                    isPreUsed = true;
                } else {
                    isPreUsed = false;
                }
            } else {
                if (!isPreUsed) {
                    pre = result;
                    result += num[i];
                    isPreUsed = true;
                } else {
                    if (result >= pre + num[i]) {
                        isPreUsed = false;
                    } else {
                        int tmp = result;
                        result = pre + num[i];
                        pre = tmp;
                        isPreUsed = true;
                    }
                }
            }
        }
        return result;
    }
    
}
