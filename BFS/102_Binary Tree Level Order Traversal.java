/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> bfs = new ArrayList<>();
        if(root==null){
            return bfs;
        } 
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> currlevel = new ArrayList<>();
          for(int i=0;i<n;i++){
                TreeNode temp = q.remove();
                currlevel.add(temp.val);
                if(temp.left!=null){
                    q.add(root.left);
                }
                 if(temp.right!=null){
                    q.add(root.right);
                }
         
            }  
            bfs.add(currlevel);
        }
        return bfs;
    }
}
    
  
