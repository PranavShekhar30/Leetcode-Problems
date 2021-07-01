
TC: O(nlogn)
SC: O(1) or O(n)
  
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ans = nums[i];
            }
        }
        return ans;
    }
}


OR


TC: O(N)
SC: O(1)
  
Floyds Tortoise and Hare (Cycle Detection)
	
  
class Solution {
       public int findDuplicate(int[] nums) {
            if (nums.length == 0){
		    return -1;
	    }
	       // Phase 1: Try to make them meet each other
	       
              int slow = nums[0], fast = nums[nums[0]];
              while (slow != fast) {
                slow = nums[slow];
                fast = nums[nums[fast]];
        }
	   
	       // Phase 2: Bring the slow pointer to the start and make them move over 1 by 1
        
	       
          slow = 0;
             while (slow != fast) {
                 slow = nums[slow];
                 fast = nums[fast];
        }
        return slow;
    }
}
