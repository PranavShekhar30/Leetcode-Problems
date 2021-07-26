TC: O(N);
SC: O(1);


class Solution {
    public int maxProfit(int[] prices) {
       
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(min > prices[i]){
                min = prices[i];
            }
            else if(prices[i] - min > profit) {
                profit = prices[i] - min;
            }
        }
        return profit;
    }
}
