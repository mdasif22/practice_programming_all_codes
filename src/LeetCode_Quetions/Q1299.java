package LeetCode_Quetions;

import java.util.Arrays;

public class Q1299 {

	public static int[] replaceElements(int[] arr) {
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length-1;i++) {
        	temp[i]=greater(arr,i+1);
        }
        temp[arr.length-1]=-1;
        return temp;
    }
	
	public static int greater(int[] arr,int current) {
		int max=0;
		for(int i=current;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
		}
		return max;
	}
	
	public int[] replaceElements1(int[] arr) {
        
	    int max = -1; // All elements in the input range are positive. Otherwise, it can be modified slightly
	    
	    for (int i = arr.length - 1; i >= 0; i--)
	    {
	        int temp = arr[i];
	        arr[i] = max; 
	        max = Math.max(max, temp);
	    }
	    return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {17,18,5,4,6,1};
		int[] ans = replaceElements(arr);
		System.out.println(Arrays.toString(ans));

		//18,6,6,6,1,-1      -output
		//18, 6, 6, 6, 1, -1 -getting
	}

}
