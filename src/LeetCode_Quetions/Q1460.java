package LeetCode_Quetions;

import java.util.*;

public class Q1460 {

	public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        int i=0;
        while(i<target.length && i<arr.length) {
        	if(target[i]!=arr[i])
        		return false;
        	i++;
        }
        return true;
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] target = {1,2,2,3};
		int[] arr = {1,1,2,3};
		boolean ans = canBeEqual(target,arr);
		System.out.println(ans);
	}
}
