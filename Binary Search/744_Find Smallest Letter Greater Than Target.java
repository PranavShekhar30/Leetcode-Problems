Method - I: Using Linear Search: [Since the list is sorted we can simply check if the current val is greater than target. As a result when the condition is met the current value will always be the minimum value greater than target.
If we reach the end of the letters array it indicates that no values are greater than target, since the list wraps around this means that the first element in the letters array must be the minimum value "greater" than target since all other values in the sorted array will be larger than the first value.]

TC: O(N);
SC: O(1);

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       for(char i = 0; i < letters.length; i++){
           if(letters[i] > target){
               return letters[i];
           }
       }
        return letters[0];
    }
}


Method - II: Using Binary Search:

TC: O(logN);
SC: O(1);

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        
        while(start <= end){
            int mid = (start + end)/2;
            if(letters[mid] <= target ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
}
