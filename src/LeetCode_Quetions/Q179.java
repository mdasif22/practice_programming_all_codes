package LeetCode_Quetions;

import java.util.Arrays;

public class Q179 {
	public static String largestNumber(int[] nums) {
		String[] word = new String[nums.length];
		for(int i=0;i<word.length;i++) {
			word[i]=String.valueOf(nums[i]);
		}
        Arrays.sort(word, (a,b)->(b+a).compareTo(a+b));
        
        if(word[0].equals("0")) {
        	return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        for(String str : word) {
        	sb.append(str);
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		int[] nums = {3,30,34,5,9};	//3,30,34,5,9
		String ans = largestNumber(nums);
		System.out.println(ans);

	}

}
