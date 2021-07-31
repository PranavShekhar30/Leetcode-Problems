TC: O(N*T);     {T IS TARGET, N IS NUMS.LENGTH()}
SC: O(N);

class Solution {
    int count = 0;
    public int combinationSum4(int[] nums, int target) {
    if(nums == null  || nums.length < 1){
        return 0;
    }
        int dp[] = new int[target + 1];
        dp[0] = 0;
        for(int i = 1; i <= target; i++){
            for(int j = 0; j < nums.length; j++){
                if(i > nums[j]){
                    dp[i] = dp[i] + dp[i-nums[j]];
                }
                else if(i == nums[j]){
                    dp[i] = dp[i] + 1;
                  }
              }
        }
        return dp[target];
    }
}
