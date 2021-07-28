class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        /// can be divided into  two subsets of negative and potive  that adds upto S
        //sum(P) - sum(N) = target
//sum(P) + sum(N) + sum(P) - sum(N) = target + sum(P) + sum(N)
                     //  2 * sum(P) = target + sum(nums)
        // so postive sum=(S+ totalsum)/2 must be even 
        //and we will find total no of ways to get this positive sum
class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum<S || (S+sum)%2 !=0){
            return 0;
        }
        int newSum = (S+sum)/2;
        int dp[] = new int[newSum+1];
        dp[0] = 1;
        for(int i=0;i<nums.length;i++){
            for(int j = newSum;j>=nums[i];j--){
                dp[j] = dp[j] + dp[j-nums[i]];
            }
        }
        return dp[newSum];
    }
}



OR 

Method 2: 2D DP

TC: O(L*N);
SC: O(L*N);

  public int findTargetSumWays(int[] nums, int S) {
        int[][] dp = new int[nums.length][2001];
        dp[0][nums[0] + 1000] = 1;
        dp[0][-nums[0] + 1000] += 1;
        for (int i = 1; i < nums.length; i++) {
            for (int sum = -1000; sum <= 1000; sum++) {
                if (dp[i - 1][sum + 1000] > 0) {
                    dp[i][sum + nums[i] + 1000] += dp[i - 1][sum + 1000];
                    dp[i][sum - nums[i] + 1000] += dp[i - 1][sum + 1000];
                }
            }
        }
        return S > 1000 ? 0 : dp[nums.length - 1][S + 1000];
    }
}

