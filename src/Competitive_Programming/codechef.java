package Competitive_Programming;
import java.util.ArrayList;
import java.util.Scanner;


//Problem to upload picture on facebook
//class codechef{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//	int l = sc.nextInt();
//	int n = sc.nextInt();
//	for(int i =0;i<n;i++)
//	{
//		int w = sc.nextInt();
//		int h = sc.nextInt();
//		
//		if((w < l) | (h < l))
//			System.out.println("UPLOAD ANOTHER");
//		else if((w > l) && (h>l))
//			System.out.println("CROP IT");
//		else
//			System.out.println("ACCEPTED");
//	}
//		
//	}
//}

//Reverse the String Upper to Lower or vise versa
//class codechef{
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	String str = sc.nextLine();
//	StringBuilder s = new StringBuilder(str);
//	
//	for(int i =0;i<str.length();i++)
//	{
//		char c = s.charAt(i);
//		if(Character.isLowerCase(c))
//		{
//			s.replace(i, i+1, String.valueOf(c).toUpperCase());
//		}
//		else if(Character.isUpperCase(c))
//			s.replace(i, i+1, String.valueOf(c).toLowerCase());
//	}
//	System.out.println(new String(s));
//		
//	}
//}

//Number of Possible SubStrings
//class codechef{
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	String str = sc.next();
//	int n = str.length();
//	System.out.println("Possible Substrings are = "+(n*(n+1))/2);
//		
//	}
//}

//class codechef
//{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t>0)
//		{
//			double a = 8;
//			double b=5;
//		   int c = sc.nextInt();
//		    double ans = (a+b)/2;
//		    System.out.println(ans);
//		    if(ans > c)
//		        System.out.println("Yes");
//		    else
//		        System.out.println("No");
//		    t--;
//		}
//	}
//}

//class codechef
//{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t>0)
//		{
//			int km = 300*10;
//		    int x = sc.nextInt();
//		    int ans = x*10;
//		    if(ans > km)
//		        System.out.println(ans);
//		    else
//		        System.out.println(km);
//		    t--;
//		}
//	}
//}

//class codechef
//{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-->0)
//		{
//			int w = sc.nextInt();
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			int z = sc.nextInt();
//		    
//			if (x==w || y == w || z == w) {
//				System.out.println("YES");
//			} else if ((x + y)==w || (x + z)==w || (y + z)==w) {
//
//				System.out.println("YES");
//			} else {
//				System.out.println("NO");
//			}
//		}
//	}
//}

//class codechef
//{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-->0)
//		{
//			int n = sc.nextInt();
//			System.out.println((n*n)/2);
//		}
//	}
//}


//class codechef{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-->0)
//		{
//			int x = sc.nextInt()*4;
//			int y = sc.nextInt()*2;
//			int z = sc.nextInt()*0;
//			int ans = x+y;
//			System.out.println(ans);
//		}
//	}
//}


//class codechef{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-->0)
//		{
//			int x = sc.nextInt();
//			int p = sc.nextInt();
//			int q = sc.nextInt();
//			int ans = (p-q)*x;
//			System.out.println(ans);
//		}
//	}
//}


//class codechef{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		
//		while(t-->0)
//		{
//			
//			int n = sc.nextInt();
//			int[] k = new int[5];
//			for(int i=0;i<n;i++)
//			{
//				
//				k[i]=sc.nextInt();
//				System.out.println(k[i]);
//			}
//		}
//	}
//}


//class codechef{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		
//		while(t-->0)
//		{
//			
//			int n = sc.nextInt();
//			int[] a = new int[n];
//			int[] b = new int[n/2];
//			int[] c = new int[n/2];
//			int j=0,k=0;
//			for(int i=0;i<n;i++)
//			{
//				a[i] = sc.nextInt();
//			}
//			
//			if(n%2!=0)
//			{
//				System.out.println("No");
//				continue;
//			}
//				
//			for(int i=0;i<n;i=i+2)
//			{
//				b[j++]=a[i];
//				c[k++]=a[i+1];
//			}
//			int count1=0;
//			int count2=0;
//			for(int i=0;i<n/2-1;i++)
//			{
//				if(b[i]==b[i+1])
//				{
//					continue;
//				}
//				else
//					count1++;
//					
//			}
//			
//			for(int i=0;i<n/2-1;i++)
//			{
//				if(c[i]==c[i+1])
//				{
//					continue;
//				}
//				else
//					count2++;
//					
//			}
//			
//			if(count1==count2)
//				System.out.println("Yes");
//			else
//				System.out.println("No");
//		}
//	}
//}


//class codechef{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-->0) {
//			double a = sc.nextInt();
//			double x = sc.nextInt();
//			double b = sc.nextInt();
//			double y = sc.nextInt();
//			
//			double i = a/x;
//			double j = b/y;
//			
//			if(i == j)
//				System.out.println("Equal");
//			if(i>j) {
//				System.out.println("Alice");
//			}
//			if(i<j)
//				System.out.println("Bob");
//			
//		}
//	}
//}


class codechef{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			
		}
	}
}

