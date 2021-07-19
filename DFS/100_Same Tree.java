Recursion

TC: O(N);
SC: O(N); {Worst case id o(n) for completely unbalanced tree and to keep a recursion stack. Best case id O(logn) for completely balanced tree}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p==null && q==null)){
            return true;
        }
          if((p==null) || (q==null)){
              return false;
          }
           if(p.val!=q.val){
               return false;
           }
           return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
