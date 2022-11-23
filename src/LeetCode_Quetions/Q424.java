package LeetCode_Quetions;

import java.util.*;

public class Q424 {
	public static int characterReplacement(String s, int k) {
		Map<Character,Integer> hm = new HashMap();
		int left = 0, maxLength = 0, maxCount = 0;
        
        for(int right=0;right<s.length();right++) {
        	char ch = s.charAt(right);
        	hm.put(ch, hm.getOrDefault(ch, 0)+1);
        	
        	maxCount=Math.max(maxCount, hm.get(ch));
        	
        	if(right-left+1 - maxCount > k) {
        		char remove = s.charAt(left);
        		hm.put(remove, hm.get(remove)-1);
        		left++;
        	}
        	maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }

	public static void main(String[] args) {
		String s = "ABAB";
		int k = 2;
		int ans = characterReplacement(s,k);
		System.out.println(ans);
	}

}
