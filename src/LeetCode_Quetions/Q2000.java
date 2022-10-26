package LeetCode_Quetions;

public class Q2000 {
	
	public static String reversePrefix(String word, char ch) {
        String str="";
		int index=word.indexOf(ch);
		for(int i=index;i>=0;i--) {
			str+=word.charAt(i);
		}
		for(int i=index+1;i<word.length();i++) {
			str+=word.charAt(i);
		}
		return str;
    }

	public static void main(String[] args) {
		String word = "abcdefd";
		char ch = 'd';
		String ans = reversePrefix(word,ch);
		System.out.println(ans);

	}

}
