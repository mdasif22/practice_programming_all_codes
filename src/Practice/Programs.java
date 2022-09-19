package Practice;
import java.util.*;

//COPY CONTAINT OF ARRAY INTO ANOTHER
//public class Programs {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of array");
//		int size = sc.nextInt();
//		int arr1[] = new int[size];
//		for(int i =0;i<size;i++)
//		{
//			System.out.println("Enter element at position "+i);
//			arr1[i] = sc.nextInt();
//		}
//		
//		int arr2[] = new int[size];
//		for(int i=0;i<size;i++)
//		{
//			arr2[i]=arr1[i];
//		}
//		
//		System.out.println("Elements of Array1");
//		for(int i =0;i<size;i++)
//		{
//			System.out.println(arr1[i]);
//		}
//		
//		System.out.println("Elements of Array2");
//		for(int i =0;i<size;i++)
//		{
//			System.out.println(arr2[i]);
//		}
//		
//	}
//
//}

//**********************************************************
//#COUNT OCCURENCE OF ARRAY ELEMENT
//public class Programs {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int arr1[] = {1,2,8,3,2,2,2,5,1};
//		
//		for(int i=0;i<arr1.length;i++)
//		{
//			int count = 1;
//			for(int j=i+1;j<arr1.length;j++)
//			{
//				if(arr1[i] == arr1[j])
//				{
//					count++;
//				}
//			}
//			System.out.println("Occurence of "+arr1[i]+" = "+count);
//		}
//		
//	}
//
//}


//*************************************************
//DUPLICATES VALUES FROM ARRAY
//public class Programs {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};
//		int count = 0;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					System.out.println("Duplicate values are"+arr[j]);
//				}
//			}
//		}
//	}
//
//}

//********************************************
//REVERSE ARRAY ELEMENTS
//public class Programs {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int arr[] = {1, 2, 3, 4, 5};
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.println(arr[i]);
//		}
//	}
//
//}

//*******************************************

// COUNT NUMBER OF ELEMENTS
//public class Programs {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int arr[] = {1, 2, 3, 4, 5};
//		int count = 0;
//		for(int i=0;i<arr.length;i++)
//		{
//			count++;
//		}
//		System.out.println(count);
//		System.out.println(arr.length);
//	}
//
//}



//*******************************************
//Sort the array
//public class Programs {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int arr[] = {5, 2, 8, 7,1};
//		int count;
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]<arr[j])
//				{
//					count = arr[i];
//					arr[i] = arr[j];
//					arr[j] = count;
//				}
//			}
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
//	}
//
//}

//******************************************
//Sort Words in Alphabetic Order
//public class Programs {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str1="hello asif how are you";
//		String temp;
//		String str2[]=str1.split(" ");
//		for(int i=0;i<str2.length;i++)
//		{
//			for(int j=i+1;j<str2.length;j++)
//			{
//				if(str2[i].compareTo(str2[j])>0)
//				{
//					temp = str2[i];
//					str2[i] = str2[j];
//					str2[j] = temp;
//				}
//			}
//		}
//		
//		for(int i=0;i<str2.length;i++)
//		{
//			System.out.println("Elements = "+str2[i]);
//		}
//		
//	}
//
//}


//public class Programs {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the  first string\n");
//		String str1 = sc.nextLine();
//		char string[] = str1.toCharArray();
//		for(int i = 0;i<string.length;i++)
//		{
//			for(int j = i+1;j<string.length;j++)
//			{
//				if(string[i] == string[j])
//				{
//					System.out.println("Duplicate character is = "+string[j]);
//				}
//			}
//		}
//	}
//
//}


//public class Programs {
//	
//	static void reverse(int[] array)
//	{
//		int start = 0;
//		int end = array.length-1;
//		while(start<end)
//		{
//			swap(array,start,end);
//			start++;
//			end--;
//		}
//	}
//
//	static void swap(int[] array,int index1,int indexLast)
//	{
//		int temp = array[index1];
//		array[index1] = array[indexLast];
//		array[indexLast] = temp;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] arr = {6,1,8,0,3,2};
//		Programs.reverse(arr);	
//		
//		for(int item : arr)
//		{
//			System.out.print(item+" ");
//		}
//	}
//
//}


//***************** BINARY SEARCH ***********
//public class Programs
//{
//	static int BSearch(int[] array,int target)
//	{
//		int low = 0;
//		int high = array.length-1;
//		
//		while(low<=high)
//		{
//			int mid = (low+high)/2;
//			if(target<array[mid] )
//				high = mid-1;
//				
//			
//			else if(target>array[mid])
//				low = mid+1;
//			
//			else
//				return mid;
//		}
//		
//		return -1;
//	}
//	
//	public static void main(String[] args) {
//		int[] arr = {2,5,7,9,12,18,26,35};
//		int target = 15;
//		int ans = BSearch(arr,target);
//		System.out.println(ans);
//	}
//}


//***************** BINARY SEARCH Find ceiling or floor number ***********
//public class Programs
//{
//	static int BSearch(int[] array,int target)
//	{
//		int low = 0;
//		int high = array.length-1;
//		
//		while(low<=high)
//		{
//			int mid = (low+high)/2;
//			if(target<array[mid] )
//				high = mid-1;
//				
//			
//			else if(target>array[mid])
//				low = mid+1;
//			
//			else
//				return mid;
//		}
//		
//		return array[low];
//		//return array[high];
//	}
//	
//	public static void main(String[] args) {
//		int[] arr = {2,5,7,9,12,18,26,35};
//		int target = 15;
//		int ans = BSearch(arr,target);
//		System.out.println(ans);
//	}
//}

//************** BSearch ****************
//public class Programs
//{
//	static int BSearch(int[] array,int target)
//	{
//		int low = 0;
//		int high = array.length-1;
//		
//		while(low<=high)
//		{
//			int mid = (low+high)/2;
//			if(target<array[mid] )
//				high = mid-1;
//			else 
//			{
//				low = mid+1;
//			}
//				
//			
//		}
//		
//		return array[low%array.length];
//		
//	}
//	
//	public static void main(String[] args) {
//		int[] arr = {2,5,7,9,12,18,26,35};
//		int target = 35;
//		int ans = BSearch(arr,target);
//		System.out.println(ans);
//	}
//}


//**************** OrderAgnosticBSearch ****************
//public class Programs
//{
//	static int OrderAgnosticBSearch(int[] array,int target)
//	{
//		int low = 0;
//		int high = array.length-1;
//		boolean isAsc = array[low]<array[high];
//		
//		while(low<=high)
//		{
//			int mid = (low+high)/2;
//			if(target==array[mid] )
//				return mid;
//			
//			if(isAsc)
//			{
//				if(array[mid] < target)
//				{
//					low = mid + 1;
//				}
//				else
//					high = mid-1;
//			}
//			else
//			{
//				if(target > array[mid])
//					high = mid-1;
//				else
//					low=mid+1;				
//			}	
//		}
//		
//		return -1;	
//	}
//	
//	public static void main(String[] args) {
//		int[] nums = {1,2,3,4,5,3,1};
//		int target = 3;
//		int result = OrderAgnosticBSearch(nums,target);
//		System.out.println(result);
//	}
//
//}


class Programs{
	public static void main(String[] args) {
		int[] hi = {1,2,3,4,5};
		System.out.println(Integer.MIN_VALUE);
	}
}

