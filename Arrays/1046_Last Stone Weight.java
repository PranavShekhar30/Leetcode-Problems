TC: O(N*LogN);

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            maxHeap.add(stone);
        }
        
        while(maxHeap.size() > 1){
            int stone1 = maxHeap.remove();
            int stone2 = maxHeap.remove();
            maxHeap.add(Math.abs(stone1 - stone2));
        }
        return maxHeap.remove();
    }
}
