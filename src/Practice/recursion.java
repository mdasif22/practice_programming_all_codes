package Practice;

//Fibonacci series normal
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
//
//	public static void main(String[] args) {
//		int n = 15;
//		display(n);
//	}
//
//}

//Fibonacci series using recursion
//public class recursion {
//
//	static int a = 0;
//	static int b = 1,c=0;
//	static void display(int n) {
//		
//		if(n>0){
//			c = a+b;
//			System.out.println(a+" + "+b+" = "+c);
//			a=b;
//			b=c;
//			display(n-1);
//		}
//		else {
//			return;
//		}
//	}
//
//	public static void main(String[] args) {
//		int n =10;
//		display(n-2);
//	}
//
//}

//Binary search using recursion
//public class recursion {
//
//	static int search(int[] arr,int target,int low,int high)
//	{
//		if(low>=high)
//		{
//			if(arr[low]==arr[high])
//				return low;
//			else {
//				return 0;
//			}
//		}
//		else {
//			int mid = (low+high)/2;
//			
//			if(target == arr[mid])
//				return mid;
//			else if(target < arr[mid])
//				return search(arr, target, low, mid-1);
//			else {
//				return search(arr, target, mid+1, high);
//			}
//		
//		}
//	}
//
//	public static void main(String[] args) {
//		int target =8;
//		int[] arr = {1,2,3,4,5,6,7,8};
//		int ans = search(arr,target,0,arr.length-1);
//		System.out.println(ans);
//		
//	}
//
//}

//Factorial using normal
//class numbers {
//	static long factorial(int N){
//      int temp = N;
//      long sum = 1;
//
//      while(temp>0) {
//      	sum*=temp;
//      	temp--;
//      }
//      return sum;
//  }
//	
//	public static void main(String[] args) {
//		System.out.println(factorial(5));
//	}
//}


//Factorial recursion
//public class recursion {
//
//	static int mul =1;
//	static int FactorRecusion(int n)
//	{
//		if(n>0)
//		{
//			mul = mul * n;
//			FactorRecusion(n-1);
//		}
//		
//		return mul;
//	}
//	
//	public static void main(String[] args) {
//		int n =5;
//		int ans = FactorRecusion(n);
//		System.out.println(ans);
//	}
//
//}

////Sum of digits
//public class recursion {
//
//	static int sum =0;
//	// Normal Method
////	static int sumofdigit(int n)
////	{
////		while(n>0)
////		{
////			int rem = n %10;
////			n = n/10;
////			sum = sum + rem;
////		}
////		
////		return sum;
////	}
//	
//	//Using recursion
//	static int sumofdigit(int n)
//	{
//		if(n>0)
//		{
//			int rem = n % 10;
//			n = n/10;
//			sum = sum + rem;
//			sumofdigit(n);
//		}
//		
//		return sum;
//	}
//	
//	public static void main(String[] args) {
//		int n =2513;
//		int ans = sumofdigit(n);
//		System.out.println(ans);
//	}
//
//}

//Reverse of digits
//public class recursion {
//
//	static int reverse =0;
//	
//	// Normal Method
////	static int reverseofdigit(int n)
////	{
////		while(n>0)
////		{
////			int rem = n % 10;
////			n = n/10;
////			reverse = (reverse*10) + rem;
////		}
////		
////		return reverse;
////	}


//	Using recursion
//	static int reverseofdigit(int n)
//	{
//		if(n>0)
//		{
//			int rem = n % 10;
//			n = n/10;
//			reverse = (reverse*10) + rem;
//			reverseofdigit(n);
//		}
//		
//		return reverse;
//	}
//	
//	public static void main(String[] args) {
//		int n =2531;
//		int ans = reverseofdigit(n);
//		System.out.println(ans);
//	}
//
//}

//Pattern1
//class recursion{
//	
//	static void triangle(int row, int col) {
//		if (row == 0)
//			return;
//		if (col < row) {
//			//System.out.print("*");  for reverse triangle
//			triangle(row, col + 1);
//			System.out.print("*");
//
//		} else {
//			//System.out.println();  for reverse triangle
//			triangle(row - 1, 0);
//			System.out.println();
//
//		}
//
//	}
//	public static void main(String[] args) {
//		triangle(5,0);
//	}
//}

