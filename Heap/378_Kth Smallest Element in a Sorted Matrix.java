TC: O(N logK);
SC: O(K):

* class Solution {
     public int kthSmallest(int[][] matrix, int k) {
         PriorityQueue<Integer> pq; //maxHeap;
         for(int i=0; i<matrix.length; i++){
             for(int j=0; j<matrix[0].length; j++){
                 pq.push(matrix[i][j]);
                 if(pq.size > k){
                     pq.pop();
                 }
             }
         }
         return pq.pop();
     }
 }
 * Correction needed
