package Sliding_Window;

import java.util.Arrays;

public class Largest_Subarray_of_sum_K {
	
	public static int largest_subarray(int[] arr, int k,int n) {
		int i=0,j=0;
		int max=0;
		long sum=0;
		while(j<n) {
			sum=sum+arr[j];
			//if(sum<k)
				//j++;
			 if(sum == k) {
				max=Math.max(max, j-i+1);
				//j++;
			}
			else if(sum > k) {
				while(sum > k) {
					sum=sum-arr[i];
					i++;
				}
			}
			j++;
		}
		return max;
		
	}

	public static void main(String[] args) {
		int[] arr = {10,5,2,7,1,9};
		int k = 15;
		int n = arr.length;
		int ans = largest_subarray(arr,k,n);
		System.out.println(ans);

	}

}
