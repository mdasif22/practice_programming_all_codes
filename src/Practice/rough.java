package Practice;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
//static
class rough {
	 public static boolean canConstruct(String ransomNote, String magazine) {
	        Map<Character,Integer> map = new HashMap<>();
	        for(int i=0;i<ransomNote.length();i++) {
	        	map.put(ransomNote.charAt(i), map.getOrDefault(ransomNote.charAt(i), 0)+1);
	        }
	        
	        for(int i=0;i<ransomNote.length();i++) {
	        	if(map.containsKey(magazine.charAt(i))) {
	        		map.get(magazine.charAt(i)-1);
	        	}
	        	if(map.get(magazine.charAt(i))==0) {
	        		map.remove(magazine.charAt(i));
	        	}
	        }
	        
	        if(map.size()==0)
	        	return true;
	        
	        return false;
	 }

	public static void main(String[] args) {
		String[] words = {"flower","flow","flight"}; 
		String str = "race car";
		String s = "aa", t = "aab";
		int[][] grid = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		int[] nums = {0,1,0,2}; 		// 
		int[] arr1 = {1,2,3}, arr2 = {3,2,7};
		int k=2;
		
		//groupAnagrams(words);
		//List<List<Integer>> l = shiftGrid(grid,k);
		//List<Boolean> l = kidsWithCandies(nums,k);
		//List<Integer> l = findDisappearedNumbers(nums);
		//int[] l = frequencySort(nums);
		//int l = dominantIndex(nums);
		//boolean l = canPlaceFlowers(nums,k);
			
		
		//System.out.println(l);
    	System.out.println(canConstruct(s,t));
//    	for(int e:l) {
//    		System.out.print(e +" ");
//    	}
//		for(int i=0;i<row;i++) {
//        	for(int j=0;j<col;j++) {
//        		System.out.print(l[i][j]+" ");
//        		}
//        	System.out.println();
//        	}
	
		
    }
}