package Resursion;

import java.util.*;

public class Array_Permutation {
	
	//By striver
	public static List<List<Integer>> permute(int[] arr){
	 List<List<Integer>> ans = new ArrayList<>();
	 List<Integer> ds = new ArrayList();
	 boolean[] freq = new boolean[arr.length];
	 recurPermute(arr,ds,ans,freq);
	 return ans;
	}

	private static void recurPermute(int[] arr, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
		if(ds.size()==arr.length) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(!freq[i]) {
				freq[i]=true;
				ds.add(arr[i]);
				recurPermute(arr,ds,ans,freq);
				ds.remove(ds.size()-1);
				freq[i]=false;
			}
		}
		
	}

	public static void main(String[] args) {
		int arr1[] = {1,2,3};
		
		System.out.println(permute(arr1));
	}

}
