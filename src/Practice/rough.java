package Practice;

import java.util.Arrays;

class rough {
	
	public static int findMaxConsecutiveOnes(int[] nums,int n) {
		//int n = nums.length;
		int ex = n*(n+1)/2;
		int sum=0;
		for(int i=0;i<n-1;i++) {
			sum+=nums[i];
		}
		return ex-sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5};
		int N = 5;
		int ans = findMaxConsecutiveOnes(arr,N);
		System.out.println(ans);
	}
	
}
