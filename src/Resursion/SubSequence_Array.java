package Resursion;

import java.util.*;

public class SubSequence_Array {
	
	public static void subsequence(int index,List<Integer> list,int[] arr,int len) {
		if(index==len)
		{
			for(int ele : list) {
				System.out.print(ele + " ");
			}
			System.out.println();
			return;
		}
		
		list.add(arr[index]);
		subsequence(index+1, list, arr, len);
		list.remove(list.size()-1);
		
		subsequence(index+1, list, arr, len);
	}

	public static void main(String[] args) {
		int[] arr= {3,1,2};
		List<Integer> list = new ArrayList();
		subsequence(0,list,arr,arr.length);

	}

}
