package LeetCode_Quetions;

public class Q1768 {
	
	public static  String mergeAlternately(String word1, String word2) {
        String str="";
        int i=0,j=0;
        while(i<word1.length() && j<word2.length()) {
        	str+=word1.charAt(i);
        	i++;
        	
        	str+=word2.charAt(j);
        	j++;
        }
        
        while(i<word1.length()) {
        	str+=word1.charAt(i);
        	i++;
        }
        while(j<word2.length()) {
        	str+=word2.charAt(j);
        	j++;
        }
        
        return str;
    }

	public static void main(String[] args) {
		String word1 = "ab", word2 = "pqrb";
		String ans = mergeAlternately(word1,word2);
		System.out.println(ans);

	}

}
