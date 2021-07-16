TC: O(N);
SC: O(1);


/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr==null && q.isEmpty()){
                return root;
            }
            if(curr==null){
                q.add(null);
               continue;
            }
            else{
               curr.next = q.peek();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        
        }
        return root;
    }
}

OR

TC: O(N);
SC: O(1);

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null || root.left == null || root.right == null){
            return root;
        }
        root.left.next = root.right;
        if(root.next!=null){
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
        
        return root;
    }
}


