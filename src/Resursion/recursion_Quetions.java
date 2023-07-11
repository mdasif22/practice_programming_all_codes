package Resursion;

import java.util.ArrayList;
import java.util.List;

public class recursion_Quetions {
	
	//Fibonacci series using recursion
	public static void fibo(int a,int b,int n) {
		if(n==0) {
			return;
		}
		
		int c = a+b;
		System.out.println(c);
		fibo(b,c,n-1);
	}
	
	public static int calcPower(int x,int n) {
		if(n==0)
			return 1;
		
		int first = calcPower(x,n-1);
		int second = x*first;
		return second;
	}
	static int sum=0;
	public static int sumOfDigits(int num) {
		if(num==0) {
			return 0;
		}
		int rem = num%10;
		num=num/10;
		sum+=rem;
		sumOfDigits(num);
		return sum;
	}
	
	public static int sumOfDigits2(int num) {
		if(num==0) {
			return 0;
		}
		
		return (num%10) + sumOfDigits(num/10);
	}
	
	//BY kunal
	public static boolean isSorted1(int[] arr, int index) {
		if(index==arr.length-1) {
			return true;
		}
		
		return arr[index] < arr[index+1] && isSorted1(arr,index+1);
	}
	
	//OR by shradha di
	public static boolean isSorted2(int[] arr, int index) {
		if(index==arr.length-1) {
			return true;
		}
		
		if(arr[index] < arr[index+1])
			return isSorted2(arr,index+1);
		else
			return false;
		
	}
	
	public static boolean linearSearch(int[] arr,int target,int index) {
		if(index==arr.length) {
			return false;
		}
		
		return arr[index] == target || linearSearch(arr,target,index+1);
	}
	
	public static void subsequenceArray(int index,List<Integer> list,int[] arr,int len) {
		if(index==len)
		{
			for(int ele : list) {
				System.out.print(ele + " ");
			}
			System.out.println();
			return;
		}
		
		list.add(arr[index]);
		subsequenceArray(index+1, list, arr, len);
		list.remove(list.size()-1);
		subsequenceArray(index+1, list, arr, len);
	}
	
	static void subsequenceString(String p,String up)
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return;
		}
			
		char c = up.charAt(0);
		subsequenceString(p+c,up.substring(1));
		subsequenceString(p,up.substring(1));
	}
	
	public static void arrayMax(int[] arr, int index, int max) {
		if(index==arr.length){
			System.out.println(max);
			return;
		}
		
		if(arr[index] > max)
			max=arr[index];
		
		arrayMax(arr,index+1,max);
	}
	
	//My approach
	public static int firstOccurance1(int[] arr,int index,int value) {
		if(index==arr.length) {
			return -1;
		}
		
		return (arr[index]==value) ? index : firstOccurance1(arr,index+1,value);
	}
	
	public static int firstOccurance2(int[] arr,int index,int value) {
		if(index==arr.length) {
			return -1;
		}
		
		if(arr[index]==value) {
			return index;
		}
		else {
			int first_index = firstOccurance2(arr,index+1,value);
			return first_index;
		}
	}
	
	
	public static void main(String[] args) {
		int terms = 7;
		int num = 1231;
		int a=0,b=1;
		int arr1[] = {1,2,3,4};
		int arr2[] = {2,1,5,4,2,9};
		int arr3[] = {9,1,2,4,2,5,2,7,3};	
		
//		System.out.println(a);
//		System.out.println(b);
//		fibo(a,b,terms-2);
		
		//System.out.println(calcPower(2,5));
		
		//System.out.println(sumOfDigits(num));
		
		//System.out.println(sumOfDigits2(num));
		
		//System.out.println(isSorted1(arr,0));
		
		//System.out.println(linearSearch(arr,4,0));
		
		//subsequenceString("","abc");
		
//		int[] arr2= {3,1,2};
//		List<Integer> list = new ArrayList();
//		subsequenceArray(0,list,arr2,arr2.length);
		
		//System.out.println(isSorted2(arr,0));
		
//		int max=Integer.MIN_VALUE;
//		arrayMax(arr2,0,max);
		
		//System.out.println(firstOccurance1(arr3,0,7));
		
		System.out.println(firstOccurance2(arr3,0,3));
	}

}
