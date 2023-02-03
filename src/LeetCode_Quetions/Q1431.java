package LeetCode_Quetions;

import java.util.*;

public class Q1431 {

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List list = new ArrayList();
        for(int i=0;i<candies.length;i++) {
        	list.add(isGreater(candies,candies[i]+extraCandies));
        }
        return list;
    }

	private static boolean isGreater(int[] candies, int total) {
		int max=0;
		for(int i=0;i<candies.length;i++) {
			if(total<candies[i]) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		int[] candies = {4,2,1,1,2}; 
		int extraCandies = 1;
		List ans = kidsWithCandies(candies,extraCandies);
		System.out.println(ans);
	}

}
