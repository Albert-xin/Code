package DPSolution;

/**
 * @author Albert
 * @date 2020/5/5 - 1:49 下午
 */

/**
 * maxProfit 最大利润
 * minPrices 最低价格
 * prices[i] 第i天的价格，卖出价格
 */
public class MaxProfit {
    public static void main(String[] args) {
    }
    public int maxProfit(int[] prices) {
        int minPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minPrices = Math.min(minPrices,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i] - minPrices);
        }
        return maxProfit;
    }
}
