BFS: Level Order Traversal

TC: O(N);
SC: O(N);

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        
        if(root==null){
            return result; 
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
        
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
             
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                     q.add(curr.right);
                }
                
                if(i == size - 1){
                    result.add(curr.val);
                }
            } 
        }
        return result;
    }
    
}
