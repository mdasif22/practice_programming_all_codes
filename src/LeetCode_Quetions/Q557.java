package LeetCode_Quetions;

import java.util.Arrays;

public class Q557 {
	
	public static String reverseWords(String s) {
		
		String[] word=s.split(" ");
        for(int i=0;i<word.length;i++) {
        	String str = "";
        	for(int j=word[i].length()-1;j>=0;j--) {
        		str+=word[i].charAt(j);
        	}
        	word[i] = str;
        }
       
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < word.length; i++) {
           sb.append(word[i]+" ");
        }
        String st = sb.toString();
      
        return st.trim();
    }
	

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		String ans = reverseWords(s);
		System.out.println(ans);

	}

}
