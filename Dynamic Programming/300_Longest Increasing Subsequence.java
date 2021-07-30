Method 1:

TC: O(N^2);
SC: O(N);

class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length <= 1){
            return nums.length;
        }
        int dp[] = new int[nums.length];
        int max  = -1;
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}


Method - 2: Using Binary Search

TC: O(N*logN);
SC: O(N);

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        if(nums.length==0) return 0;
        dp[0]=nums[0];
        int count =0;
        int i=1;
        for(int num:nums){
            if(dp[i-1]<num){
                dp[i++] = num;
                count++;
            }else{
                int pos = BinarySearch(dp,0,i-1,num);
                dp[pos] = num;
            }
        }
        return i;
        
    }
    private int BinarySearch(int[] dp, int low, int high,int target ){
        while(low<=high){
            int mid = low+(high-low)/2;
            if(dp[mid]==target){
                return mid;
            }
            else if(dp[mid]>target){
                high=mid-1;
            }else if(dp[mid]<target){
                low = mid+1;
            }
            
        }
        return low;
    }
}
