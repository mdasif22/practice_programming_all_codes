package Competitive_Programming;

import java.util.HashMap;
import java.util.PriorityQueue;

public class leetcode2 {

	//Problem 215 find kth largest element
//	public static int findKthLargest(int[] nums, int k) {
//        //Method 1
////        Arrays.sort(nums);
////        return nums[nums.length-k];
//        
//    	//Method 2 
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(int i:nums){
//            pq.add(i);
//            if(pq.size()>k){
//                pq.poll();
//            }
//        }
//        return pq.peek();
//        
//    }
	
	
//Problem 152 Maximum Product Subarray
//	public static int maxProduct(int[] nums) {
//		int max_prod = Integer.MIN_VALUE;
//		int curr = 1;
//		for (int i = 0; i < nums.length; i++) {
//			curr *= nums[i];
//			max_prod = Math.max(max_prod, Math.max(curr, nums[i]));
//			if (curr == 0)
//				curr = 1;
//		}
//		
//		curr = 1;
//		for (int i = nums.length - 1; i >= 0; i--) {
//			curr *= nums[i];
//			max_prod = Math.max(max_prod, curr);
//			if (curr == 0)
//				curr = 1;
//		}
//		return max_prod;
//	}


//Problem 290 Word pattern
/*
	public static boolean wordPattern(String pattern,String s) {
		//Method 1
//		HashMap<Character,String> map = new HashMap<>();
//		String[] str = pattern.split(" ");
//		
//		for(int i=0;i<s.length();i++) {
//			char ch = s.charAt(i);
//			if(str.length!=s.length())
//                return false;
//			if(!map.containsKey(ch)) {
//				if(map.containsValue(str[i])) {
//					return false;
//				}
//				map.put(ch, str[i]);
//			}
//			else if(map.containsKey(ch)) {
//				if(!map.get(ch).equals(str[i]))
//					return false;
//			}
//		}
//		//&& !map.containsValue(str[i])
//		return true;
		
		//Method 2
		HashMap<Character,String> map = new HashMap<>();
		String[] str = s.split(" ");
		
		for(int i=0;i<pattern.length();i++) {
			char ch = pattern.charAt(i);
			if(str.length!=pattern.length())
                return false;
            
            if(map.containsKey(ch)) {
				if(!map.get(ch).equals(str[i]))
					return false;
			}
            
			else {
				if(map.containsValue(str[i])) {
					return false;
				}
				map.put(ch, str[i]);
			}
			
		}
		return true;
	}
*/
	
	//Problem 525 Contiguous array
//		public static int findMaxLength(int[] nums) {
//	        HashMap hm = new HashMap();
//	        int sum=0,max=0;
//	        hm.put(0,-1);
//	        for(int i=0;i<nums.length;i++) {
//	        	if(nums[i]==0)
//	        		sum+=-1;
//	        	else if(nums[i]==1){
//	        		sum+=1;
//	        	}
//	        	
//	        	if(hm.containsKey(sum)) {
//	        		int index = (int) hm.get(sum);
//	        		int len = i - index;
//	        		if(len>max)
//	        			max=len;
//	        	}
//	        	else {
//	        		hm.put(sum, i);
//	        	}
//	        }
//	        return max;
//	    }
	
	
//Problem 1752 Check if Array Is Sorted and Rotated
//	class Q1752 {
//		public boolean check(int[] nums) {
//			int count = 0;
//			for (int i = 1; i < nums.length; i++) {
//				if (nums[i - 1] > nums[i])
//					count++;
//			}
//			if (nums[nums.length - 1] > nums[0])
//				count++;
//			return count <= 1;
//		}
//	}

	
	
}

	
	
