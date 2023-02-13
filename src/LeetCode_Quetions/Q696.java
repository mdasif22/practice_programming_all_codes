package LeetCode_Quetions;

public class Q696 {
	public static int countBinarySubstrings(String s) {
        int prev=0,curr=1,count=0,i=1;
        while(i<s.length()) {
        	if(s.charAt(i-1)!=s.charAt(i)) {
        		count+=Math.min(prev, curr);
        		prev=curr;
        		curr=1;
        	}
        	else {
        		curr++;
        	}
        	i++;
        }
        return count+=Math.min(prev, curr);
    }

	public static void main(String[] args) {
		String s = "00110011";
		int ans = countBinarySubstrings(s);
		System.out.println(ans);
	}

}
