package LeetCode_Quetions;

import java.util.*;

public class Q1047 {
	public static String removeDuplicates(String s) { //"azxxzy"
		Stack<Character> stck = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(!stck.isEmpty() && stck.peek() == s.charAt(i)) {
				stck.pop();
			}
			else {
				stck.push(s.charAt(i));
			}
		}
		
		StringBuilder builder = new StringBuilder();
		for(char c:stck) {
			builder.append(c);
		}
		return builder.toString();
		
		//Method 2 (but TLE)
//		for(int i=0;i<s.length()-1;i++) {
//			if(s.charAt(i)==s.charAt(i+1)) {
//				s = s.substring(0, i) + s.substring(i + 2, s.length());
//				i=-1;
//			}
//		}
//		return s;
		
		
		//My Approach(Accepted but Not Submitted)
//        Set<Character> list = new LinkedHashSet();
//        for(int i=0;i<s.length();i++) {
//        	char c = s.charAt(i);
//        	if(list.contains(c)) {
//        		list.remove(c);
//        		continue;
//        	}
//        	
//        	list.add(c);
//        }
//        String ans ="";
//        for(char c : list) {
//        	ans+=c;
//        }
//        return ans;
    }

	public static void main(String[] args) {
		String s = "azxxzy";
		String ans = removeDuplicates(s);
		System.out.println(ans);

	}

}
