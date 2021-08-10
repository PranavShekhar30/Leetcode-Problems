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

TC: O(N * LogN);
SC: O(1)
    
class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}


Method - 3: Using Binary Search:

TC: O(LogN);
SC: O(1);

class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
         if(nums.length == 1){
            return nums[0];
        }
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
       
           if(mid > 0 && nums[mid] < nums[mid - 1]){
              return nums[mid];
           }
           else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){
              left = mid + 1;
           }
           else{
              right = mid -1;
           }
        }
        return nums[left];
    }
}
