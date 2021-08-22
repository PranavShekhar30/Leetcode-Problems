TC:   //Our complexity analysis rests on understanding how many elements there are in generateParenthesis(n).
SC:   //This analysis is outside the scope of this article, but it turns out this is the n-th Catalan number. It is O((4^n)/n^1/2);


class Solution {
    List<String> ans = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
       backtrack(n, "", 0, 0);
        return ans;
    }
    
    public void backtrack(int max, String s, int open, int close){
        if(s.length() == 2 * max){
            ans.add(s);
        }
        if(open < max){
            backtrack(max, s + "(", open + 1, close);
        }
        if(close < open){
            backtrack(max, s + ")", open, close + 1);
        }
    }
}
