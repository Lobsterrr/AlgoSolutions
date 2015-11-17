/*
 *
 */
public class BestTimeToBuyAndSellStock {

    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1)
            return 0;
        int result = 0;
        int leftMin = prices[0];
        for (int i = 1; i < prices.length; ++i) {
            result = Math.max(result, prices[i] - leftMin);
            leftMin = Math.min(leftMin, prices[i]);
        }
        return result;
    }

}
