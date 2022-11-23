package LeetCode_Quetions;

import java.util.Arrays;

public class Q1004 {
	public static int longestOnes(int[] nums, int k) {
        int ans=0,count=0,j=-1;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]==0) {
        		count++;
        	}
        	while(count>k) {
        		j++;
        		if(nums[j]==0)
        			count--;
        	}
        	
        	int len = i-j;
        	if(len>ans)
        		ans=len;
        	
        }
        return ans;
	}

	public static void main(String[] args) {
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		int ans = longestOnes(nums,k);
		System.out.println(ans);

	}

}
