package LeetCode_Quetions;

//Method 1
//class Solution {
 
//  public  int square(int n) {
//		int sum = 0;
//		while(n>0) {
//			int rem = n%10;
//			sum+=rem*rem;
//			n=n/10;
//		}
		
//		return sum;
//	}
 
//  public boolean isHappy(int n) {
     
//     int f=n;
//     int s=n;
    
//     do {
//  	   s = square(s);
//  	   f = square(square(f));
//     }while(s!=f);
		
//     if(s == 1)
//  	   return true;
		
//		return false;
 
//  }
//}


//Methon 2
class Q202 {
 
 int square(int num) {
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			sum+=rem*rem;
			num/=10;
		}
		return sum;
	}
 
 public boolean isHappy(int num) {
     
    int result=num;
	
	while(result!=1 && result != 4) {
		result = square(result);
	}
	
	if(result == 1)
		return true;
	else if(result == 4)
		return false;
     
 return false;
 }
}
