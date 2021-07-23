TC: O(N);   {N is the number of nodes IN the binary tree}
SC: O(N);   {since the height of a skewed binary tree could be N}


class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        if(left!=null && right!=null){
            return root;
        }
        else if(left!=null){
            return left;
        }
        return right;
    }
}

 
