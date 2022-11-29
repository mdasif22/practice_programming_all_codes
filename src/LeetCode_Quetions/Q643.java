package LeetCode_Quetions;

import java.util.Arrays;

public class Q643 {
	public static double findMaxAverage(int[] nums, int k) {
		
		// sliding window
        int sum = 0;
        int count = 0;
        double maxAverage = Integer.MIN_VALUE;
        for (int left = 0, right = 0; right < nums.length; right++) {
            
            sum += nums[right];
            count++;
            
            if (k == count) {
                maxAverage = Math.max(maxAverage, (double)sum / k);
                sum -= nums[left];
                count--;
                left++;
            }
        }
        
        return maxAverage;
		
		//My Approach ( Accepted but not submitted )
//        int left=0,right=0;
//        double max=0,avg=0,sum=0;
//        while(right<nums.length)
//        {
//        	sum+=nums[right];
////        	if(right-left+1 < k)
////        		right++;
//        	 if(right-left+1 == k){
//        		 avg = sum/k;
//        		 max=Math.max(max, avg);
//        		 //right++;
//        	}
//        	else if(right-left+1 > k){
//        		while(right-left+1 > k) {
//        			sum-=nums[left];
//        			left++;
//        		}
//        		avg = sum/k;
//            	max=Math.max(max, avg);
//        		
//        	}
//        	right++;
//        	
//        }
//        return max;
	}

	public static void main(String[] args) {
		int[] nums = {1,12,-5,-6,50,3};
		int k = 4;
		double ans = findMaxAverage(nums,k);
		System.out.println(ans);
	}

}
