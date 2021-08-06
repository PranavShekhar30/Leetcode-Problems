TC: O(N);
SC: O(N);

class Solution {
    public int getMaximumGenerated(int n) {
        if(n < 2){
            return n;
        }
        int dp[] = new int[n + 1];
        int max = -1;
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i=1; i<=n; i++){
            if(2*i <= n){
                dp[2*i] = dp[i];
                max = Math.max(max,dp[2*i]);
            }
            if(2*i + 1 <= n){
                dp[2*i + 1] = dp[i] + dp[i + 1];
                max = Math.max(max,dp[2*i + 1]);
            }
        }
        return max;
    }
}
 

OR


class Solution {
    public int getMaximumGenerated(int n) {
        if(n < 2){
            return n;
        }
        int dp[] = new int[n + 1];
        int max = -1;
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i=2; i<=n; i++){
            if(i % 2 == 0){
                dp[i] = dp[i/2];
            }else{
                dp[i] = dp[i/2] + dp[i/2 + 1];
            }
         
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
