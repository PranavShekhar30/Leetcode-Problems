TC: O(N);
SC: O(1);

// Step 1 : Put in a HashSet
// Step 2: check when i-1 is not present in the array...then iterate till i+1 is not in the array and keep a count

class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        
        int longestStreak = 0;
        
        for(int i: nums){
            if(!set.contains(i-1)){
                int currentNum = i;
                int currentStreak = 1;
                
                while(set.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
