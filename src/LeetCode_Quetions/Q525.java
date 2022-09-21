package LeetCode_Quetions;

import java.util.HashMap;

public class Q525 {
	//Problem 525 Contiguous array
		public static int findMaxLength(int[] nums) {
	        HashMap hm = new HashMap();
	        int sum=0,max=0;
	        hm.put(0,-1);
	        for(int i=0;i<nums.length;i++) {
	        	if(nums[i]==0)
	        		sum+=-1;
	        	else if(nums[i]==1){
	        		sum+=1;
	        	}
	        	
	        	if(hm.containsKey(sum)) {
	        		int index = (int) hm.get(sum);
	        		int len = i - index;
	        		if(len>max)
	        			max=len;
	        	}
	        	else {
	        		hm.put(sum, i);
	        	}
	        }
	        return max;
	    }
		
		public static void main(String[] args) {
			int[] arr= {0,1,0};
			int ans = findMaxLength(arr);
			System.out.println(ans);
		}
		
}
