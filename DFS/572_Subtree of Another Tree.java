TC: O(M*N); {m AND n ARE number of Nodes in root and subroot}
SC: O(MIN(M,N));

class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null){
            return true;
        }
            if(root == null){
            return false;
        }
        else if(areIdentical(root, subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.left,subRoot);
    }
    
    
    public static boolean areIdentical(TreeNode root, TreeNode subRoot){
       if(root==null && subRoot==null){
            return true;
        }
        else if(root==null || subRoot==null){
            return true;
        }
        else if(root.val == subRoot.val){
            return areIdentical(root.left,subRoot.left) && areIdentical(root.right,subRoot.right);
        }
        
        return false;
    }
}
