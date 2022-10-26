package LeetCode_Quetions;

class Q58 {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        
        String[] word=s.split(" ");
        int len = word.length-1;
		return word[len].length();
    }
}
