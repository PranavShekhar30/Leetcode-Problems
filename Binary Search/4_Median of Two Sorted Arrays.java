Method 1:

TC: O(M + N);
SC: O(1);

public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int index1 = 0;
    int index2 = 0;
    int med1 = 0;
    int med2 = 0;
    for (int i=0; i<=(nums1.length+nums2.length)/2; i++) {
        med1 = med2;
        if (index1 == nums1.length) {
            med2 = nums2[index2];
            index2++;
        } else if (index2 == nums2.length) {
            med2 = nums1[index1];
            index1++;
        } else if (nums1[index1] < nums2[index2] ) {
            med2 = nums1[index1];
            index1++;
        }  else {
            med2 = nums2[index2];
            index2++;
        }
    }

    // the median is the average of two numbers
    if ((nums1.length+nums2.length)%2 == 0) {
        return (float)(med1+med2)/2;
    }

    return med2;
   }
}

Method 2: Using Binary Search:

TC: O(Log(M + N));
SC: O(Max(M + N));
      


 class Solution{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        if(n1 == 0 && n2 == 0){
            return 0.0;
        }
        if(n1 > n2){
            return findMedianSortedArrays(nums2, nums1);
        }
        int low = 0;
        int high = n1;
        
        while(low <= high){
            int cut1 = low + (high - low)/2;
            int cut2 = (n1 + n2)/2 - cut1;
            
            int l1 = (cut1==0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int l2 = (cut2==0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int r1 = (cut1==n1) ? Integer.MAX_VALUE : nums1[cut1];
            int r2 = (cut2==n2) ? Integer.MAX_VALUE : nums2[cut2];
            
            if(l1 > r2){
                high = cut1 - 1;
            }
            else if(l2 > r1){
                low = cut1 + 1;
            }
            else{
                if((n1 + n2) % 2 != 0){
                    return ((double) Math.min(r1, r2));
                }
                else{
                    return ((double) Math.max(l1, l2) + Math.min(r1,r2)) / 2;    
                }
            }
        }
        return 0.0;
    } 
}

YT link to understand: https://youtu.be/yD7wV8SyPrc
    
