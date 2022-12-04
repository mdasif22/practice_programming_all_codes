package Stack;

import java.util.Stack;

//**************** REVERSE STRING USING STACK ***************
class REVERSE_STRING_USING_STACK{
	public static void main(String[] args) {
		String str = "asif";
		String str1 = "";
		Stack s = new Stack();
		char[] ch = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			s.add(ch[i]);
		}
		while(!s.empty()) {
			Object s1 = s.peek();
			str1+=s1;
			s.pop();
		}
		
		System.out.println(str1);
	}
}
