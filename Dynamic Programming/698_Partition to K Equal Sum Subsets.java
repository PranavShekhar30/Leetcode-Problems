class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int t = 0;
        for(int i : nums){
            t += i;
        }
        if(t % k != 0){
            return false;
        }
        int target = t/k;
        boolean visited[] = new boolean[nums.length];
        
        return partition(nums, k, 0, visited, target, 0);
    }
    
    public boolean partition(int[] nums, int k, int index, boolean[] visited, int target, int sum){
        if(k == 0){
            return true;
        }
        if(target == sum){
            return partition(nums, k-1, 0, visited, target, 0);
        }
        
        for(int i = index; i < nums.length; i++){
            if(!visited[i] && sum + nums[i] <= target){
                visited[i] = true;
                if(partition(nums, k, i + 1, visited, target, sum + nums[i])){
                return true; 
                }
              visited[i] = false;
            }
        }
        return false;
    }
}

