package Numbers_Program;
import java.util.*;
//public class numbers {
//
//	static int square(int num) {
//		int sum = 0;
//		while(num>0) {
//			int rem = num%10;
//			sum+=rem*rem;
//			num/=10;
//		}
//		return sum;
//	}
//	
//	public static void main(String[] args) {
////	Scanner sc = new Scanner(System.in);
//	int num = 84;
//	int result=num;
//	
//	while(result!=1 && result != 4) {
//		result = square(result);
//	}
//	
//	if(result == 1)
//		System.out.println("It is happy number");
//	else if(result == 4)
//		System.out.println("It is not happy number");
//	
//	}
//
//}

//Swap two numbers without third variable
//class numbers{
//	public static void main(String[] args) {
//		int a=10;
//		int b=20;
//		System.out.println(a+" "+b);
//		
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		System.out.println(a+" "+b);
//	}
//}


//Armstrong number
//class numbers{
//    static String armstrongNumber(int n){
//        int count = 0;
//        int temp1 = n;
//        int temp2 = n;
//        
//        while(temp1>0){
//            count++;
//            temp1/=10;
//        } 
//        
//        int sum = 0;
//        while(temp2>0){
//            int rem=temp2%10;
//            sum+=(Math.pow(rem, count));
//            temp2/=10;
//        }
//        if(sum == n){
//            return "Yes";
//        }
//        else{
//           return "No"; 
//        }
//    }
//
//	
//	public static void main(String[] args) {
//		System.out.println(armstrongNumber(153));
//	}
//}


//Problem 342
//class numbers {
//
//	public static boolean isPowerOfFour(int n) {
//
//		if (n == 1)
//			return true;
//
//		if (n % 4 != 0 || n == 0)
//			return false;
//
//		return isPowerOfFour(n / 4);
//	}
//
//	public static void main(String[] args) {
//		System.out.println(isPowerOfFour(0));
//
//	}
//}


//Problem 326
//class numbers{
//	
//	public static boolean isPowerOfThree(int n) {
//        
//		if(n==1)return true;
//	    
//	    if(n%3!=0 || n==0)return false;
//	    
//	    return isPowerOfThree(n/3);
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(isPowerOfThree(20));
//		
//	}
//}


//Problem 231
//class numbers{
//	
//	public static boolean isPowerOfTwo(int n) {
//        
//		if(n==1)return true;
//	    
//	    if(n%2!=0 || n==0)return false;
//	    
//	    return isPowerOfTwo(n/2);
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(isPowerOfTwo(32));
//		
//	}
//}

//Factorial
//class numbers {
//	static long factorial(int N){
//        int temp = N;
//        long sum = 1;
//
//        while(temp>0) {
//        	sum*=temp;
//        	temp--;
//        }
//        return sum;
//    }
//	
//	public static void main(String[] args) {
//		System.out.println(factorial(5));
//	}
//}


//Problem 168
//class numbers{
//	
//	public static String convertToTitle(int columnNumber) {
//        String result = "";
//        int n = columnNumber;
//        while(n>0){
//            char c = (char) ('A' + (n-1)%26);
//            result = c+result;
//            n=(n-1)/26;
//        }
//        
//        return result;
//    }
//	
//	public static void main(String[] args) {
//		System.out.println(convertToTitle(29));
//	}
//}


//Fibonacci series
//public class recursion {
//
//	static void display(int n) {
//		int a = 0;
//		int b = 1;
//		for (int i = 2; i < 10; i++) {
//
//			int c = a + b;
//			System.out.println(a + " + " + b + " = " + c);
//			a = b;
//			b = c;
//
//		}
//
//	}


//Problem 628
//class numbers{
//	
//	 public static int maximumProduct(int[] nums) {
//	        Arrays.sort(nums);
//	        int len = nums.length;
//	            int a = nums[0] * nums[1] * nums[len -1];
//	            int b = nums[len - 1] * nums[len - 2] * nums[len - 3];
//	            
//	            return a > b ? a : b;
//	    }
//	
//	public static void main(String[] args) {
//		int[] num= {-100,-98,-1,2,3,4};
//		System.out.println(maximumProduct(num));
//	}
//}


class numbers{
	
	 
	
	public static void main(String[] args) {
		
	}
}