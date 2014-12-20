/*
 * Say you have an array for which the ith element is the price of a given stock 
 * on day i.

 * Design an algorithm to find the maximum profit. You may complete at most two 
 * transactions.

 * Note:
 * You may not engage in multiple transactions at the same time (ie, you must 
 * sell the stock before you buy again). 
 */

public class BestTimeToBuyAndSellStockIII {

/**************************** updated 2014.03.08 *****************************/

    public int maxProfit(int[] prices) {
        if (prices.length <= 1)
            return 0;
        int len = prices.length;
        int[] leftMax = new int[len];
        int[] rightMax = new int[len];
        int min = prices[0];
        int max = prices[len - 1];
        for (int i = 1; i < len; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[len - 1 - i]);
            leftMax[i] = Math.max(leftMax[i - 1], prices[i] - min);
            rightMax[len - 1 - i] = Math.max(rightMax[len - i], max - prices[len - 1 - i]);
        }
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            res = Math.max(res, leftMax[i] + rightMax[i]);
        }
        return res;
    }    



    public int maxProfit(int[] prices) {
        int result = 0;
        int len = prices.length;
        int[] leftMax = new int[len];
        int[] rightMax = new int[len];
        int leftMinValue = prices[0];
        int rightMaxValue = prices[len - 1];
        for (int i = 1; i < len; i++) {
            leftMinValue = Math.min(leftMinValue, prices[i]);
            rightMaxValue = Math.max(rightMaxValue, prices[len - 1 - i]);
            leftMax[i] = Math.max(leftMax[i - 1], prices[i] - leftMinValue);
            rightMax[len - 1 - i] = Math.max(rightMax[len - i], rightMaxValue - prices[len - 1 - i]);
        }
        for (int i = 0; i < len; i++) {
            result = Math.max(result, leftMax[i] + rightMax[i + 1]);
        }   
        return result;
    }

}
