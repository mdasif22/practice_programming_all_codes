package LeetCode_Quetions;

import java.util.Arrays;

class Q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
		 
		 int j=0;
		 for(int i=m;i<nums1.length;i++)
		 {
			 nums1[i] = nums2[j++];
		 }
		 Arrays.sort(nums1);
		 //System.out.println(Arrays.toString(nums1));
	 
    }
}
