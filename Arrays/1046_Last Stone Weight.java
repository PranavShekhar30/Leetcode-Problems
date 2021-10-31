TC: O(N*LogN);

class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0){
            return 0;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            maxHeap.add(stone);
        }
        while(maxHeap.size() > 1){
            maxHeap.offer(maxHeap.poll() - maxHeap.poll());
        }
        return maxHeap.poll();
    }
}
