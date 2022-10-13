package LeetCode_Quetions;

public class Q441 {

	public static int arrangeCoins(int n) {
		if(n==0||n==1)
            return n;
		int count=0;
		
		for(int i=0;i<n;i++) {
			n=n-i;
			if(n>i)
				count++;
		}
		
        return count;
    }
	
	public static void main(String[] args) {
		
		int num = 2;
		int ans = arrangeCoins(num);
		System.out.println(ans);
	}

}
