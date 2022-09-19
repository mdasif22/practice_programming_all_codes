package Bit_Manipulation;
import java.math.*;
import java.util.Arrays;
import java.util.Scanner;
//Get bit Operation
//Formula = perform AND with bitmask
//public class Bit {
//
//	public static void main(String[] args) {
//		
//		int n = 5; // 0101
//		int pos = 3; //index 2 
//		int bitmask = 1<<pos; // 0100
//		if((bitmask & n) == 0)
//		{
//			System.out.println("bit was zero");
//		}
//		else
//			System.out.println("bit was one");
//	}
//
//}

////Set bit Operation
//Set bit is used to convert from 0 to 1
//Formula = perform OR with bitmask
//public class Bit {
//
//	public static void main(String[] args) {
//		
//		int n = 5; // 0101
//		int pos = 1; //index 0 
//		int bitmask = 1<<pos; // 0100
//		int newNumber = bitmask | n ;
//			System.out.println(newNumber);
//	}
//
//}

//Clear bit Operation
//Clear bit is used to convert from 1 to 0
// Formula = perform AND with NOT (of bitmask)
//public class Bit {
//
//	public static void main(String[] args) {
//		
//		int n = 5; // 0101
//		int pos = 2; //index 1 
//		int bitmask = 1<<pos; // 0100
//		int notBitmask = ~(bitmask);
//		int newNumber = notBitmask & n ;
//		System.out.println(newNumber);
//	}
//
//}

//Update bit Operation
/* Case 1: To convert from 1 to 0, we will perform clear bit operation(AND with NOT (of bitmask))
   Case 2: To convert from 0 to q, we will perform set bit operstion(OR with bitmask) */
//import java.util.*;
//public class Bit {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = 5; // 0101
//		int pos = 1; //index 10
//		int bitmask = 1<<pos; // 0100
//		System.out.println("Enter 0) For Clear bit operation");
//		System.out.println("Enter 1) For Set bit operation");
//		int operation = sc.nextInt();
//		
//		if(operation == 1)
//		{
//			int newNumber = bitmask | n;
//			System.out.println("After Set bit Operation : "+newNumber);
//		}
//		else
//		{
//			int newBitmask = ~(bitmask);
//			int newNumber = newBitmask & n ;
//			System.out.println("After Clear bit Operation : "+newNumber);
//			
//		}
//	}
//
//}

//Program to check Even Odd using BIT MANIPULATION 
//Perform (num &(AND) 1) to check its even or odd
//import java.util.*;
//public class Bit {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		if((num & 1) == 0)
//		{
//			System.out.println("It is even number");
//		}
//		else
//			System.out.println("It is odd number");	
//	}
//
//}

//WAP to find only non-repeating elements using XOR(^)
//import java.util.*;
//public class Bit {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//	int num[] = {5,1,4,3,5,1,4};
//		//int num[] = {2, 3, 5, 4, 5, 3, 4};

//Formula 1 
//		int ans = num[0];
//        for (int i = 1; i < num.length; i++)
//            ans = ans ^ num[i];
//		System.out.println(ans);

//Formula 2
//		int ans = 0;
//		for (int j : num)
//		    ans = ans ^ j;
//			System.out.println(ans);
//	}
//
//}

//WAP to count number of '1' or '0' in number using XOR(^)
//import java.util.*;
//public class Bit {
//
//	public static void main(String[] args) {
//		int count=1;
//		int num = 3;
//		Scanner sc = new Scanner(System.in);
//		if((num & 1) == 1)
//			{
//				count++;
//			}
//			
//		System.out.println(count);	
//	}
//
//}

// ********** CONVERT DECIMAL TO BINARY **************
//class Bit{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		for(int i=0;i<4;i++)
//		{
//			String input = sc.nextLine();
//			int decimal = Integer.parseInt(input);
//			System.out.println(Integer.toBinaryString(decimal)); 
//		}
//	}
//}

//public class Bit{ 
//	
//	public static String addBinary(String a, String b) {
//		int decimal1=Integer.parseInt(a,2);
//		int decimal2=Integer.parseInt(b,2);
//		int result = decimal1 + decimal2;
//		return String.valueOf(Integer.toBinaryString(result));
//    }
//	
//	public static void main(String args[]){  
//	String binaryString="1010";  
//	String a = "11", b = "1";
//	String ans = addBinary(a,b);
//	System.out.println(ans);  
//	}
//}  


//Binary to decimal
//class Bit{
//	public static void main(String[] args) {
//		int binary = 1111;
//		int decimal = 0,i = 0;
//		while(binary>0) {
//			int rem = binary%10;
//			binary/=10;
//			decimal = decimal + rem*(int)Math.pow(2,i++);
//		}
//		System.out.println(decimal);
//	}
//}

//Decimal to binary
// Using string
//class Bit{
//	public static void main(String args[]) {
//		int num = 5;
//		int temp = num;
//		String str = "";
//		while(temp>0) {
//			int rem = temp%2;
//			temp/=2;
//			str = rem+str;
//		}
//		System.out.println(str);
//	}
//}


// OR using array
class Bit{
	public static void main(String args[]) {
		int num = 5;
		int temp = num;
		int index = 0;
		int[] array = new int[10];
		while(temp>0) {
			int rem = temp%2;
			temp/=2;
			array[index++] = rem;
		}
		
		for(int i=index-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
	}
}
