package LeetCode_Quetions;

public class Q1662 {

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="",str2="";
        for(int i=0;i<word1.length;i++) {
        	str1+=word1[i];
        	str2+=word2[i];
        }
        str1.trim();
        str2.trim();
        if(str1.equals(str2))
        	return true;
        return false;
    }
	
	public static void main(String[] args) {
		String[] word1 = {"a", "cb"}, word2 = {"ab", "c"};
		boolean ans = arrayStringsAreEqual(word1,word2);
		System.out.println(ans);
	}

}
