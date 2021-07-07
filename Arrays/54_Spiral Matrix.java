TC: O(N);
SC: O(1);


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return list;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        
        int top = 0;
        int left = 0;
        int down = m-1;
        int right = n-1;
        
      while(true){
          
          for(int i=left;i<=right;i++){
              list.add(matrix[top][i]);
          }
          top++;
           if(top > down){
               break;
           }
          for(int i=top;i<=down;i++){
              list.add(matrix[i][right]);
          }
          right--;
          if(right < left){
              break;
          }
          for(int i=right;i>=left;i--){
              list.add(matrix[down][i]);
          }
           down--; 
           if(down < top){
               break;
           }
          for(int i=down;i>=top;i--){
              list.add(matrix[i][left]);  
          }
        left++;
           if(left > right) {
               break;
           }
          
      }
  
        return list;
    }
}
