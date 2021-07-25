TC: O(N)      {N is no. of nodes in the Binary Tree}
SC: O(H)      {H is the height of the tree}


class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }
    private int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = Math.max(0,dfs(root.left));
        int right = Math.max(0,dfs(root.right));
        
        max = Math.max(max, left + right + root.val);
        return Math.max(left,right) + root.val;
    }
}
