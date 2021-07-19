TC: O(N);
sc: O(N);


class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();
        Map<TreeNode,TreeNode> parentFinder = new HashMap<>();
        
        dfs(root,null,parentFinder);
        
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        
        q.add(target);
        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                visited.add(node);
                if(node.left!=null && !visited.contains(node.left)){
                    q.add(node.left);
                }
                 if(node.right!=null && !visited.contains(node.right)){
                    q.add(node.right);
                }
                if(parentFinder.containsKey(node) && !visited.contains(parentFinder.get(node))){
                    q.add(parentFinder.get(node));
                }
                if(level == k){
                    result.add(node.val);
                   }
            }
            level++;
        }
        return result;
            
    }
    
    public void dfs(TreeNode node, TreeNode parent, Map<TreeNode,TreeNode> parentFinder){
        if(node == null){
            return;
        }
        if(parent!=null){
            parentFinder.put(node, parent);
        }
        dfs(node.left, node, parentFinder);
        dfs(node.right, node, parentFinder);

    }
}
