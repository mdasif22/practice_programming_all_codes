package LeetCode_Quetions;

import java.util.*;

import java.util.*;
import java.lang.*;
import java.io.*;

class Q1200
{
	public static List<List<Integer>> minimumAbsDifference(int[] arr) {
		
		//Method 1 (My approach)
//        Arrays.sort(arr);
//        int min = Integer.MAX_VALUE;
//        List<List<Integer>> list1 = new ArrayList<>();
//		for (int i = 0; i < arr.length - 1; i++) {
//			List<Integer> list2 = new ArrayList<>();
//			
//			int diff = arr[i + 1] - arr[i];
//			if(diff<min) {
//				list1.clear();
//				list2.add(arr[i]);
//				list2.add(arr[i+1]);
//				min = diff;
//				list1.add(list2);
//			}
//			else if (diff <= min) {
//				list2.add(arr[i]);
//				list2.add(arr[i+1]);
//				min = diff;
//				list1.add(list2);
//			}
//			
//			
//		}
//		return list1;
		
		//Method 2 
		List<List<Integer>> result = new ArrayList<>(); 
		Arrays.sort(arr); // sort array
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++)
			min = Math.min(min, arr[i] - arr[i - 1]); // find minima
		for (int i = 1; i < arr.length; i++) {
			int diff = arr[i] - arr[i - 1];
			if (min == diff) { // find pair and add to result
				List<Integer> item = new ArrayList<>();
				item.add(arr[i - 1]);
				item.add(arr[i]);
				result.add(item);
			}
		}
		return result;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] nums = {40,11,26,27,-20}; //1,2,3,4
		List ans = minimumAbsDifference(nums);
		System.out.println(ans);
	}
}
