package ArrayPrograms;
import java.util.*;
//Problem 989
public class Add_Array_And_Int {
	
	public static List<Integer> addToArrayForm(int[] num, int k) {
        List list = new ArrayList();
        int len = num.length-1;
        int carry = 0;
        
        for(int i=len;i>=0;i--) {
        	int sum=0;
        		int rem = k%10;
            	sum=num[len]+rem+carry;
            	list.add(sum%10);
            	carry = sum/10;
            	k=k/10;
            	len--;
        }
        k=k+carry;
        while(k!=0) {
        	list.add(k%10);
        	k=k/10;
        }
        
        Collections.reverse(list);
        return list;
    }
	
//	public static List<Integer> addToArrayForm(int[] num, int k) {
//        List list = new ArrayList();
//        int len = num.length-1;
//        int carry = 0;
//        
//        while(len>=0 || k>0) {
//        	if(len>=0) {
//        		list.add((num[len]+k)%10);
//        		k=(num[len]+k)/10;
//        		len--;
//        	}
//        	else {
//        		list.add(k%10);
//        		k/=10;
//        	}
//        }
//        
//        Collections.reverse(list);
//        return list;
//    }
	
	public static void main(String[] args) {
		int[] num = {9,9};
		int k = 1;
		List ans = addToArrayForm(num,k);
		System.out.println(ans);
	}
}
