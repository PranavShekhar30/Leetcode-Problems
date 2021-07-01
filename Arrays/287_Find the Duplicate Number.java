TC: O(N)
SC: O(1)
  
Floyd's Tortoise and Hare (Cycle Detection)
  
  class Solution {
       public int findDuplicate(int[] nums) {
        int fastPointer = 0, slowPointer = 0;
        
		// Phase 1: Try to make them meet each other
    do
        {
            fastPointer = nums[nums[fastPointer]];
            slowPointer = nums[slowPointer];
        }
        while (fastPointer != slowPointer);
        
	// Phase 2: Bring the slow pointer to the start and make them move over 1 by 1
        
           slowPointer = 0;
        while (slowPointer != fastPointer) {
            slowPointer = nums[slowPointer];
            fastPointer = nums[fastPointer];
        }
        
        return slowPointer;
    }

}

OR

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
