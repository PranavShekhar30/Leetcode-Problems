TC: O(N * 2^N);
SC: O(N);

class Solution {
    List<List<String>> ans = new ArrayList<List<String>>();
    public List<List<String>> partition(String s) {
        backtrack(0, s, new ArrayList<String>());
        return ans;
    }
    
    public void backtrack(int start, String s, ArrayList<String> curr){
        if(s.length() == start){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start; i < s.length(); i++){
            if(isPalindrome(s, start, i)){
                curr.add(s.substring(start, i+1));
                backtrack(i + 1, s, curr);
                curr.remove(curr.size() - 1);
            }
        }
    }
    
    boolean isPalindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
       return true;
    }
}
