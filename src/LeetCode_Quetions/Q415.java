package LeetCode_Quetions;

public class Q415 {
	
	public static String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        String result = "";
        while(i>=0 || j>=0 || carry!=0) {
        	int ival = i>=0 ? num1.charAt(i)-'0' : 0;
        	int jval = j>=0 ? num2.charAt(j)-'0' : 0;
        	
        	i--;
        	j--;
        	
        	int sum = ival+jval+carry;
        	result=(sum%10)+result;
        	carry=sum/10;
        }
        return result;
    }
	
	//My Approach
	public static String addStrings2(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        String result = "";
        while(i>=0 && j>=0) {
        	int ival = num1.charAt(i)-'0';
        	int jval =num2.charAt(j)-'0';
        	
        	i--;
        	j--;
        	
        	int sum = ival+jval+carry;
        	result=(sum%10)+result;
        	carry=sum/10;
        }
        
        while(i>=0) {
        	int ival = num1.charAt(i)-'0';
        	int sum = ival+carry;
        	result=(sum%10)+result;
        	carry=sum/10;
        	i--;
        }
        while(j>=0) {
        	int jval = num1.charAt(j)-'0';
        	int sum = jval+carry;
        	result=(sum%10)+result;
        	carry=sum/10;
        	j--;
        }
        
        return carry+result;
    }

	public static void main(String[] args) {
		String num1 = "9", num2 = "1";
		String ans = addStrings2(num1,num2);
		System.out.println(ans);

	}

}
