TC: O(N); //for worst case,  [Best case me O(logN)];
SC: O(1);

class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            if(nums[left] == target || nums[right] == target){
                return true;
            }
            else if(target > nums[left]){
                while(left < right && nums[left] == nums[left+1]){   //To skip duplicates
                    left++;
                }
                left++;
            }
            else if(target < nums[right]){
                while(left < right && nums[right] == nums[right-1]){    //To skip duplicates
                    right--;
                }
                right--;
            }
            else{
                break;
            }
        }
        return false;
    }
}
