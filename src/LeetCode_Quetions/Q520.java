package LeetCode_Quetions;

public class Q520 {
	public static boolean detectCapitalUse(String word) {
		int cap=0,low=0;
        for(int i=0;i<word.length();i++) {
        	char c = word.charAt(i);
        	if(Character.isUpperCase(c)) {
        		cap++;
        	}
//        	else
//        		low++;
        }
        if(cap==word.length() || cap==0) {
        	return true;
        }
        else if(cap==1) {
        	if(Character.isUpperCase(word.charAt(0))) {
        		return true;
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		String word = "usA";
		boolean ans = detectCapitalUse(word);
		System.out.println(ans);

	}

}
