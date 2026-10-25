class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) 
        {
            sell = prices[i];
            if (sell < buy) 
                buy = sell;
            else if (sell - buy > profit)
                profit = sell - buy;
        }
        return profit;
    }
}