/*
 * Say you have an array for which the ith element 
 * is the price of a given stock on day i.

 * Design an algorithm to find the maximum profit. 
 * You may complete at most k transactions.

 * Note:
 * You may not engage in multiple transactions at 
 * the same time (ie, you must sell the stock 
 * before you buy again).
 */
public class BestTimeToBuyAndSellStockIV {

    public int maxProfit(int k, int[] prices) {
        if (k >= prices.length / 2) {
            int result = 0;
            for (int i = 1; i < prices.length; i++) {
                result += prices[i] > prices[i - 1] ? (prices[i] - prices[i - 1]) : 0;
            }
            return result;
        }

    }

}
