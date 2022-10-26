package LeetCode_Quetions;

public class Q20 {
	
	public static boolean isValid(String s) {
		 //Wrong ans
		int p1=0,p2=0;
		int b1=0,b2=0;
		int c1=0,c2=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(')
				p1++;
			else if(s.charAt(i)==')')
				p1--;
			if(s.charAt(i)=='[')
				b1++;
			else if(s.charAt(i)==']')
				b1--;
			if(s.charAt(i)=='{')
				c1++;
			else if(s.charAt(i)=='}')
				c1--;
		}
		
		if(p1==0 && p2==0 && b1==0 && b2==0 && c1==0 && c2==0 )
			return true;
		
        return false;
    }

	public static void main(String[] args) {
		String s = "{[]}";
		boolean ans = isValid(s);
		System.out.println(ans);

	}

}
