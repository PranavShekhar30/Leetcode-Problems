Method - 1: Using Recursion


TC: O(N);
SC: O(N);


class Solution {
    public int maxSubArray(int[] nums) {
        
        int dp[] = new int[nums.length];
        
        dp[0] = nums[0];
        int maxSum = nums[0];
        for(int i=1; i<nums.length; i++){
            dp[i] = Math.max(nums[i],nums[i] + dp[i-1]);
            maxSum = Math.max(maxSum,dp[i]);
        }
        return maxSum;
    }
}

 OR
 
Method - 2 [Using Kadanes Algorithm]
 
TC: O(N);
SC: O(1);

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        
        for(int i=0; i < nums.length; i++){
            sum += nums[i];
            if(sum > max){
                max = sum;
            }if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
