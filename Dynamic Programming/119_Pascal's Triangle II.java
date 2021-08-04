class Solution {
    public List<Integer> getRow(int rowIndex) {        
        Integer[] dp = new Integer[rowIndex + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        
        for(int i = 1; i <= rowIndex; i++){
            for(int j = i; j > 0; j--){
                dp[j] = dp[j] + dp[j-1];
            }
        }
        return Arrays.asList(dp);
    }
}

