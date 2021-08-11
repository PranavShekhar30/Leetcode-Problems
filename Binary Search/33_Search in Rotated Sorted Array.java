Method -1: Linear Search:

TC: O(N);
SC: O(1);

class Solution {
    public int search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}

Method -2: Binary Search:

TC: O(LogN);
SC: O(1);

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[left] <= nums[mid]){                          //checking if first half array is sorted if so
                if(nums[left] <= target && target < nums[mid]){   //check if target lies in the range if so
                    right = mid - 1;                              // search in first half only
                }else{                                            //else search in second half
                    left = mid + 1;
                }
            }else{                                                //if first half isn't sorted go and check for second
                if(nums[right] >= target && target > nums[mid]){  //check if target lies in second half
                    left = mid + 1;                               //if so search in second half
                }else{
                    right = mid - 1;
                } 
            }
        }
        return -1;
    }
}


