package LeetCode_Quetions;

public class Q1678 {

	 public static String interpret(String command) {
		 	String str ="";
	        int pointer=0;
	        while(pointer<command.length()) {
	        	if(command.charAt(pointer)=='G') {
	        		str+='G';
	        		pointer++;
	        	}
	        	else if(command.charAt(pointer)=='(' && command.charAt(pointer+1)==')') {
	        		str+='o';
	        		pointer=pointer+2;
	        	}
	        	else {
	        		str+="al";
	        		pointer+=4;
	        	}
	        }
	        return str;
	    }
	
	public static void main(String[] args) {
		String command = "G()()()()(al)";
		String ans = interpret(command);
		System.out.println(ans);
	}

}
