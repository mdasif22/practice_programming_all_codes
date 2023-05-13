package LeetCode_Quetions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q1005 {
	public static int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int i : nums) {
        	pq.add(i);
        }
        while(k-->0) {
        	int temp = pq.poll();
        	temp = -temp;
        	pq.add(temp);
        }
        
        int sum = 0;
        while(!pq.isEmpty()){
            sum += pq.poll();
        }
        return sum;
    }

	public static void main(String[] args) {
		int[] nums = {4,2,3}; int k = 1;
		int ans = largestSumAfterKNegations(nums,k);
		System.out.println(ans);

	}

}
