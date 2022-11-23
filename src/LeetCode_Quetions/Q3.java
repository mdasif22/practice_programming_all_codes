package LeetCode_Quetions;

import java.util.*;

public class Q3 {
		/*
		 //Method 1
		public static  int lengthOfLongestSubstring(String str) {
	        int ans = 0;
			int i=-1;
			int j=-1;
			
			HashMap<Character,Integer> map = new HashMap<>();
			
			while(true) {
				boolean f1=false;
				boolean f2=false;
				//acquire
				while(i<str.length()-1) {
					f1=true;
					i++;
					char ch = str.charAt(i);
					map.put(ch, map.getOrDefault(ch, 0) + 1);
					
					if(map.get(ch) == 2) {
						break;
					}
					else {
						int len = i-j;
						if(len>ans) {
							ans = len;
						}
					}
				}
				
				//release
				while(j<i) {
					f2=true;
					j++;
					char ch = str.charAt(j);
					map.put(ch, map.get(ch)-1);
					
					if(map.get(ch)==1) {
						break;
					}
				}
				
				if(f1==false && f2==false) {
					break;
				}
				
			}
			return ans;
	    }*/
        
	//Method 2 using HashSet
	public static  int lengthOfLongestSubstring(String str) {
		
		Set<Character> set = new HashSet();
		int left=0,right=0;
		int max=0,count=0;
		while(right<str.length()) {
			if(!set.contains(str.charAt(right))) {
				set.add(str.charAt(right));
				int len = right-left+1;
				if(len>max)
					max=len;
				right++;
			}
			else {
				while(str.charAt(left)!=str.charAt(right)) {
					set.remove(str.charAt(left));
					left++;
				}
				set.remove(str.charAt(left));
				left++;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		String s = "abcabcbb";
		int ans = lengthOfLongestSubstring(s);
		System.out.println(ans);
	}

}
