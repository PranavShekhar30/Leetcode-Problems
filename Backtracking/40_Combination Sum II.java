TC: O(2^N);

// In the worst case, our algorithm will exhaust all possible combinations from the input array, which in total amounts to 2^N 
// The sorting will take O(N LogN)
// To sum up, the overall time complexity of the algorithm is dominated by the backtracking process, which is  O(2^N);


SC: O(N);

// We use the variable comb to keep track of the current combination we build, which requires O(N)
// In addition, we apply recursion in the algorithm, which will incur additional memory consumption in the function call stack. In the worst case, the stack will pile up to O(N) space.
// To sum up, the overall space complexity of the algorithm is O(N)+O(N)=O(N).

// Note: we did not take into account the space needed to hold the final results of combination in the above analysis.
  
 class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(0, candidates, target, new ArrayList<>());
        return ans;
    }
    
    public void backtrack(int index, int[] arr, int target, ArrayList<Integer> curr){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i = index; i < arr.length; i++){
            if(i > index && arr[i] == arr[i-1]){
                continue;
            }
            if(arr[i] > target){
                break;
            }
            curr.add(arr[i]);
            backtrack(i+1, arr, target - arr[i], curr);
            curr.remove(curr.size()-1);
        }
    } 
}
