METHOD - 1: DP Approach
TC: O(N^2);
SC: O(N^2);

class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        
        if(n <= 0){
            return 0;
        }
        boolean dp[][] = new boolean[n][n];
        
        // Base Case 1: Single letter substrings
        for(int i = 0; i < n; i++){
            dp[i][i] = true;
            ans++;
        }
        
        //Base Case 2: Double letter sunstrings
        for(int i = 0; i < n - 1; i++){
            dp[i][i + 1] = (s.charAt(i) == s.charAt(i + 1));  
            if(dp[i][i + 1] == true){
                ans++;
            }
        }
        
        // General Case: String length Greater than 2
        for(int len = 3; len <= n; len++){
            for(int i = 0, j = i + len - 1; j < n; i++, j++){
                dp[i][j] = dp[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));
                if(dp[i][j] == true){
                    ans++;
                }
            }
        }
        return ans;
        
    }
}


METHOD - 2: Expanding around centers and count
TC: O(N^2);
SC: O(1);

class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        if(n <= 0){
            return 0;
        }
        char[] c = s.toCharArray();
        
        for(int i = 0; i < n; i++){
            // Odd and Even lengths
            // Center for odd: (i, i);
            // Center for even: (i, i + 1);
            ans += ExpandAroundMiddle(i, i, c);
            ans += ExpandAroundMiddle(i, i + 1, c);
        }
        return ans;
    }
    
    public int ExpandAroundMiddle(int start, int end, char[] c){
        int count = 0;
        while(start >= 0 && end < c.length && c[start] == c[end]){
            start--;
            end++;
            count++;
        }
        return count;
    }
}
