package LeetCode_Quetions;

import java.util.*;

public class Q1051 {

	public static int heightChecker(int[] heights) {
		int[] tempHeights = heights.clone();
        Arrays.sort(tempHeights);
        int count = 0;

        for(int i = 0;i < tempHeights.length;i++) {
            if(heights[i] != tempHeights[i]) {
                count++;
            }
        }
        
        return count;
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] heights = {5,1,2,3,4}; 
		int ans = heightChecker(heights);
		System.out.println(ans);
		
	}
}
