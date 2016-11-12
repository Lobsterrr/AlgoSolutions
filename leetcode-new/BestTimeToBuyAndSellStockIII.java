/*
Say you have an array for which the ith element is the price of a given stock 
on day i.

Design an algorithm to find the maximum profit. You may complete at most two 
transactions.

Note:
You may not engage in multiple transactions at the same time (ie, you must sell
the stock before you buy again).
 */
public class BestTimeToBuyAndSellStockIII {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int result = 0;
        int[] leftProfit = new int[prices.length];
        int[] rightProfit = new int[prices.length];
        for (int i = 0, leftMin = Integer.MAX_VALUE, rightMin = Integer.MAX_VALUE; i < prices.length; ++i) {
            leftMin = Math.min(leftMin, prices[i]);
        }

        return result;
    }

}
