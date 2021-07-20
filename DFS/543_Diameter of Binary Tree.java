TC: O(N);
SC: O(N);


class Solution {
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);  
        return ans;
    }
    
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        ans = Math.max(ans,(lh+rh));
  
        return Math.max(lh,rh) +  1;
    }
}



