package ArrayPrograms;

import java.util.Collections;
import java.util.PriorityQueue;

public class K_smallest_element_inArray {

	public static int K_smallest_element_inArray(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
        
    }
    public static void main(String[] args) {
    	int[] nums = {3,2,1,5,6,4}; int k = 3;
		int ans = K_smallest_element_inArray(nums,k);
		System.out.println(ans);
    }
	
}
