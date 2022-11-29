package Sliding_Window;

import java.util.*;

public class Find_Subarrays_With_Equal_Sum {
	
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
	 
	 public static int SubarraySumEqualsToK(int[] nums, int k) {

			int n = nums.length;
			int res = 0;
			HashMap<Integer, Integer> map = new HashMap<>();
			map.put(0, 1);
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += nums[i];
				if (map.containsKey(sum - k))
					res += map.get(sum - k);
				map.put(sum, map.getOrDefault(sum, 0) + 1);
			}
			return res;

			// Wrong ans in Negative value array
	// int max=0,sum=0;
	// int l=0,r=0;
	// while(r<arr.length) {
	// sum+=arr[r];
	// if(sum==k) {
	// max=Math.max(max, r-l+1);
	// }
	// else if(sum>k) {
	// while(sum>k) {
	// sum-=arr[l];
	// l++;
	// }
	// }
	// r++;
	// }
	// return max;
		}

	public static void main(String[] args) {
		
		int A[] = {1,2,3,4,5};
		boolean ans = findSubarrays(A);
		System.out.println(ans);
		
		// int[] arr1= {1,2,3};
		// int k=3;
		// int ans = SubarraySumEqualsToK(arr1,k);
		// System.out.println(ans);

	}

}
