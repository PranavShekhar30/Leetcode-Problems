Method - I:

TC: O(n);
SC: O(1); {Chances of Overflow if number is very large}

class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i: nums){
            sum = sum + i;
        }
       int n = nums.length+1;
        return ((n*(n-1))/2) - sum;
    }
}

Method - II : Using Bit Manipulation XOR

TC: O(n);
SC: O(1);

class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for(int i=0;i<nums.length;i++){
            missing = missing ^ i ^ nums[i];
        }
        return missing;
    }
}
