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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> bfs = new ArrayList<>();
        if(root==null){
            return bfs;
        }
      
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
      
        while(!q.isEmpty()){
            int size = q.size();
            
            List<Integer> currlevel = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp = q.remove();
              
                if(temp.left!=null){
                    q.add(temp.left);
                }
                 if(temp.right!=null){
                    q.add(temp.right);
                }
                if(level%2==0){
                    currlevel.add(temp.val);
                }
                else{
                    currlevel.add(0,temp.val);
                }
            }
            level++;
            bfs.add(currlevel);
        }
        return bfs;
    }
}
