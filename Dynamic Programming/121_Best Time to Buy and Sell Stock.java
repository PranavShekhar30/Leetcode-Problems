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


Method - 2: Using DP


TC: O(N);
SC: O(1);
class Solution {
    public int maxProfit(int[] prices) {
 
        int n = prices.length;
        int[] dp = new int[n];
        
        dp[0]=0;
        int minValue = prices[0];
        for(int i=1; i<n; i++){
            dp[i] = Math.max(dp[i-1],prices[i] - minValue);
            minValue = Math.min(minValue,prices[i]);
        }
        return dp[n-1];
    }
}


