import java.util.Scanner;
/*
public class StringReverse {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String temp = str;
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("\nString before reversal= "+str);
		System.out.println("\nString after reversal= "+rev);
		if (temp.equals(rev)) {
			System.out.println("\nIt is palindrom...");
		} else
			System.out.println("\nNot palindrom...");
	}
}
*/
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
			
		}*/
		
		
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


