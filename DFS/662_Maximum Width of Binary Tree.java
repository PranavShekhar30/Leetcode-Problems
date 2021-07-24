TC: O(N);
SC: O(N);

Note: {Width can be seen as = index of rightmost node - index of leftmost node + 1
assign index to each node, similar as heap on a tree
root's index = 1, left child is 1 * 2, right child is 1 * 2 + 1, and so on...
To avoid Integer overflow, still need to do offset by the index of leftmost node}



class Solution {
    int max = Integer.MIN_VALUE;
    public int widthOfBinaryTree(TreeNode root) {
        dfs(root, 0 ,new ArrayList<Integer>(), 0);
        return max;
    }
    
    public void dfs(TreeNode root, int index, ArrayList<Integer> result, int level){
        if(root==null){
            return;
        }
        if(level == result.size()){
            result.add(index);
        }
        int curr = index - result.get(level) + 1;
        if(curr>max){
            max = curr;
        }
        dfs(root.left,2*index,result,level+1);
        dfs(root.right,2*index+1,result,level+1);
    }
}
