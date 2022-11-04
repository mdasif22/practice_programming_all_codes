package Sliding_Window;

import java.util.*;
import java.util.Arrays;

public class Maximum_of_all_subarrays_of_size_k {
	
	public static int[] slidingMaximum(final int[] A, int B) {
//        int i=0,j=0,max=Integer.MIN_VALUE;
//        while(j<A.length) {
//        	if(j-i+1 < B) {
//        		j++;
//        	}
//        	else if(j-i+1 == B) {
//        		int num = A[j];
//        		max = Math.min(max, num);
//        	}
//        }
		
		//My Approach (Brute Force)
		int ind=0;
		int[] ans = new int[A.length-B+1];
		List<Integer> list = new ArrayList();
		for(int i=0;i<A.length-B+1;i++) {
			int max=Integer.MIN_VALUE;
			for(int j=i;j<i+B;j++) {
				int num = A[j];
				max = Math.max(max, num);
			}
			ans[ind++]=max;
		}
		return ans;
    }

	public static void main(String[] args) {
		int[] A = {1, 3, -1, -3, 5, 3, 6, 7};
		int B = 3;
		int[] ans = slidingMaximum(A,B);
		System.out.println(Arrays.toString(ans));
	}
}
