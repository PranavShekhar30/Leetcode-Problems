TC: O(N);
SC: O(N);

class Solution {
    public int maxProfit(int[] prices){
     
        int n = prices.length;
        if(n <= 1){
            return 0;
        }
        
        int dp[] = new int[n + 1];
        int max = -prices[0];
        
        for(int i = 1; i < n; i++){
            dp[i + 1] = Math.max(dp[i], max + prices[i]);
            max = Math.max((dp[i - 1] - prices[i]), max);
        }
        return dp[n];
    }
}
