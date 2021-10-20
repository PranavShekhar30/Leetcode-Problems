Using 2D DP:

TC: O(N^2);   {(n×n)/2 entries in dp array of size n×n is filled once. Here, n refers to the length of nums array.}
SC: O(N^2);   {dp array of size n×n is used.}

class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int dp[][] = new int[n][n];
        
        for(int s = n; s>=0; s--){
            for(int e = s; e<n; e++){
                if(s == e){
                    dp[s][e] = nums[s];
                }
                else{
                    int a = nums[s] - dp[s+1][e];
                    int b = nums[e] - dp[s][e-1];
                    
                    dp[s][e] = Math.max(a,b);
                    
                }
            }
        }
        return dp[0][n-1] >= 0;
        
    }
}


