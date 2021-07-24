TC: O(N);
SC: O(N);

class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    int preorderIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return buildTree(preorder, inorder, 0, inorder.length-1);
    }
    private TreeNode buildTree(int[] preorder, int[] inorder, int start, int end){
        if(start > end){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preorderIndex++]);
        if(root==null){
            return null;
        }
        if(start==end){
            return root;
        }
        int index = map.get(root.val);
        
        root.left = buildTree(preorder,inorder,start,index-1);
        root.right = buildTree(preorder,inorder,index+1,end);
        
        return root;
        
    }
}
