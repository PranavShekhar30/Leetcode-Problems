TC: O(2^T * K);   // taget comes down to 10, 9, 8....2,1 as 1^10 has to reach 1^10
SC: O(K*N);       //Can't predict, depends on number of combinations


class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0, candidates, target, new ArrayList<Integer>());
        return ans;
    }
    
    public void backtrack(int index, int[] arr, int target, ArrayList<Integer> curr){
        if(index == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }
        
        if(arr[index] <= target){
            curr.add(arr[index]);
            backtrack(index, arr, target - arr[index], curr);
            curr.remove(curr.size()-1);
        }
        backtrack(index+1, arr, target , curr);
    }
}
