package LeetCode_Quetions;

public class Q28 {
	
	public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)) {
        	return haystack.indexOf(needle);
        }
        return -1;
    }

	public static void main(String[] args) {
		String haystack = "sadbutsad", needle = "sad";
		int ans = strStr(haystack,needle);
		System.out.println(ans);

	}

}
