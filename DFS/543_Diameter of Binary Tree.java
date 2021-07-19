class Solution {
    int dia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return dia -1;
    }
    
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        
         int mydia=lh+rh+1;
        if(mydia>dia){
            dia=mydia;
        }
        
        int ans = Math.max(lh,rh) +  1;
        return ans;
    }
}

