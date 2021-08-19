Method -1:

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

OR

Method 2:

TC: O(N! * N);
SC: O(N);

class Solution{
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        backtracking(ans, nums, 0);
        return ans;
    }
    
    public void backtracking(List<List<Integer>> ans, int[] nums, int start){
        if(start == nums.length){
            ans.add(toList(nums));
        }
        else{
            for(int i = start; i < nums.length; i++){
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
}

    
