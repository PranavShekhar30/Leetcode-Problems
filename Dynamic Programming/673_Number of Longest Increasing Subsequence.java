TC: O(N^2);
SC: O(N);

class Solution {
    public int findNumberOfLIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int n = nums.length;
        
        int length[] = new int[n];
        int count[] = new int[n];
        
        Arrays.fill(length, 1);
        Arrays.fill(count, 1);
        
        int maxLen = 1;
        
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    if(length[j] + 1 > length[i]){  // Length will increase of the sequence
                        length[i] = length[j] + 1;
                        count[i] = count[j];
                    }
                    else if(length[j] + 1 == length[i]){  // Different sequence comes into picture
                        count[i] += count[j];
                    }
                }
            }
            maxLen = Math.max(maxLen, length[i]);
        }
        
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            if(maxLen == length[i]){
                ans += count[i];
            }
        }
        return ans;
    }
}
