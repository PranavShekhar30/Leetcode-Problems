As we walk through all elements in the array, we can use the current element as an index and flag its value (in place). All numbers are > 0, so we can use a negative number.
In the end, the indexes of all positive numbers in the array are the missing values.

The input: [4, 3, 2, 7, 8, 2, 3, 1]
Becomes: [-4, -3, -2, -7, 8, 2, -3, -1]

Starting from 1, the missing values are 5 and 6.
        
TC: O(n);
SC: O(1);


public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i : nums) {
            int index = Math.abs(i);
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }


OR



class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]>=0){
                nums[index] = nums[index] * -1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                int elementMissing = i+1;
                list.add(elementMissing);
            }
        }
        return list;
    }
}

OR


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            int curr = Math.abs(nums[i]);
            nums[curr-1] = -(Math.abs(nums[curr -1]));
        }
         for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
            list.add(i+1);
            }
        }
        return list;
    }
}

OR
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            set.add(i);
        }
        for(int i=1; i<=nums.length; i++){
           if(!set.contains(i)){
           list.add(i);
           }  
        }
       
        return list;
    }
}
