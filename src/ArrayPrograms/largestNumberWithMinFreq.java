package ArrayPrograms;

import java.util.*;

public class largestNumberWithMinFreq {
	
	//largest number with minimum frequency
		public static int LargButMinFreq(int arr[], int n) {
			HashMap<Integer,Integer> map = new HashMap<>();
	        for(int x: arr)
	        {
	            map.put(x, map.getOrDefault(x,0)+1);
	        }
	        int min_val=Integer.MAX_VALUE;
	        int ans=Integer.MIN_VALUE;
	       for (Map.Entry<Integer,Integer> e : map.entrySet()) {
	           
	           int key = e.getKey(); int val=e.getValue();
	           if(val<=min_val)
	           {
	               ans = Math.max(ans, key);
	               min_val=val;
	           }
	       }
	       return ans;
	        
	    }

	public static void main(String[] args) {
		int a[] = {2,2,5,50,1};
		System.out.println(LargButMinFreq(a,a.length));
	}

}
