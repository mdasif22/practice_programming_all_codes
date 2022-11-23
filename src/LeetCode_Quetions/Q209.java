package LeetCode_Quetions;

import java.util.Arrays;

public class Q209 {
	public static int minSubArrayLen(int s, int[] a) {
		if (a == null || a.length == 0)
	        return 0;
	  
	        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
	        while (j < a.length) {
	        sum += a[j++];
	    
	        while (sum >= s) {
	        min = Math.min(min, j - i);
	        sum -= a[i++];
	        }
	        
	  }
	    return min == Integer.MAX_VALUE ? 0 : min;
	    
	    //Method 2
//	    int i = 0;
//        int j = 0;
//        int sum = 0;
//        int minlength = INT_MAX;
//        while (j < nums.size())
//        {
//
//            sum += nums[j]; // updating our sum everytime 
//            
//            if (sum < target)
//            {
//                j++;
//            }
//            if (sum >= target)
//            {
//
//                while (sum >= target)
//                {
//                    minlength = min(minlength, j - i + 1);	// update out minlength whenever we hit the target
//                    sum -= nums[i];
//                    i++;
//                }
//                j++;
//            }
//        }
//
//        return (minlength == INT_MAX) ? 0 : minlength;
	   
		
		//My Approach (Accepted but not submitted)
//        Arrays.sort(nums);
//        int sum=0,count=0;
//        for(int i=nums.length-1;i>=0;i--) {
//        	sum+=nums[i];
//        	count++;
//        	if(sum>=target)
//        		return count;
//        }
//        return 0;
    }

	public static void main(String[] args) {
		int target = 7;
		int[] nums = {2,3,1,2,4,3};
		int ans = minSubArrayLen(target,nums);
		System.out.println(ans);
		
	}

}
