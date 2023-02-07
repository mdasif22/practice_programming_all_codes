package LeetCode_Quetions;

import java.util.HashMap;

public class Q409 {

	 public static int longestPalindrome(String s) {
	        HashMap<Character,Integer> hm = new HashMap();
	        for(int i=0;i<s.length();i++) {
	        	hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
	        }
	        
	        int result=0,odd=0;
	        for(int i:hm.values()) {
	        	if(i%2==0) {
	        		result+=i;
	        	}
	        	else {
	        		odd=1;
	        		result+=i-1;
	        	}
	        }
	        return result+odd;
	 }
	public static void main(String[] args) {
		String s = "abccccdd";
		int ans = longestPalindrome(s);
		System.out.println(ans);

	}

}
