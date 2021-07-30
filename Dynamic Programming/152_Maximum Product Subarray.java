TC: O(N);
SC: O(1);

class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int max_TillHere = max;
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]<0){                            //Negative number
                int temp = max;
                max = Math.max(nums[i],min*nums[i]);
                min = Math.min(nums[i],temp*nums[i]);
            }
            else{                                     //Positive Number
                max = Math.max(nums[i],max*nums[i]);
                min = Math.min(nums[i],min*nums[i]);
            }
            max_TillHere = Math.max(max,max_TillHere);
        }
        return max_TillHere;
    }
}
