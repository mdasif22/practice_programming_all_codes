package LeetCode_Quetions;

import java.util.*;

public class Q2395 {
	
	 public static boolean findSubarrays(int[] nums) {
		//Method 1 using Set
		 Set<Integer> set = new HashSet<>();
	        
	        for(int i = 1; i < nums.length; i++){
	            if(!set.add(nums[i] + nums[i-1]))
	                return true;
	        }

	        return false;
	        
	      //Method 2 using MAP
//	        int count=0;
//	        int sum=0;
//	        HashMap<Integer,Integer> hm = new HashMap<>();
//	        int j=0;
//	        for(int i=0;i<nums.length;i++){
//	            sum+=nums[i];
//	            while(i-j+1 >= 2){
//	                if((i-j+1==2) && (hm.containsKey(sum))) return true;
//	                hm.put(sum,1);
//	                sum-=nums[j];
//	                j++;
//	            }
//	        }
//	        return false;
		 
	        //My Approach but not accepted
//	        int i=0,j=0,max=0;
//	        int len=nums.length;
//	        int sum=0;
//	        while(j<len) {
//	        	sum+=nums[j];
//	        	if(j-i+1 == 2) {
//	        		if(sum==max)
//	        			return true;
//	        		max = sum;
//	        		sum -=nums[i];
//	        		i++;
//	        	}
//	        	j++;
//	        	
//	        }
//	        return false;
	        
	 }

	public static void main(String[] args) {
		
		int A[] = {1,2,3,4,5};
		boolean ans = findSubarrays(A);
		System.out.println(ans);

	}

}
