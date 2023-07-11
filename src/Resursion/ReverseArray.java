package Resursion;

import java.util.Arrays;

public class ReverseArray {
	
	public static void reverse1(int[] arr,int left,int right) {
		if(left>=right)
			return;
		
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		
		reverse1(arr,left+1,right-1);
	}
	
	public static void reverse2(int[] arr,int i,int len) {
		if(i>=len/2)
			return;
		
		int temp=arr[i];
		arr[i]=arr[len-i-1];
		arr[len-i-1]=temp;
		
		reverse2(arr,i+1,len);
	}
	
	public static boolean isPalindrom(String str,int i) {
		int len = str.length();
		if(i>=len/2)
			return true;
		
		if(str.charAt(i)!=str.charAt(len-i-1))
			return false;
		
		return isPalindrom(str,i+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		String str = "MadaM";
		int l=0,r=arr.length-1;
		
//		reverse1(arr,l,r);
//		System.out.println(Arrays.toString(arr));
		
//		boolean ans = isPalindrom(str,0);
//		System.out.println(ans);
		
		reverse2(arr,l,arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
