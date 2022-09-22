package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class hashset {
	
	//Remove duplicates
	public static void duplicate(int[] arr1) {
		HashSet set = new HashSet();
		for(int i=0;i<arr1.length;i++) {
			if(!set.contains(arr1[i])) {
				set.add(arr1[i]);
			}
		}

		System.out.println("Original array : "+Arrays.toString(arr1));
		System.out.println("After duplicate removal : "+set);
	}
	
	//Pairs with equal sum
		public static boolean equalSum(int[] arr) {
			HashSet set = new HashSet();
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					int sum = arr[i]+arr[j];
					if(set.contains(sum))
						return true;
					else
						set.add(sum);
				}
			}
			return false;
		}
	
	public static void main(String[] args) {
		int[] arr1 = {2,4,1,2,3,4,5};
		int[] arr2= {2,9,3,5,8,6,4};
		
		//duplicate(arr1);
		
		boolean ans = equalSum(arr2);
		System.out.println(ans);
	}

}
