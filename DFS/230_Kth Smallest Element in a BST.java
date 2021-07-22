Using Recusrion and Inorder Traversal

TC: O(N);   {to build a traversal}
SC: O(N);   {to keep an inorder traversal}

class Solution {
    List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {        
        inorder(root);
        return list.get(k-1);
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);     
    }
}
