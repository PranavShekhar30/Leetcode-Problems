  
TC: O(N);
SC: O(h);   {h is height of the tree}


class Solution {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
       
        if(root.left == null){
            return 1 + minDepth(root.right);   
        }
        if(root.right == null){
            return 1 + minDepth(root.left);   
        }
        int ans = 1 + Math.min(minDepth(root.left),minDepth(root.right));
        return ans;
    }
}
