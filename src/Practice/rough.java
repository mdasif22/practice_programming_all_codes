package Practice;

import java.util.*;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class rough
{
	public static int distributeCandies(int[] candyType) {
		   Set set = new HashSet();
	       int n = candyType.length;
	       for(int i=0;i<n-1;i++) {
	    		   set.add(candyType[i]);
	       }
	       return Math.min(set.size(), n/2);
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] nums = {1,1,1,1,1};
		int ans = distributeCandies(nums);
		System.out.println(ans);
	}
}