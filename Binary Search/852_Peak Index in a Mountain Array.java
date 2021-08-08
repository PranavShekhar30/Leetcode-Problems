Approach 1: Linear Scan

TC: O(LogN);
SC: O(1);

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                ans = i;
            }
        }
        return ans;
    }
}


Approach 2: Binary Search:

TC: O(LogN);
SC: O(1);

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            int mid = (start + end)/2;
            if((arr[mid] > arr[mid-1]) && (arr[mid] > arr[mid+1])){
                return mid;
            }
            if(arr[mid] > arr[mid+1]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
               }
        }
        return -1;
    }
}

