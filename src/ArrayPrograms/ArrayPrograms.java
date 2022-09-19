package ArrayPrograms;

//***************** Reverse Array Elements *************************
//Reverse Array Elements
//public class ArrayPrograms {
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

//**************** Linear Search ***********
//class ArrayPrograms
//{
//	static int LSearch(int[] array , int target)
//	{
//		for(int i=0;i<array.length;i++)
//		{
//			if(array[i] == target)
//			{
//				return i;
//			}
//		}
//		return -1;
//	}
//	
//public static void main(String[] args) {
//	int[] arr= {10,1,55,22,90,11};
//	int target = 12;
//	int result = LSearch(arr,target);
//	System.out.println("Element Found at index "+result);
//}
//}

//************* Search char in String *********
//public class ArrayPrograms {
//
//	static void LSearch(String str,char target)
//	{
//		for(int i=0;i<str.length();i++)
//		{
//			if(target == str.charAt(i))
//			{
//				System.out.println("Char found at index "+i);
//				break;
//			}
//		}
//	}
//	
//	public static void main(String[] args) {
//		String str = "AsifHero";
//		char target = 'o';
//		LSearch(str,target);
//		
//	}
//
//}

//*************** Search in 2D array*************************
//public class ArrayPrograms {
//
//	static int[] LSearch(int[][] array ,int target)
//	{
//		for(int row=0;row<array.length;row++)
//		{
//			for(int col=0;col<array[row].length;col++)
//			{
//				if(array[row][col] == target)
//				{
//					return new int[] {row,col};
//				}
//			}
//		}
//		
//		return new int[] {-1,-1};
//	}
//	
//	public static void main(String[] args) {
//		int[][] arr = { { 4,8,1,2},{77,11,43},{91,18,49} };
//		int target =49;
//		int ans[] = LSearch(arr,target);
//		System.out.println("Element found at index "+Arrays.toString(ans));
//	}
//
//}

//Problem Even length
//public class ArrayPrograms {
//
//	public static void main(String[] args) {
//		int[] arr ={441,11,12345678,12345,55};
//		int count2=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			int count1=0;
//			while(arr[i]>0)
//			{
//				arr[i] = arr[i]/10;
//				count1++;
//			}
//			
//			if(count1%2==0)
//			{
//				count2++;
//			}
//		}
//		System.out.println(count2);
//		
//	}
//
//}

//Search element in 2D array using Linear Search
//public class ArrayPrograms {
//
//	public static void main(String[] args) {
//		int n =3;
//		int[][] arr = {
//				{4,8,2},{9,1,6},{5,1,2}
//		};
//		int target = 20;
//		int count=0,row,col;
//		for( row=0;row<n;row++)
//		{
//			for( col=0;col<arr[row].length;col++)
//			{
//				if(arr[row][col] == target)
//				{
//					
//					count++;
//					break;
//				}
//				
//			}
//			if(count==1)
//			{
//				System.out.println("Index is "+row+" "+col);
//				break;
//			}
//		}
//		if(count==0)
//			System.out.println("Index not found");
//		
//	}
//
//}

//Search element in 2D array using Binary Search
//public class ArrayPrograms {
//	
//	static int[] search(int[][] array,int target)
//	{
//		int row = 0,column = array.length-1;
//		while(row<array.length && column >=0)
//		{
//			if(array[row][column] == target)
//			{
//				return new int[] {row,column};
//			}
//			if(array[row][column] < target)
//			{
//				row++;
//			}
//			else
//				column--;
//		}
//		return new int[] {-1,-1};
//	}
//
//	public static void main(String[] args) {
//		int[][] arr = {
//				{19,20,30,40},
//				{15,25,35,45},
//				{28,29,37,49},
//				{33,34,38,50}
//		};
//		
//		int target = 37;
//		int[] result= search(arr,target);
//		System.out.println(Arrays.toString(result));
//		
//		
//		
//	}
//
//}

//***************** BINARY SEARCH ***********
//public class ArrayPrograms
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
//public class ArrayPrograms
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
//public class ArrayPrograms
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

//**************** SORTING *****************
//BUBBLE SORT
//class ArrayPrograms {
//	public static void main(String[] args) {
//		int array[] = { 6, 1, 8, 2, 5 };
//		int temp = 0;
//		for (int i = 0; i < array.length; i++) {
//
//			for (int j = i + 1; j < array.length - i; j++) {
//				if (array[i] > array[j]) {
//					temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//
//				}
//
//			}
//
//		}
//
//		System.out.println(Arrays.toString(array));
//	}
//}

