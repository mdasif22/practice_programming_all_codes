package LeetCode_Quetions;

import java.util.Arrays;

public class Q2149 {
	public static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int i=0,j=1;
        for(int k=0;k<nums.length;k++) {
        	if(nums[k]>0) {
        		result[i]=nums[k];
        		i+=2;
        	}
        	else if(nums[k]<0) {
        		result[j]=nums[k];
        		j+=2;
        	}
        }
        return result;
    }

	public static void main(String[] args) {
		int[] nums = {-1,1};
		int[] ans = rearrangeArray(nums);
		System.out.println(Arrays.toString(ans));
	}

}
