TC: O(Log(N-k));              //To binary research and find result
SC: O(K);                     //to create the returned list.


class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int  x){
        int left = 0;
        int right = arr.length - k; 
        List<Integer> list = new ArrayList<>();
        
        while(left < right){
            int mid = left + (right-left)/2;
            if(x - arr[mid] > arr[mid + k] - x){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        for(int i = left; i < left + k; i++){
            list.add(arr[i]);
        }
        return list;
    }
}


Intuition:

The array is sorted.
If we want find the one number closest to x,
we don't have to check one by one.
it's straightforward to use binary research.

Now we want the k closest,
the logic should be similar.


Explanation:

Assume we are taking A[i] ~ A[i + k - 1].
We can binary research i
We compare the distance between x - A[mid] and A[mid + k] - x

@vincent_gui listed the following cases:
Assume A[mid] ~ A[mid + k] is sliding window

case 1: x - A[mid] < A[mid + k] - x, need to move window go left
-------x----A[mid]-----------------A[mid + k]----------

case 2: x - A[mid] < A[mid + k] - x, need to move window go left again
-------A[mid]----x-----------------A[mid + k]----------

case 3: x - A[mid] > A[mid + k] - x, need to move window go right
-------A[mid]------------------x---A[mid + k]----------

case 4: x - A[mid] > A[mid + k] - x, need to move window go right
-------A[mid]---------------------A[mid + k]----x------

If x - A[mid] > A[mid + k] - x,
it means A[mid + 1] ~ A[mid + k] is better than A[mid] ~ A[mid + k - 1],
and we have mid smaller than the right i.
So assign left = mid + 1.

Important
