class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(k, n, 1, new ArrayList<Integer>());
        return ans;
    }
    
    public void backtrack(int k, int n, int start, ArrayList<Integer> curr){
        if(k < 0 || n < 0){
            return;
        }
        if(k == 0 && n == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start; i <= 9; i++){
            curr.add(i);
            backtrack(k-1, n-i, i+1, curr);
            curr.remove(curr.size()-1);
        }
    }
}
