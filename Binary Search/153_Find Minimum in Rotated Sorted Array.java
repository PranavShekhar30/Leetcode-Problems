Method - I:
TC: O(N);
SC: O(1);

class Solution {
    public int findMin(int[] nums) {
        int min = 5000;
        for(int i=0; i<nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }
        return min;
    }
}

Method - 2:

TC: O(LogN);
SC: O(1);

