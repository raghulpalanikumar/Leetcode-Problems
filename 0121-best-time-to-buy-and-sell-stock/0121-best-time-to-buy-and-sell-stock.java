class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            // Update the min price if we find a smaller one
            if (prices[i] < min) {
                min = prices[i];
            }
            // Calculate profit with current price and min so far
            int profit = prices[i] - min;
            // Keep track of the maximum profit
            max = Math.max(max, profit);
        }
        return max;
    }
}
