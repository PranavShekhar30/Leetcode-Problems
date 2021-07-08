TC: O(N);
SC: O(1);

class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 1;
        }
    int n = nums.length;
    
    // Flag to check if array contains 1
    boolean containsOne = false;
    
    // Step 1 - Replace all -ve elements, zeroes and elements > n with 1
    for(int i=0; i<n; i++){
        if(nums[i] == 1){
            containsOne = true;
        }
        else if(nums[i] <= 0 || nums[i] > n){
            nums[i] = 1;
        }
    }
    
    // If array does not contain 1, 1 is the first missing +ve 
    if(!containsOne){
        return 1;
    }
    
    // Step 2 - Treat each of the values as index and mark it -ve if visited
    for(int i=0; i<n; i++){
        int index = Math.abs(nums[i]) - 1;
        
        if(nums[index] > 0){
            nums[index] *= -1;
        }
    }
    
    
    // Step 3 - Look for the first +ve value and return its 1-based index (1st missing +ve)
    for(int i=0; i<n; i++){
        // Arrays are 0-based index and the range +ve vals starts from 1, so add 1
        if(nums[i] > 0){
            return i+1; 
        }
    }
    
    // If not found, has to be length+1
    return n+1;
    }
}
