TC: O(N);
SC: O(N);

class Solution {
    public boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if((board[i][j] == word.charAt(0)) && searchWord(board, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean searchWord(char[][] board, int i, int j, String word, int count){
        if(count == word.length()){
            return true;
        }
        
        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count) || visited[i][j]){
            return false;
        }
        
        visited[i][j] = true;
        if(searchWord(board, i+1, j, word, count + 1) ||
           searchWord(board, i-1, j, word, count + 1) ||
           searchWord(board, i, j+1, word, count + 1) ||
           searchWord(board, i, j-1, word, count + 1)){
            return true;
        }
     
        visited[i][j] = false;
        return false;
    }
}
