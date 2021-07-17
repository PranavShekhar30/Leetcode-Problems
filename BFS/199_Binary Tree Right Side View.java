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

OR

Method - 2: Using Recursive approach

TC: O(n);
SC: O(n);


class Solution {
     List<Integer> result = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
       
        
        levelOrder(root,0);
        return result;
    }
    
    public void levelOrder(TreeNode node, int level){
        if(node==null){
            return;
        }
        
        if(result.size()==level){
            result.add(node.val);
        }
        levelOrder(node.right,level+1);
        levelOrder(node.left,level+1);

    }
}
