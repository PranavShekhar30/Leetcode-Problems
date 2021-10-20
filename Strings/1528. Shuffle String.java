class Solution {
    public String restoreString(String s, int[] indices) {
        char[] temp = new char[indices.length];
        for(int i=0; i<s.length(); i++){
            temp[indices[i]] = s.charAt(i);
        }
        return new String(temp);
    }
}
