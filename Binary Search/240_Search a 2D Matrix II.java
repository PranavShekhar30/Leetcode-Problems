METHOD - 1: Traversing each row element;

TC: O(M*N);
SC: O(1);

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}

Method - 2: Using Binary Search:

TC: O();
SC: O();

