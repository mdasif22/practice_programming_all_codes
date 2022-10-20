package LeetCode_Quetions;

import java.util.*;
import java.lang.*;
import java.io.*;

class Q1464
{
	public static int maxProduct(int[] nums) {
		int max=0;
		int max2=0;
        for(int i=0;i<nums.length;i++) {
        	int mul = 0;
        	max=0;
        	for(int j=i+1;j<nums.length;j++) {
        		mul = (nums[i]-1)*(nums[j]-1);
        		if(mul>max)
        			max=mul;
        	}
        	if(max>max2)
        		max2=max;
        }
        return max2;
        
      //Method 2
        // Arrays.sort(nums);
        // return ((nums[nums.length-1]-1) * (nums[nums.length-2]-1));
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] nums = {1,5,4,5};
		int ans = maxProduct(nums);
		System.out.println(ans);
	}
}