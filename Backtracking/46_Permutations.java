class Solution{
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        backtracking(ans,nums, new ArrayList<Integer>());
        return ans;
    }
    
    public void backtracking(List<List<Integer>> ans, int[] nums, ArrayList<Integer> curr){
        if(curr.size() == nums.length){
            ans.add(new ArrayList<Integer>(curr));
        }
        for(int i = 0; i < nums.length; i++){
            if(curr.contains(nums[i])){
                continue;
            }
            curr.add(nums[i]);
            backtracking(ans, nums, curr);
            curr.remove(curr.size()-1);
        }
    }
}
