class Solution {
    public int maxDepth(String s) {
      int ans = 0; 
      int open = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                open++;                
            }
            if(s.charAt(i) == ')'){
                open--;                
            }        
            ans = Math.max(ans, open);
  
        }
        return ans;
    }
}
