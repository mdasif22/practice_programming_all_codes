package Competitive_Programming;

import java.util.*;

//PROGRAM TO PRINT SUM OF NUMBER FOR GIVEN ITERATION..
/*
class CodeChef {
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		 for(int i=1;i<=t;i++)
		 {
			 int sum=0;
			 int d=sc.nextInt();
			 int c=sc.nextInt();
			 for(int j=1;j<=d;j++)
			 {
				 while(c!=0)
				 {
					 sum=sum+c;
					 
					 c--;
				 }
				 c=sum;
				 sum=0;
			}
			System.out.println(c);
			 }
		 }
		 
		 
	}
*/
//--------------------------------------------------------------------------------------

//Prime number program..
/*
import java.util.*;

class CodeChef {
	public static void main(String args[]) {
		 int count = 0;
		for (int i = 1; i <= 100; i++) {
			int temp = 0;
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					temp = temp + 1;
					
				}
			}
			if (temp == 0) {
				System.out.println(i);
			} 

		}
	}
}
*/
 //----------------------------------------------------------
//PROGRAM FOR FACTORIAL OF A NUMBER
/*
class CodeChef 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fec=1;
		while(num>0)
		{
			fec=fec*num;
			num--;
		}
		System.out.println(fec);
	}
}
*/
//---------------------------------------------------------------
// SORTING AN ARRAY
/*
import java.util.Arrays;
import java.util;   
class CodeChef
{
	public static void main(String args[])
	{
		int i,j,temp;
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY..");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("ENTER ELEMENTS OF ARRAY..");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("AFTER SORING THE ARRAY..");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
*/
//-------------------------------------------------------
//PROGRAM FOR DISCOUNT
/*
class CodeChef
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1;i<=T;i++)
		{
			
			double purchase=sc.nextDouble();
			double price=sc.nextDouble();
			double total=purchase*price;
			if(purchase>1000)
			{
				total=total-(total*0.1);
			}
			
			System.out.println(total);
			
		}
	}
}
*/
//--------------------------------------------------
// SEARCHING PROGRAM IN ARRAY 
/*
class CodeChef
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY..");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("\nENTER ELEMENTS OF ARRAY..");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("\nELEMENTS IN ARRAY ARE : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("ELEMENT "+arr[i]+" IS PRESENT AT INDEX "+i); 
		}
		System.out.println("\n\nENTER THE NUMBER TO SEARCH IN ARRAY..");
		int search=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("ELEMENT "+search+" IS PRESENT AT INDEX "+i);
			}
		}
	}
}
*/
//--------------------------------------------------------------
//REVERSE OF A NUMBER INTEGER
/*
class CodeChef
{
	public static void main(String args[])
	{
		int reverse=0,remeinder;
		Scanner sc =new Scanner(System.in);
		System.out.println("\nENTER THE NUMBER..");
		int num=sc.nextInt();
		int temp=num;
		while(num>0)
		{
			remeinder=num%10;
			reverse=reverse*10+remeinder;
			num=num/10;
		}
		System.out.println("\nREVERSE OF NUMBER = "+reverse);
		if(temp==reverse)
		{
			System.out.println("\n"+temp+" IS PALINDROM NUMBER..");
		}
		else
			System.out.println("\n"+temp+" IS NOT PALINDROM NUMBER..");
	}
}
*/
//--------------------------------------------------------------------
//REVERSE OF A STRING
/*
class CodeChef
{
	public static void main(String args[])
	{
		String reverse="",temp;
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE STRING..");
		String str=sc.nextLine();
		temp=str;
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("AFTER STRING REVERSE : "+reverse);
		if(temp.equals(reverse))
		{
			System.out.println("\n"+temp+" IS PALINDROM STRING..");
		}
		else
			System.out.println("\n"+temp+" IS NOT PALINDROM STRING..");
	}
}
*/
//---------------------------------------------------------------
/*
//Number of vacation can have. 
class CodeChef
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int count=0;
		int sum=0;
		int j;
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int w=sc.nextInt();
			int arr[] = new int[n];
			
			for(j=0;j<arr.length;j++)
			{
				arr[j]= sc.nextInt();
			}
			Arrays.sort(arr);
			for(int k=arr.length-1;k>=0;k--)
			{
				sum=sum+arr[k];
				count++;
				if(sum>=w){
			           System.out.println(n-count);
			           break;
			        }
			}
			
		}
		
	}
}
*/
//-----------------------------------------------------------------
//Region A B C
/*
class CodeChef
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
			if((a+c)>=b)
			{
				System.out.println(a+c);
			}
			else
				System.out.println(b);
		}
	}
}
*/
//--------------------------------------------------
//Contest
/*
class CodeChef
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int x=sc.nextInt();
			int time=10-x;
			if(time>=3)
			    System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
//-----------------------------------------------------
*/
/* Game Play
class CodeChef
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int sum=0;
			int x=sc.nextInt();
			int y=sc.nextInt();
			while(y>0)
			{
				x=x+1;
				y--;
			}
			if(x%2==0)
			{
				System.out.println("Janmansh");
			}
			else
				System.out.println("Jay");
		}
	}
}
*/

