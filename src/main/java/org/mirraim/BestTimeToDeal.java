package org.mirraim;

public class BestTimeToDeal {

    public int maxProfit(int[] prices) {
        int agg = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i+1]) {
                agg += prices[i + 1] - prices[i];
            }
        }
        return agg;
    }
}
