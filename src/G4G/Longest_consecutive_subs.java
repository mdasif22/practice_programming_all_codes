package G4G;

import java.util.HashSet;
//https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1
public class Longest_consecutive_subs {

	//Question is not understandable is its incorrect
	public static int longest_subs(int[] arr,int n) {
		int max=0;
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=n && !set.contains(arr[i])) {
				set.add(arr[i]);
				max++;
			}
			
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] arr = {10 ,20, 21, 22, 23};
		int ans = longest_subs(arr,n);
		System.out.println(ans);
	}

}
