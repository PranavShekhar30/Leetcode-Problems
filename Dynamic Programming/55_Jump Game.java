TC: O(N);
SC: O(1);

class Solution {
    public boolean canJump(int[] nums) {
       if(nums == null || nums.length == 0) 
           return false; 
       boolean[] dp = new boolean[nums.length];
       dp[nums.length - 1] = true; 
       for(int i = nums.length - 1; i >=0; i--) {
           for(int j = 1; j <= nums[i] && i + j < nums.length; j++) {
               dp[i] = dp[i] || dp[i+j];
           }
       }
        return dp[0];
    }
}
