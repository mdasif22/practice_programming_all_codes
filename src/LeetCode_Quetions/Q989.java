package LeetCode_Quetions;

import java.util.*;

class Q989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
              
        //Method 1
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
    
        
        
        //Method 2
//         List list = new ArrayList();
//         int len = num.length-1;
//         int carry = 0;
        
//         while(len>=0 || k>0) {
//         	if(len>=0) {
//         		list.add((num[len]+k)%10);
//         		k=(num[len]+k)/10;
//         		len--;
//         	}
//         	else {
//         		list.add(k%10);
//         		k/=10;
//         	}
//         }
        
//         Collections.reverse(list);
//         return list;
    
    
    }
}
