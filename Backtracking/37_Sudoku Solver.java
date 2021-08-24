class Solution {
    public void solveSudoku(char[][] board) {
        if(board == null || board.length == 0){
            return;
        }
        backtrack(board);
    }
    
    public boolean backtrack(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.'){
                    for(char c = '1'; c <= '9'; c++){   //trial. Try 1 through 9
                        if(isValid(board, i, j, c)){
                            board[i][j] = c;            //Put c for this cell
                            if(backtrack(board)){
                                return true;            //If it's the solution return true
                            }
                            else{
                                board[i][j] = '.';      //Otherwise go back
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean isValid(char[][] board, int row, int col, char c){
        for(int i = 0; i < 9; i++){
            if(board[row][i] != '.' && board[row][i] == c){     //check col
                return false;
            }
            if(board[i][col] != '.' && board[i][col] == c){     //check row
                return false;
            }
            if(board[3 * (row/3) + i/3][3 * (col/3) + i%3] != '.' && board[3 * (row/3) + i/3][3 * (col/3) + i%3] == c){   //check 3*3 block
                return false;
            }
        }
        return true;
    }
}


OR



class Solution {
    
    public void solveSudoku(char[][] board) {
        backtracking(board);
    }
    
    public boolean backtracking(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                
                // If cell is not empty, skip
                if (board[i][j] != '.') continue;
                
                // For every empty cell get arrayList of values it can be 
                ArrayList<Character> arr = validValues(board, i, j);
                
                // Loop through the valid values
                for (char c : arr) {
                    board[i][j] = c;
                    
                    // If true, then solved
                    if (backtracking(board)) {
                        return true;
                    }
                    // else, backtrack
                    else {
                        board[i][j] = '.';
                    }
                }
                return false;
            }
        } 
        return true;
    }
    
    // Returns a arraylist of possible values
    public ArrayList<Character> validValues(char[][] board, int a, int b) {
        
        // Declare all possible values
        ArrayList<Character> arr = new ArrayList<Character>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
        
        // Target value
        char target = board[a][b];
        
        // Remove row and column values
        for (int i = 0; i < 9; i++) {
            arr.remove(Character.valueOf(board[a][i]));
            arr.remove(Character.valueOf(board[i][b]));
        }
        
        // Get begining cell of the local 3x3 grid
        int row = (a / 3) * 3, col = (b / 3) * 3;
        
        // Remove 3x3 grid values
        for (int i = row; i < row+3; i++) {
           for (int j = col; j < col+3; j++) {
                arr.remove(Character.valueOf(board[i][j]));
            } 
        }
        
        return arr;
    }
}
