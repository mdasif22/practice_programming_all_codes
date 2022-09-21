package Practice;

import java.util.Arrays;

class rough {
	
	static int rec(int n) {
		if(n==0 || n==1)
			return n;
		return rec(n-1)+rec(n-2);
	}
	
	
	public static void main(String[] args) {
//		int[] num = {2,3,-2,4};
//		int ans = maxProduct(num);
		int ans = rec(10-1);
		System.out.println(ans);
	}
	
}
