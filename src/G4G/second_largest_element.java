package G4G;

import java.util.Arrays;
import java.util.HashSet;

public class second_largest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 7, 7, 3, 9};
		int ans1 = secondLargest(arr,arr.length);
		int ans2 = secondsmallest(arr,arr.length);
		System.out.println(ans2);
	}

	private static int secondLargest(int[] arr,int n) {
		//Method 1
		HashSet s = new HashSet();
		if(n<2)
			return -1;
		int first=0,second=0;
		for(int i=0;i<n;i++) {
			s.add(arr[i]);
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			}
			if(arr[i]>second && arr[i]!=first) {
				second = arr[i];
			}
			
		}
		if(s.size()==1)
			return -1;
		return second;
		
		//Method 2
//		if(n<2)
//			return -1;
//		int first= Integer.MIN_VALUE,second=Integer.MIN_VALUE;
//		for(int i=0;i<n;i++) {
//			
//			if (arr[i] > first)
//			{
//				second= first;
//				first = arr[i];
//			}
//			else if (arr[i] > second && arr[i] != first)
//			{
//				second = arr[i];
//			}
//			
//		}
//		return second;
		
		
	}

	//Second Smallest element
	private static int secondsmallest(int[] arr,int n) {
		
		//Method 2
		if(n<2)
			return -1;
		int first= Integer.MAX_VALUE,second=arr[0];
		for(int i=0;i<n;i++) {
			
			if (arr[i] < first)
			{
				second= first;
				first = arr[i];
			}
			else if (arr[i] < second && arr[i] != first)
			{
				second = arr[i];
			}
			
		}
		return second;
		
		
	}

	
}
