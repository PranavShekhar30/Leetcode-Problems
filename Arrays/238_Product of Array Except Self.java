TC: O(n)
SC: O(1);

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len];
        ans[0] = 1;
        for(int i=1;i<nums.length;i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        int right = 1;
        for(int i=len-1;i>=0;i--){
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }
        return ans;
    }
}

