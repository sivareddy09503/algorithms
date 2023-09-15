class BestTimeToBuyAndSellStock1 {
    //Best time to buy and sell stock
    //Input: prices = [7,1,5,3,6,4]
    //Output: 5
    //TC:O(n), SC:O(1)
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;
        int left = 0;
        int profit = 0;
        for(int right = 1;right < prices.length; right++) {
            if(prices[right]>prices[left]) {
                profit = Math.max(profit, prices[right] - prices[left]);
            } else {
                left = right;
            }
        }
        return profit;
    }
}