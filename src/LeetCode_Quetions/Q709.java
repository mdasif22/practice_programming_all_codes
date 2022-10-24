package LeetCode_Quetions;

public class Q709 {

	public static String toLowerCase(String s) {
		String str="";
        for(int i=0;i<s.length();i++) {
        	char ch = s.charAt(i);
        	if(Character.isUpperCase(ch)) {
        		ch = Character.toLowerCase(ch);
        		str+=ch;
        	}
        	else
        	str+=ch;
        }
        return str;
    }
	
	public static void main(String[] args) {
		String s = "HELLO";
		String ans = toLowerCase(s);
		System.out.println(ans);
	}

}
