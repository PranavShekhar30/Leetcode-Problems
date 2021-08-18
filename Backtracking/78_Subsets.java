TC: O(N * 2^N) 
Details - O(2^N) -  To generate all subsets 
          O(N) - For copying them into output list.

SC: O(N * 2^N) to keep all the subsets of length N, since each of N elements could be present or absent. //Check am==may b O(N);
  
class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsets(int[] nums) { 
        if(nums.length == 0){
            return ans;
        }
        backtracking(0, nums, new ArrayList<Integer>());
        return ans;
    }
    
    public void backtracking(int start, int[] nums, ArrayList<Integer> curr){
        ans.add(new ArrayList<Integer>(curr));
        for(int i = start; i < nums.length; i++){
            curr.add(nums[i]);
            backtracking(i + 1, nums, curr);
            curr.remove(curr.size()- 1);
        }
    }
}
  
