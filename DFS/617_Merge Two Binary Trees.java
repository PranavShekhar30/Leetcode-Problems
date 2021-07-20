TC: O(M);   {A total of mm nodes need to be traversed. Here, mm represents the minimum number of nodes from the two given trees}
SC: O(N);   {The depth of the recursion tree can go upto m in the case of a skewed tree. In average case, depth will be O(logm)}

Recursive approach:

class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null){
            return null;
        }
        if(root1==null){
            return root2;
        }
         if(root2==null){
            return root1;
        }
        
       
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        
        return root1;
    }
}
