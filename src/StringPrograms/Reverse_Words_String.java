package StringPrograms;

public class Reverse_Words_String {
	
	public static String lengthOfLastWord(String s) {
		String ans = "";
        String[] words = s.split(" ");
        for(String ele : words) {
        	for(int i=ele.length()-1;i>=0;i--) {
        		ans+=ele.charAt(i);
        	}
        	ans+=" ";
        }
       return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		System.out.println(lengthOfLastWord(str));
	}

}
