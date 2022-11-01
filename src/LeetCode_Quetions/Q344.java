package LeetCode_Quetions;

import java.util.Arrays;

public class Q344 {
	public static void reverseString(char[] s) {
        int f=0;
        int l=s.length-1;
        
        while(f<l){
            char temp=s[f];
            s[f]=s[l];
            s[l]=temp;
            f++;l--;
        }
    }
	
	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
		System.out.println(Arrays.toString(s));

	}

}
