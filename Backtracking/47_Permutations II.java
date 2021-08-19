class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtracking(ans, nums, 0);
        return ans;
    }
    
    public void backtracking(List<List<Integer>> ans, int[] nums, int start){
        if(start == nums.length){
            ans.add(toList(nums));
        }
        else{
            for(int i = start; i < nums.length; i++){
                if(i != start && !canPermutate(start, i, nums)){        // this method will chk if the number start has appeard before or not in the list of nums
                    continue;
                }
                swap(i, start, nums);
                backtracking(ans, nums, start+1);
                swap(i, start, nums);
            }
        }
    }
    public List<Integer> toList(int[] nums){
        List<Integer> res = new ArrayList<>();
        for(int i: nums){
            res.add(i);
        }
        return res;
    }
    
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public boolean canPermutate(int start, int curr, int[] nums){
        for(int i = start; i < curr; i++){
            if(nums[i] == nums[curr]){
                return false;
            }
        }
         return true;
    }
}

    
