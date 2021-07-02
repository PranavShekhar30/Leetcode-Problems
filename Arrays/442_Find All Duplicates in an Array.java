Method - 1 - Using HashMaps

  TC: O(N)
  SC: O(N)

    class Solution {    
    public List <Integer> findDuplicates(int[] nums) {
        LinkedList <Integer> l=new LinkedList <Integer> ();
        HashMap <Integer,Integer> m=new HashMap <Integer,Integer> ();
        for(int i:nums)
        {
            if(m.containsKey(i))
            {
                m.put(i,2);    
            }
            else
            {
                m.put(i,1);
            }
        }
        for(int i:m.keySet())
        {
            if(m.get(i)==2)
            {
                l.add(i);
            }
        }
        return l;
    }
}

Method - 2 - Optimal Solution
  
  TC: O(N)
  SC: O(1)
    
  class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0){
                res.add(Math.abs(nums[i]));
                
            }
            nums[index] = - nums[index];
        }
        return res;
    }
}
    
