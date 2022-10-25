package LeetCode_Quetions;

public class Q1108 {
	
	public static String defangIPaddr(String address) {
        String str = "";
        for(int i=0;i<address.length();i++) {
        	if(address.charAt(i)=='.') {
        		str+="["+address.charAt(i)+"]";
        	}
        	else
        		str+=address.charAt(i);
        }
        return str;
    }
	
	

	public static void main(String[] args) {
		String address = "1.1.1.1";
		String ans = defangIPaddr(address);
		System.out.println(ans);

	}

}