// Reverse String using recursion ( NOT COMPLETED )
//class recursion{
//	
//	static void swap(char charAt1, char charAt2) {
//		StringBuffer buffer = new StringBuffer();
//		char temp = charAt1;
//		charAt1=charAt2;
//		charAt2=temp;
//		
//		buffer = buffer.append(charAt1);
//		System.out.println(buffer);
//	}
//	
//	
//	static StringBuffer reverse(StringBuffer s,int i,int j)
//	{
//		
//		if(i>j)
//			return s;
//		
//		swap(s.charAt(i),s.charAt(j));
//		i++;
//		j--;
//		
//		return reverse(s,i,j);
//		//return s;
//		
//	}
//	
//
//	public static void main(String[] args) {
//		String str = "asif";
//		StringBuffer s = new StringBuffer(str);
//		reverse(s,0,s.length()-1);
//		System.out.println(new String(s));
//		
//	}
//}

//********** PALINDROM *********
//class recursion{
//	
//	
//	static boolean check(String s,int i,int j)
//	{
//		if(i<=j)
//		{
//			if(s.charAt(i)!=s.charAt(j))
//			{
//				return false;
//			}
//			else {
//				return check(s,i+1,j-1);
//			}
//				
//		}
//		return true;
//		
//	}
//	
//
//	public static void main(String[] args) {
//		String str = "asif";
//		boolean ans = check(str,0,str.length()-1);
//		//System.out.println(ans);
//		if(ans)
//		{
//			System.out.println("Palindrom");
//		}
//		else
//		{
//			System.out.println("Not");
//		}
//		
//	}
//}

//******** SUBSEQUENCE STRING ******
class recursion{
	
	static void subseq(String p,String up)
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return;
		}
			
		char c = up.charAt(0);
		subseq(p+c,up.substring(1));
		subseq(p,up.substring(1));
	}
	
	public static void main(String[] args) {
		subseq("","abc");
		
	}
}

// ************* RETURN ARRAYLIST ***********
//import java.util.ArrayList;
//import java.util.List;
//class recursion{
//	
//	static List<String> subseq(String p, String up) {
//
//		if (up.isEmpty()) {
//			List list = new ArrayList();
//			list.add(p);
//			return list;
//		}
//
//		char c = up.charAt(0);
//		List<String> left = subseq(p + c, up.substring(1));
//		List<String> right = subseq(p, up.substring(1));
//
//		right.addAll(left);
//		return right;
//	}
//	
//	public static void main(String[] args) {
//		List ans = subseq("","abc");
//		System.out.println(ans);
//		
//	}
//}

//****************** MAZE PROBLEM *******************
//class recursion{
//	
//	static int countPath(int row , int col)
//	{
//		if(row==1 || col==1)
//			return 1;
//		
//		int left = countPath(row-1,col);  //Left tree call
//		int right = countPath(row,col-1); // Right tree call
//		return left+right;
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(countPath(3,3));
//	}
//}


//Printing its path
//class recursion{
//	
//	static void Path(String p,int row , int col)
//	{
//		if(row==1 && col==1)
//		{
//			System.out.println(p);
//			return;
//		}
//		
//		
//		if(row>1)
//		{
//			Path(p+"D" ,row-1 ,col);	//Left tree call
//		}
//		if(col>1)
//		{
//			Path(p+"R" ,row ,col-1);	//Right tree call
//		}
//	}
//	
//	public static void main(String[] args) {
//		Path("",3,3);
//	}
//}


//**************** All direction Maze *********************
//class recursion{
//	
//	static void AllDirection(String p,boolean[][] maze ,int row , int col)
//	{
//		int len = maze.length-1;
//		if(row==len && col==maze[0].length-1)
//		{
//			System.out.println(p);
//			return;
//		}
//		
//		if(!maze[row][col])
//		{
//			return;
//		}
//		
//		// i am considering this block in my path
//		maze[row][col] = false;
//		
//		if(row<len)
//			AllDirection(p+"D" ,maze,row+1 ,col);	//Left tree call
//		if(col<maze[0].length-1)
//			AllDirection(p+"R" ,maze,row ,col+1);	//Right tree call
//		if(row>0)
//			AllDirection(p+"U" ,maze,row-1 ,col);
//		if(col>0)
//			AllDirection(p+"L" ,maze,row ,col-1);
//		
//		// this line is where the function will be over
//		// so before the function gets removed, also remove the changes that were made by that function
//		maze[row][col] = true;
//	}
//	
//	public static void main(String[] args) {
//		boolean[][] board = {
//				{true,true,true},
//				{true,true,true},
//				{true,true,true}
//		};
//		
//		AllDirection("",board,0,0);
//	}
//}



