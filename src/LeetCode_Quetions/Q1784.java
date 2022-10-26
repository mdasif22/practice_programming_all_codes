package LeetCode_Quetions;

public class Q1784 {
	public static boolean checkOnesSegment(String s) {
		int len = s.length()-1;
        for(int i = 0;i < len; i++){
            if(s.charAt(i)=='0' && s.charAt(i+1)=='1') 
                return false;
        }
        return true;
    }

	public static void main(String[] args) {
				String s = "10";
				boolean ans = checkOnesSegment(s);
				System.out.println(ans);

	}

}
