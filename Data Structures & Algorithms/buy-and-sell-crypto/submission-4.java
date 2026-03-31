class Solution {
    public int maxProfit(int[] prices) {
        int min_price_so_far = 100; // start with max possible
        int maxProfit = 0;

        for (int price : prices) {
            int profit = price - min_price_so_far;
            maxProfit = Math.max(maxProfit, profit);
            min_price_so_far = Math.min(min_price_so_far, price); 
        }

        return maxProfit;
    }
}



