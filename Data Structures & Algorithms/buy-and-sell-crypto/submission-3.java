class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = buy + 1;
        int maxProfit = 0;
        while(sell < prices.length) {
            // profit? 
            int profit = prices[sell] - prices[buy];
            if(profit > 0) {
                maxProfit = Math.max(profit, maxProfit);
            }
            // lower buy price?
            if(prices[buy] > prices[sell]) {
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
    }
}
// [7,1,5,3,6,4]
//minday: 1
//maxday: 

// buy: single day
// sell: a day in the future
// option to not make a trasantion, default 0
// special case: there's only one day
// max profit: 100



// brute force: calculate max profit for each day
// iterate O(N) for each O(N) O(N^2)

// find which day in the future will bring the most
// for the first element
// max sell.

// iterate the days before max sell to find 
// min buy
// O(N)

// while no profit = move left
// once there's profit
// check if profit of adjacent would be bigger, then move
// else check if any of the left ones would have higher profit
// no ? break
// yes, continue from the left


