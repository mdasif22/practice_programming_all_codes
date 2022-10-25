package LeetCode_Quetions;

public class Q125 {

	public static boolean isPalindrome(String s) {
		if(s.isBlank())
			return true;
		
		String str="";
		s=s.toLowerCase();
        for(int i=0;i<s.length();i++) {
        	char ch = s.charAt(i);
        	if(Character.isAlphabetic(ch) || Character.isDigit(ch)) {
        		str+=ch;
        	}
        }
        String rev = "";
        for(int i=str.length()-1;i>=0;i--) {
        	rev+=str.charAt(i);
        }
        if(str.equals(rev))
        	return true;
        return false;
        
        
    }
	
	public static void main(String[] args) {
		String s = "0P";
		boolean ans = isPalindrome(s);
		System.out.println(ans);

	}

}
