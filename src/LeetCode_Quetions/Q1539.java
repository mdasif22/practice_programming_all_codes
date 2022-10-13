package LeetCode_Quetions;

import java.util.*;

public class Q1539 {

	public static int findKthPositive(int[] arr, int k) {
		int len=arr.length;
		int start=0;
	    int end=len-1;
	    
	    while(start<=end){
	        int mid=start+(end-start)/2;
	        if(arr[mid]-mid-1<k) 
	        	start=mid+1;
	        else 
	        	end=mid-1;
	    }
	    return k+start;
		
		//My Approach
//        Set<Integer> res = new HashSet();
//        for(int i=0;i<arr.length;i++) {
//        	res.add(arr[i]);
//        }
//        int ans = 0;
//        int i=1;
//        while(k>0) {
//        	if(!res.contains(i)) {
//        		k--;
//        	}
//        	i++;
//        }
//        
//        return i;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,7,11};
		int k = 5;
		int ans = findKthPositive(arr,k);
		System.out.println(ans);
	}

}
