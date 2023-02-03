package LeetCode_Quetions;

public class Q345 {

	public static String reverseVowels(String s) {
		
		char[] ch = s.toCharArray();
        int l=0,r=s.length()-1;
        for(int i=0;i<s.length();i++) {
        	while(l<r) {
        		if(ch[l]=='a' || ch[l]=='e' ||ch[l]=='i' ||ch[l]=='o' ||ch[l]=='u') {
        			//l++;
        			break;
        		}
//        		else {
//        			l++;
//        		}
        		l++;
        	}
        	while(r>l) {
        		if(ch[r]=='a' || ch[r]=='e' ||ch[r]=='i' ||ch[r]=='o' ||ch[r]=='u') {
        			//r--;
        			break;
        		}
//        		else {
//        			r--;
//        		}
        		r--;
        	}
        	
        	
        char temp = ch[l];
        ch[l]=ch[r];
        ch[r]=temp;
        l++;
        r--;
        }
        String st = "";
        for(int i=0;i<ch.length;i++) {
        	st+=ch[i];
        }
        
        return st;
    }
	public static void main(String[] args) {
		String s = "leetcode";
		String ans = reverseVowels(s);
		System.out.println(ans);

	}

}
