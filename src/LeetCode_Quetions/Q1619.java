package LeetCode_Quetions;

import java.util.Arrays;

public class Q1619 {
	public static double trimMean(int[] arr) {
		int l=arr.length;
		double n =( 0.05 * l );
        Arrays.sort(arr);
        double sum = 0;
        for(int i = (int)n; i<l-n ; i++)            
            sum = sum + arr[i];
        double len  = l - 2*n;
        sum  = sum / len;
        return sum;
    }

	public static void main(String[] args) {
		int[] nums = {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};
		double ans = trimMean(nums);
		System.out.println(ans);

	}

}
