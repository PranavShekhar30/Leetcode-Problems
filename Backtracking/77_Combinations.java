 class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        if(k > n){
            return ans;
        }
        backtrack(1,n,k, new ArrayList<>());
        return ans;
    }
    
    public void backtrack(int start, int n, int k, ArrayList<Integer> curr){
        if(k == 0){
            ans.add(new ArrayList<>(curr));
        }
        for(int i = start; i <= n; i++){
            curr.add(i);
            backtrack(i+1, n, k-1, curr);
            curr.remove(curr.size()-1);
        }
    }
}
