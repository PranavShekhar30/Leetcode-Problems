Method - I:

TC: O(N^2);
SC: O(N);

class Solution {
    int count = 0;
    List<Integer> path = new ArrayList<>();
    public int pathSum(TreeNode root, int targetSum) {
        getSum(root,targetSum);
        return count;
    }
    public void getSum(TreeNode root, int targetSum){
        if(root==null){
            return;
        }
        path.add(root.val);
        getSum(root.left, targetSum);
        getSum(root.right, targetSum);
        
        int temp = 0;
        for(int i=path.size()-1;i>=0;i--){
            temp += path.get(i);
                if(temp == targetSum){
                    count++;
                }
        }
        path.remove(path.size()-1);
        
    }
}

Method - 2:

TC: O(N^2);
SC: O(1);


class Solution {
    int total = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
            findPathSum(root,targetSum,0);
            pathSum(root.left,targetSum);
            pathSum(root.right,targetSum);
            return total;
     
    }
    
    public void findPathSum(TreeNode root, int targetSum, int currSum){
        if(root==null){
            return;
        }
        currSum +=root.val;
        if(currSum == targetSum){
            total++;
        }
        findPathSum(root.left, targetSum, currSum);
        findPathSum(root.right, targetSum, currSum);
  
    }
}

