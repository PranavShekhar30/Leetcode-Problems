TC: O(n);
SC: O(1);

Using XOR as xor of 2 same numbers gives 0(2^2=0) and xor of 2 numbers (x^0=x).
  
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
