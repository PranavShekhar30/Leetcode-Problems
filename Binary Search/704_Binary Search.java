Using Linear Search:

TC: O(N);
SC: O(1);

class Solution {
    public int search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}


OR


Using Binary Search

TC: O(logN);
SC: O(1);

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end){
            int mid = (start + end)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
               start = mid + 1; 
            }
        }
        return -1;
    }
}
