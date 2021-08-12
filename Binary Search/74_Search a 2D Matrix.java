Method - 1:
TC: O(M*N);
SC: O(1);

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}


Method -2: Using Binary Search

TC: O(log(n*m);
SC: O(1);

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        
        int start = 0;
        int end = n*m-1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            int mid_element = matrix[mid/n][mid%n];         // mid/column length & mid%column length gives index of mid_element
            if(target == mid_element){
                return true;
            }else if(target < mid_element){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
}
