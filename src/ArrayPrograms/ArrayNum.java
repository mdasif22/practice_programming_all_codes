package ArrayPrograms;
import java.util.*;
//---------------------------------------------------------
//INTEGER REVERSAL
/*
public class StringReverse
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int num=666;
		int temp=num;
		int rem,rev=0;
		while(num>0)
		{
		    rem=num%10;
		    rev=rev*10+rem;
		    num=num/10;
		}
		if(temp==rev)
		{
		    System.out.println("Palindrom number..");
		}
		else{
		    System.out.println("Not Palindrom number..");
		}
	}
}
*/
//------------------------------------------------------
//Prime number program..
/*
import java.util.*;
class StringReverse
{
	public static void main(String args[])
	{
		System.out.println("Enter any number..");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp=0,count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
				count++;
			}	
		}
		if(temp>0)
		{
			System.out.println(num+" is not prime number and divided by "+count+" numbers");
		}
		else
			System.out.println(num+" is a prime number..");
	}
}
*/
//--------------------------------------------------
// MINIMUM NUMBER IN AN ARRAY
/*
class StringReverse
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int arr[]= {55,19,81,34,47};
		//int[] arr=new int[5];
		int min = arr[0];
		int i,j;
		//System.out.println("ENTER THE ARRAY VALUES..");
		
		/*for(i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		
		for(j=1;j<arr.length;j++)
		{
			
			if(min>arr[j])
			{
				min=arr[j];
			}
		}
		System.out.println("MINIMUM VALUE IS : "+min);
	}
}
*/
//***************************************************
//MAXIMUM NUMBER IN AN ARRAY
/*
class StringReverse
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int arr[]=new int[5];
		int min = arr[0];
		int i,j;
		System.out.println("ENTER THE ARRAY VALUES..");
		
		for(i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		
		for(j=1;j<arr.length;j++)
		{
			
			if(min<arr[j])
			{
				min=arr[j];
			}
		}
		System.out.println("MAXIMUM VALUE IS : "+min);
	}
}
*/
//***********************************************************
/*
// Duplicates values in Array
public class StringReverse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,k,count=0;
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int j : arr)
		{
			System.out.println("Elements are "+j);
		}
		
		
		for(i=0;i<arr.length;i++)
		{
			for(k=i+1;k<arr.length;k++)
			{
				if(arr[i] == arr[k])
				{
					System.out.println("Duplicate values are"+arr[k]);
					count++;
				}
			}
		}
		System.out.println(count+" Values are duplicate");
			
	}
}
*/
//----------------------------------------------------------
/*
//Reverse Array Elements
class StringReverse
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int j=0; j< arr.length;j++)
		{
			System.out.println("Array Elements are "+arr[j]);
		}
		
		for(int j = arr.length-1;j>=0;j--)
		{
			System.out.println("Reversed Elements are "+arr[j]);
		}
	}
}
*/
//***************************************************
/*
//Second largest in array
class StringReverse
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp;
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int j=0; j< arr.length;j++)
		{
			System.out.println("Array Elements are "+arr[j]);
		}
		System.out.println(arr[arr.length-2]);
	}
}
*/

//**************** REMOVE DUPLICATE VALUES FROM ARRAY ************************
/*
public class ArrayNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,1,2};
		int num1=arr.length;
//		for(int i=0;i<num1;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
		
		Arrays.sort(arr);
		
		//Method 1
//		int j = 0; 
//    for (int i=0; i < num1-1; i++){  
//        if (arr[i] != arr[i+1]){  
//            arr[j++] = arr[i];  
//        }  
//		}
//    
//		arr[j++] = arr[num1-1];
		
		//Method 2 optimal way
		int i=0;
      for(int j=1;j<arr.length;j++){
          if(arr[j]!=arr[i]){
              i++;
              arr[i] = arr[j];
          }
      }

		
		for(int k=0;k<i;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
*/