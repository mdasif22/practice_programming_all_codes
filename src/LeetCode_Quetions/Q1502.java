package LeetCode_Quetions;

import java.util.Arrays;

public class Q1502 {
	public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
		int ans = arr[1] - arr[0];
		for(int i=2;i<arr.length;i++) {
			if(arr[i]-arr[i-1] != ans)
				return false;
		}
		return true;
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] nums = {3,5,1}; //1,3,5
		boolean ans = canMakeArithmeticProgression(nums);
		System.out.println(ans);
	}
}