////SELECTION SORT
//class ArrayPrograms {
//	public static void main(String[] args) {
//		int array[] = { 6, 1, 8, 2, 5 };
//		int min;
//		for (int i = 0; i < array.length; i++) {
//			min = i;
//			for(int j=i+1;j<array.length;j++)
//			{
//				if (array[min] > array[j])
//					min = j;
//
//			}
//						
//				int temp = array[i];
//				array[i] = array[min];
//				array[min] = temp;
//
//		}
//		
//		System.out.println(Arrays.toString(array));
//	}
//}

//****************** INSERTION SORT *****************
/*
import java.util.Scanner;
public class ArrayPrograms {

	public static void main(String[] args) {
		int key,i,j;
		Scanner sc = new Scanner(System.in);
		int array[]= {12,31,25,8,32,17};
		System.out.println("\n\nBEFORE SORTING THE ARRAY :");
		for(i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		// *********** SORTING LOGIC ************
		for(i=1;i<array.length;i++)
		{
			key=array[i];
			j=i-1;
			while(j>=0 && array[j] > key)
			{
				array[j+1] = array[j];
				j--;
			}
			
			array[j+1] = key;
		}
		
		//********** DISPLAYING ARRAY ************ 
		System.out.println("\n\nAFTER SORTING THE ARRAY :");
		for(i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}
*/

//CYCLE SORT
//class ArrayPrograms {
//	public static void main(String[] args) {
//		int array[] = { 4,3,2,1,2 };
//		for (int i = 0; i < array.length; i++) {
//			int correct = array[i]-1;	//Formula
//			if(array[i] != array[correct] )
//			{
//				swap(array,i,correct);
//			}
//			
//		}
//		
//		System.out.println(Arrays.toString(array));
//
//	}
//
//	static int[] swap(int[] arr, int first, int second) {
//		int temp = arr[first];
//		arr[first] = arr[second];
//		arr[second] = temp;
//
//		 return arr;
//	}
//
//}

//******************* OR *****************
//class ArrayPrograms {
//
//	public static int[] findDisappearedNumbers(int[] nums) {
//        
//		int i=0;
//		while(i<nums.length) {
//			int correct = nums[i]-1;	//Formula
//			if(nums[i] != nums[correct] )
//			{
//				swap(nums,i,correct);
//			}
//			else
//				i++;
//			
//		}
//		
//		return nums;
//		
//		
//    }
//
//	static void swap(int[] arr, int first, int second) {
//		int temp = arr[first];
//		arr[first] = arr[second];
//		arr[second] = temp;
//
//		 //return arr;
//	}
//	
//	public static void main(String[] args) {
//		int[] nums = { 4,3,2,1,2 }; //4,3,2,7,8,2,3,1
//
//		int[] ans = findDisappearedNumbers(nums);
//		System.out.println(Arrays.toString(ans));
//
//	}
//}

//******************* MERGE SORT ******************
//class ArrayPrograms{
//	
//	static void merge(int[] arr,int low,int mid,int high)
//	{
//		int[] merged = new int[high - low +1];
//		int i=low;
//		int j=mid+1;
//		int k=0;
//		
//		while(i<=mid && j<=high)
//		{
//			if(arr[i]<=arr[j])
//			{
//				merged[k] = arr[i];
//				i++;
//				k++;
//			}
//			else
//			{
//				merged[k] = arr[j];
//				j++;
//				k++;
//			}
//		}
//		
//		while(i<=mid)
//		{
//			merged[k] = arr[i];
//			i++;
//			k++;
//		}
//		while(j<=high)
//		{
//			merged[k] = arr[j];
//			j++;
//			k++;
//		}
//		
//		for(int i1=0,j1=low;i1<merged.length; i1++,j1++)
//		{
//			arr[j1] = merged[i1];
//		}
//		
//	}
//	
//	static void MergeSort(int[] arr,int low,int high)
//	{
//		if(low>=high)
//			return;
//		
//			int mid=low+(high-low)/2;
//			MergeSort(arr,low,mid);
//			MergeSort(arr,mid+1,high);
//			merge(arr,low,mid,high);
//	}
//	
//	
//	public static void main(String[] args) {
//		int[] arr = {5,3,6,1,8,2};
//		MergeSort(arr,0,arr.length-1); 
//		System.out.println(Arrays.toString(arr));
//	}
//}

