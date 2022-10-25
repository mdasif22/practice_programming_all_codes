package LeetCode_Quetions;

public class Q1704 {

	public static boolean halvesAreAlike(String s) {
		String str1 = "";
	    String str2 = "";
	    for(int i=0;i<s.length()/2;i++) {
	    	str1+=s.charAt(i);
	    }
	    for(int i=s.length()/2;i<s.length();i++) {
	    	str2+=s.charAt(i);
	    }
	    str1=str1.toLowerCase();
	    str2=str2.toLowerCase();
	    int count1=0,count2=0;
	    for(int i=0;i<str1.length();i++) {
	    	if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u') {
	    		count1++;
	    	}
	    	if(str2.charAt(i)=='a'||str2.charAt(i)=='e'||str2.charAt(i)=='i'||str2.charAt(i)=='o'||str2.charAt(i)=='u') {
	    		count2++;
	    	}
	    }
	    if(count1==count2)
	    	return true;
	    return false;
    }
	 
	
	public static void main(String[] args) {
		String s = "Uo";
		boolean ans = halvesAreAlike(s);
		System.out.println(ans);
	}

}
