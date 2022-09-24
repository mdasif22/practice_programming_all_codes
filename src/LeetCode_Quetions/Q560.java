package LeetCode_Quetions;

import java.util.HashMap;

public class Q560 {

	//Using hashmap (not understand the solution )
	public static int longestSubArrWithSumK_BF2(int[] arr, int n, int k) {
		int maxLength = 0;
		int sum=0;
        HashMap<Integer,Integer> hm = new HashMap();
        hm.put(0, 1);
        for(int i=0;i<n;i++) {
        	sum+=arr[i];
        	if(hm.containsKey(sum-k)) {
        		maxLength+=hm.get(sum-k);
        	}
        	hm.put(sum,hm.getOrDefault(sum, 0)+1);
        }
        
	    return maxLength;
	  }
	
	//Not optimaal solution
	public static int longestSubArrWithSumK_BF1(int[] arr, int n, int k) {
		int maxLength = 0;
		int count=0;
        //int n = arr.length;
		for (int i = 0; i < n; i++) {
		    int sum = 0;
		    for (int j = i; j < n; j++) {
		      sum += arr[j];
		      if (sum <= k) {
		    	// maxLength =Math.max(maxLength, (j - i + 1));
		    	  count++;
		      if(count>maxLength)
		    	  maxLength=count;
		      }
		      else if(sum>k)
		    	  count=0;
		       
		    }

		  }
	    return maxLength;
	  }
	
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,1,2,1};
		int k = 3;
		int ans = longestSubArrWithSumK_BF2(arr,arr.length,k);
		System.out.println(ans);

	}

}