//****************	QUICK SORT ****************
//class ArrayPrograms{
//	
//	static int partition(int[] arr,int low,int high)
//	{
//		int pivot=arr[high];
//		int i = low-1;
//		
//		for(int j=low;j<high;j++)
//		{
//			if(arr[j]<pivot)
//			{
//				i++;
//				//swap
//				int temp = arr[i];
//				arr[i] = arr[j];
//				arr[j]=temp;
//			}
//				
//		}
//		 
//		i++;
//		int temp=arr[i];
//		arr[i]=pivot;
//		arr[high] = temp;
//		return i;
//	}
//	
//	static void Qsort(int[] arr,int low,int high)
//	{
//		if(low<high) {
//			int location = partition(arr,low,high);
//			Qsort(arr,low,location-1);
//			Qsort(arr,location+1,high);
//		}
//	}
//	
//	public static void main(String[] args) {
//		int[] arr = {5,4,3,2,1};
//		Qsort(arr,0,arr.length-1);
//		System.out.println(Arrays.toString(arr));
//		
//	}
//}

//********************* ARRAY ROTATE RIGHT SHIFT ********************
//class ArrayPrograms
//{
//	public static int[] rotate(int[] nums, int k) {
//      
//		int index = nums.length-1;
//		for(int j=1;j<=k;j++)
//		{
//			int last = nums[index];
//			for(int i=index;i>0;i--)
//			{
//				nums[i] = nums[i-1];
//				
//			}
//			nums[0] = last;
//		}
//		
//		return nums;
//		
//  }
//	
//	public static void main(String[] args) {
//		int[] nums = {1,2,3,4,5,6,7}; 
//		int k = 3;
//		int[] ans = rotate(nums,k);
//		System.out.println(Arrays.toString(ans));
//	}
//}


//********************* LEFT ROTATE ****************
//class LeetCode
//{
//	public static int[] rotate(int[] nums, int k) {
//      
//		int index = nums.length-1;
//		for(int j=1;j<=k;j++)
//		{
//			int first = nums[0];
//			for(int i=0;i<nums.length-1;i++)
//			{
//				nums[i] = nums[i+1];
//				
//			}
//			nums[index] = first;
//		}
//		
//		return nums;
//		
//  }
//	
//	public static void main(String[] args) {
//		int[] nums = {1,2,3,4,5,6,7}; 
//		int k = 3;
//		int[] ans = rotate(nums,k);
//		System.out.println(Arrays.toString(ans));
//	}
//}


//*****************	MERGER TWO ARRAY ***************
//class ArrayPrograms {
//
//	static void merge1(int[] arr1, int[] arr2) {
//		int len1 = arr1.length;
//		int len2 = arr2.length;
//		int[] arr3 = new int[len1 + len2];
//		int i = 0, j = 0, k = 0;
//
//		while (i <= len1 - 1 && j <= len2 - 1) {
//			if (arr1[i] < arr2[j]) {
//				arr3[k] = arr1[i];
//				i++;
//				k++;
//			} else {
//				arr3[k] = arr2[j];
//				k++;
//				j++;
//			}
//		}
//
//		while (i <= len1 - 1) {
//			arr3[k] = arr1[i];
//			i++;
//			k++;
//		}
//		while (j <= len2 - 1) {
//			arr3[k] = arr2[j];
//			j++;
//			k++;
//		}
//
//		System.out.println(Arrays.toString(arr3));
//	}
//
//	public static void main(String[] args) {
//		int[] arr1 = { 1, 3, 5, 7, 9 };
//		int[] arr2 = { 2, 4, 6 };
////		int len1=arr1.length;
////		int len2=arr2.length;
////		int[] arr3 = new int[len1+len2];
//		merge1(arr1, arr2);
//
//	}
//}

//class LeetCode {
//
//	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
////		int len1 = nums1.length;
////		int len2 = nums2.length;
//		//int[] arr3 = new int[len1 + len2];
//		 //int[] nums1 = new int[m+n];
//		int i = 0, j = 0, k = 0;
//
//		while (i <= m - 1 && j <= n - 1) {
//			if (nums1[i] < nums2[j]) {
//				nums1[k++] = nums1[i++];
//			} 
//			if(nums1[i]==0)
//			{
//				nums1[k++]=nums2[j++];
//			}
//			else {
//				nums1[k++] = nums2[j++];
//			}
//		}
//
//		while (i <= m - 1) {
//			nums1[k] = nums1[i];
//			i++;
//			k++;
//		}
//		while (j <= n - 1) {
//			nums1[k] = nums2[j];
//			j++;
//			k++;
//		}
//
//		System.out.println(Arrays.toString(nums1));
//	}
//
//	public static void main(String[] args) {
//		int[] arr1 = { 1,2,3,0,0,0 };
//		int[] arr2 = { 2,5,6 };
//		int m=3;
//		int n=3;
//		merge(arr1,m, arr2,n);
//		
//	}
//}
