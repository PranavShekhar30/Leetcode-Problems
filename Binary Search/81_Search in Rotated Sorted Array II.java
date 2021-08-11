TC: O(N);
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
                left++;
            }
            else if(target < nums[right]){
                right--;
            }
        }
        return false;
    }
}
