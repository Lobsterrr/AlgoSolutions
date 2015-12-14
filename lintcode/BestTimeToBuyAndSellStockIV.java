/*
 *
 */
public class BestTimeToBuyAndSellStockIV {

    public int maxProfit(int k, int[] prices) {
        int[] buy = new int[k];
        int[] sell = new int[k];
        Arrays.fill(buy, Integer.MIN_VALUE);
        for (int i = 0; i < prices.length; ++i) {
            for (int j = k - 1; j >= 0; --j) {
                sell[j] = Math.max(sell[j], buy[j] + prices[i]);
                buy[j] = Math.max(buy[j], j > 0 ? sell[j - 1] : 0 - prices[i]);
            }
        }
        return sell[k - 1];
    }

}
