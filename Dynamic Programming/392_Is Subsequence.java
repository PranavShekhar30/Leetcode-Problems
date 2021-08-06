TC: O(M*N);
SC: O(M*N);


class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        
        boolean dp[][] = new boolean[m+1][n+1];
        
        for(int j = 0; j < n+1; j++){
           dp[0][j] = true;
        }
        for(int i=1; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(i > j){
                    dp[i][j] = false;
                }
                else{
                    if(s.charAt(i-1) == t.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1];
                    }
                    else{
                        dp[i][j] = dp[i][j-1];
                    }
                }
            }
        }
        
        return dp[m][n];
    }
}
