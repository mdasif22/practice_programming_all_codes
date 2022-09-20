package Competitive_Programming;

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

	
}