/*
//Fruit price
class CodeChef {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int sum = 0;
			int x = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int num1 = a + b;
			int num2 = b + c;
			int num3 = a + c;
			if (num1 < num2 && num1 < num3) {
				if (a < b) {
					a = a * (x - 1);
					System.out.println(a + b);
				} else {
					b = b * (x - 1);
					System.out.println(a + b);
				}

			} else if (num2 < num3) {

				if (b < c) {
					b = b * (x - 1);
					System.out.println(b + c);
				} else {
					c = c * (x - 1);
					System.out.println(c + b);
				}

			} else {

				if (a < c) {
					a = a * (x - 1);
					System.out.println(a + c);
				} else {
					c = c * (x - 1);
					System.out.println(c + a);
				}

			}

		}
	}
}
*/

//--------------------------------------------------
//class CodeChef
//{
//	public static void main(String args[])
//	{
//		
//		Scanner sc = new Scanner(System.in);
//		int t=sc.nextInt();
//		for(int i=0;i<t;i++)
//		{
//			int n=sc.nextInt();
//			int k=sc.nextInt();
//			if(n%10!=0)
//				System.out.println((n/k)+1);
//			else
//				System.out.println(n/k);
//		}
//	
//	}
//}
/*
class CodeChef
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int count=0;
			int n=sc.nextInt();
			int x=sc.nextInt();
			int a[] = new int[n];
			
			for(int j=0;j<n;j++)
			{
				a[j] =  sc.nextInt();
			}
			
			boolean flag = false;
			for(int j=a.length-1;j>=0;j--)
			{
				if(a[j] >= x)
				{
					if(flag == true) {
						count++;
					}
				  continue;					
				}
				else {
					flag = true;
					count++;
				}
			}
			System.out.println(count);
		}
	    
	}
}
*/

/*
class codechef_part2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			char[] ch = new char[n];
			for(int j=0;j<n;j++)
			{
				ch[j]=sc.next().charAt(0);
			}
			int count =0;
			char last = '0';
			for(int k=0;k<n;)
			{
				
				if(k<n-1) {
				count++;
				
				if(ch[k] == ch[k+1])
				{
					
					k=k+2;
					last = ch[k];
				}
				else
				{
					k=k+1;
					last = ch[k];
				}
				}
				else {
					if(ch[k] != ch[k-1]) {
						count++;
						//System.out.println(last);
						k = k+1;
					}else if (last == ch[n-1]) {
						count++;
						break;
					}			
				}	
			}
			
			for(int j=0;j<n;j++);
			{
				System.out.println(count);
			}
		}
	    
	}
}
*/

//****** MINIMUN JUMP ********
//class rough
//{	
//	public static void main (String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-->0){
//		    int x = sc.nextInt();
//		    int y = sc.nextInt();
//		    int count=0;
//		    while(x>0){
//		    	if(x-y>=y || x-y==0) {
//		    		x=x-y;
//		    		count++;
//		    	}
//		    	else
//		    	{
//		    		x--;
//		    		count++;
//		    	}
//		    }
//		    System.out.println(count);
//		}
//	}
//		
//}



