package LeetCode_Quetions;

public class Q258 {
	public static int addDigits(int num) {
//		while(num-10>=0){    
//        int sum = 0;
//        while(num!=0){
//            sum += num%10;
//            num = num/10; 
//        }
//        num = sum;
//    }
//		return num;
		
		//Solution 2
	    if(num==0){
	         return 0;
	     }else if(num%9==0){
	         return 9;
	     }
	     return num%9;
}

	public static void main(String[] args) {
		int num = 38;
		int ans = addDigits(num);
		System.out.println(ans);

	}

}
