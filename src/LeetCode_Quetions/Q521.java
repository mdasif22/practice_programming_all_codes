package LeetCode_Quetions;

public class Q521 {
	public static int findLUSlength(String a, String b) {
		if(a.equals(b)){
            return -1;
        }
        return Math.max(a.length(),b.length());
    }
	public static void main(String[] args) {
		String  a = "aaa", b = "aaa";
		int ans = findLUSlength(a,b);
		System.out.println(ans);

	}

}
