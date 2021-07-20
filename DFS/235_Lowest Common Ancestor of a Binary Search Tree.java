TC: O(N);  {N IS NO. OF NODES in the bst}
SC: O(N);  {This is because the maximum amount of space utilized by the recursion stack would be N since the height of a skewed BST could be N}


class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        int parentValue = root.val;
        int pValue = p.val;
        int qValue = q.val;
        
        if(pValue > parentValue && qValue > parentValue){
            return lowestCommonAncestor(root.right,p,q);
        }
        if(pValue < parentValue && qValue < parentValue){
            return lowestCommonAncestor(root.left,p,q);
        }
        return root;
    }
}


