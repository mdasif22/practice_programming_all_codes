package LeetCode_Quetions;
import java.util.*;
class Q215 {
    public static int findKthLargest(int[] nums, int k) {
        //Method 1
//        Arrays.sort(nums);
//        return nums[nums.length-k];
        
    	//Method 2 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
        
    }
    
    public static void main(String[] args) {
		int[] num = {3,2,1,5,6,4};
		int target = 2;
		int ans = findKthLargest(num,target);
		System.out.println(ans);
	}
}