package LeetCode_Quetions;

import java.util.*; 
//************** WRONG ANSWER ************
public class Q500 {

	public static List<String> findWords(String[] words) {
        String str1 = "qwertyuiop";
        String str2 = "asdfghjkl";
        String str3 = "zxcvbnm";
        Set set1 = new HashSet();
        Set set2 = new HashSet();
        Set set3 = new HashSet();
        List<String> list = new ArrayList();
     
        for(int i=0;i<str1.length();i++) {
        	set1.add(str1.charAt(i));
        }
        for(int i=0;i<str2.length();i++) {
        	set2.add(str2.charAt(i));
        }
        for(int i=0;i<str3.length();i++) {
        	set3.add(str3.charAt(i));
        }
        
        for(int i=0;i<words.length;i++) {
        	String s = words[i];
        	char ch = s.charAt(i);
        	if(set1.contains(ch)) {
        		list.add(s);
        	}
        }
       
        for(int i=0;i<words.length;i++) {
        	String s = words[i];
        	char ch = s.charAt(i);
        	if(set2.contains(ch)) {
        		list.add(s);
        	}
        }
        
        for(int i=0;i<words.length;i++) {
        	String s = words[i];
        	char ch = s.charAt(i);
        	if(set3.contains(ch)) {
        		list.add(s);
        	}
        }
        return list;
    }
	
	public static void main(String[] args) {
		String[] words = {"Hello","Alaska","Dad","Peace"};
		List ans = findWords(words);
		System.out.println(ans);
	}

}
