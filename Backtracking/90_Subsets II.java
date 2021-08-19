TC: O(N * 2^N);   //  O(2^N) -  To generate all subsets 
                  //  O(N) - For copying them into output list.
SC: O(N * 2^N);   //   to keep all the subsets of length N, since each of N elements could be present or absent.


class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if(nums.length == 0){
            return ans;
        }
        Arrays.sort(nums);
        backtracking(0, nums, new ArrayList<>());
        return ans;
    }
    
    public void backtracking(int start, int[] nums, ArrayList<Integer>curr){
        ans.add(new ArrayList<Integer>(curr));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i-1] == nums[i]){
                continue;
            }
            curr.add(nums[i]);
            backtracking(i+1, nums, curr);
            curr.remove(curr.size()-1);
        }
    }
}
