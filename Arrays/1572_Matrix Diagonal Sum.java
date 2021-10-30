class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += mat[i][i];       // Primary diagonals are row = column 
            sum += mat[n-1-i][i];   // Secondary diagonals are row + column = n-1
        }
        return n % 2 == 0 ? sum : sum - mat[n/2][n/2];
    }
}
