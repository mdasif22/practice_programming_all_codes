package LeetCode_Quetions;

public class Q1967 {
	public static int numOfStrings(String[] patterns, String word) {
        int count =0;
        for(int i=0;i<patterns.length;i++) {
        	if(word.contains(patterns[i]))
        		count++;
        }
        return count;
    }

	public static void main(String[] args) {
		String[] patterns = {"a","abc","bc","d"};
		String word = "abc";
		
		int ans = numOfStrings(patterns,word);
		System.out.println(ans);

	}

}
