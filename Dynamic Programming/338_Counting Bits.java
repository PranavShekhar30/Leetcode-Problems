TC: O(N);
SC: O(N);


class Solution {
    public int[] countBits(int n) {
        int dp[] = new int[n+1];
        
        dp[0] = 0;
        for(int i=0;i<=n;i++){
            dp[i] = dp[i/2] +i%2;
        }
        return dp;
    }
}

{for odd: x/2 +1, for even: x/2}
