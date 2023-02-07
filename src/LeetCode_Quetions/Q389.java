package LeetCode_Quetions;

import java.util.*;

public class Q389 {

	public static char findTheDifference(String s, String t) {
		char c = 0;
        for(char cs : s.toCharArray()) {
        	c ^= cs;
        }
        for(char ct : t.toCharArray()) {
        	c ^= ct;
        }
        return c;
        
      //Second Approach
        /*
        char[] c = s.toCharArray();
        char[] ch = t.toCharArray();

        Arrays.sort(c);
        Arrays.sort(ch);

        int s_pointer = 0;
        int t_pointer = 0;

        while (s_pointer < s.length()) {
            if (c[s_pointer] != ch[t_pointer]) {
                return ch[t_pointer];
            }
            s_pointer++;
            t_pointer++;
        }
        return ch[t.length() - 1];
        */
        
        //MY APPROACH (NOT ACCEPTED)
//		char c=' ';
//		List list = new ArrayList();
//        for(int i=0;i<s.length();i++) {
//        	list.add(s.charAt(i));
//        }
//        for(int i=0;i<t.length();i++) {
//        	c = t.charAt(i);
//        	if(!list.contains(c)) {
//        		return c;
//        	}
//        }
//        return c;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd", t = "abcde";
		char ans = findTheDifference(s,t);
		System.out.println(ans);
	}

}
