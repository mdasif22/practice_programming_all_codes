package LeetCode_Quetions;

import java.util.HashSet;
import java.util.Set;

class Q575
{
	public static int distributeCandies(int[] candyType) {
		Set<Integer> set = new HashSet();
	       int n = candyType.length;
	       for(int i=0;i<n-1;i++) {
	    		   set.add(candyType[i]);
	       }
	       return Math.min(set.size(), n/2);
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] nums = {1,1,2,3};
		int ans = distributeCandies(nums);
		System.out.println(ans);
	}
}
