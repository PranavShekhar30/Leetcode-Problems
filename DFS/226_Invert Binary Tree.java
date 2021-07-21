TC: O(N);
SC: O(N);   {Because of recursion, O(h) function calls will be placed on the stack in the worst case, where h is the height of the tree. Because h ∈ O(n), the space complexity is O(n)}


class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
     TreeNode left = invertTree(root.left);
     TreeNode right = invertTree(root.right);
        
        root.left = right;
        root.right = left;
        
        return root;
    }
}
