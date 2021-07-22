class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       dfs(root,0,targetSum,path);
       return result;
    }
    public void dfs(TreeNode root, int sum, int targetSum, List<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.val);
        sum = sum + root.val;
        if(root.left==null && root.right==null){
            if(sum == targetSum){
                result.add(new ArrayList<>(path));
            }
        }
        dfs(root.left,sum,targetSum,path);
        dfs(root.right,sum,targetSum,path);
        path.remove(path.size()-1);
    }
}
