package LeetCode_Quetions;

public class Q434 {
	
	public static int countSegments(String s) {
        int count=0;
        String[] seg = s.split(" ");
        for(int i=0;i<seg.length;i++) {
        	if(!seg[i].equals("")) {
        		count++;
        	}
        }
        return count;
    }

	public static void main(String[] args) {
		String s = "Hello, my name is John";
		int ans = countSegments(s);
		System.out.println(ans);
	}

}
