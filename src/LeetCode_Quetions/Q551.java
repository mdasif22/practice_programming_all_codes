package LeetCode_Quetions;

public class Q551 {
	public static boolean checkRecord(String s) {
		
		int co = 0,a=0;
        for(char c : s.toCharArray())
        {
            if(c=='P' || c == 'A')
                co=0;

            if(c == 'L')
                co++;
            
            if(co == 3)
                return false;
            if(c == 'A')
                a++;
            
            if(a>=2)
                return false;
        }

        return true;
		
		//My Approach
//        int l=0,a=0;
//        for(int i=0;i<s.length();i++) {
//        	if(s.charAt(i)=='A') {
//        		a++;
//        	}
//        	else if(s.charAt(i)=='L') {
//        		if(i+2 <s.length() && s.charAt(i+2)=='L') {
//        			return false;
//        		}
//        		else
//        			l++;
//        	}
//        }
//        if(a<2 && l<3) {
//        	return true;
//        }
//        return false;
        	
    }

	public static void main(String[] args) {
		String s = "PPALLL"; //PPALLL
		boolean ans = checkRecord(s);
		System.out.println(ans);
	}

}
