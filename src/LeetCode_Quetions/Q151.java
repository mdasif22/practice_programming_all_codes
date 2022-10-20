package LeetCode_Quetions;

import java.util.Arrays;
import java.util.*;

public class Q151 {
	public static String reverseWords(String s) {
        String[] str = s.split(" ");
        List list = new ArrayList();
        String ans = "";
        
        for(int i=0;i<str.length;i++) {
        	if(!str[i].isBlank()) {
        		list.add(str[i]);
        	}
        }
        
        for(int i=list.size()-1;i>=0;i--) {
        	ans+= list.get(i) +" ";
        }
        return ans.trim();
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "a good    example";
		String ans = reverseWords(s);
		System.out.println(ans);
	}
}
