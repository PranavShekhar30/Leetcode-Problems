TC: O(N^2);
SC: O(N);

class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = construct(nums, 0, nums.length-1);
        return root;
    }
    public TreeNode construct(int[] nums, int start, int end){
        if(start>end){
            return null;
        }
        if(start==end){
            return new TreeNode(nums[start]);
        }
        int index = findMax(nums,start,end);
        TreeNode root = new TreeNode(nums[index]);
        root.left = construct(nums,start,index-1);
        root.right = construct(nums,index+1,end);
        return root;
    }
    public int findMax(int[] nums, int start, int end){
        int index = -1;
        int max = Integer.MIN_VALUE;
        for(int i=start;i<=end;i++){
            if(max<nums[i]){
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
}
