package LeetCode_Quetions;

import java.util.Stack;

public class Q20 {
	
	public static boolean isValid(String s) {
		
		//Striver
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char c=st.peek();
                st.pop();
                if( (c=='(' && s.charAt(i)==')') || (c=='{' && s.charAt(i)=='}') || (c=='[' && s.charAt(i)==']')){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }

    /*
     Stack<Character> stack = new Stack<>();


        // convert string into char array and access the characters using for each loop.
        for(char ch: s.toCharArray())
        {
            // check ch
            switch (ch)
            {
                // open bracket then push it in stack.
                // close bracket then pop the item and compare.
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')

                    // if the stack is empty then it means string have no open bracket.
                        // hence it is invalid.
                    {
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                    {
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[')
                    {
                        return false;
                    }
                    break;
            }
        }


        // After the loop we have to check one more condition.
        // return true only if the stack is empty.
        // if stack is not empty that means we have unused brackets.

        if(stack.isEmpty())
            return true;
        else
            return false;
            */
		
		  //My Approach
//		 //Wrong ans
//		int p1=0,p2=0;
//		int b1=0,b2=0;
//		int c1=0,c2=0;
//		
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='(')
//				p1++;
//			else if(s.charAt(i)==')')
//				p1--;
//			if(s.charAt(i)=='[')
//				b1++;
//			else if(s.charAt(i)==']')
//				b1--;
//			if(s.charAt(i)=='{')
//				c1++;
//			else if(s.charAt(i)=='}')
//				c1--;
//		}
//		
//		if(p1==0 && p2==0 && b1==0 && b2==0 && c1==0 && c2==0 )
//			return true;
//		
//        return false;

	public static void main(String[] args) {
		String s = "{[]}";
		boolean ans = isValid(s);
		System.out.println(ans);
	}
}
