package LeetCode_Quetions;

public class Q367 {

	public static boolean isPerfectSquare(int num) {
		
		 long start = 0;
		 long end = num;
		 
		 while(start<=end) {
			 long mid = (start+end)/2;
			 if(mid*mid==num)
				 return true;
			 else if(mid*mid>num)
				 end = mid-1;
			 else
				 start = mid+1;
				 
		 }
		 
        
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 16;
		boolean ans = isPerfectSquare(num);
		System.out.println(ans);
	}

}

//1 2 3 4 