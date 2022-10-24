package LeetCode_Quetions;

import java.util.Arrays;

public class Q14 {
	public static String longestCommonPrefix(String[] strs) {
       //Method 1
		String prefix =strs[0];
		for(int i=1;i<strs.length;i++) {
			while(strs[i].indexOf(prefix)!=0) {
				prefix = prefix.substring(0,prefix.length()-1);
			}
		}
		return prefix;
		
		//Method 2
//		Arrays.sort(strs);
//        String first = strs[0];
//        String last = strs[strs.length-1];
//        int i=0;
//        for(i=0;i<first.length();i++)
//        {
//            if(first.charAt(i)!=last.charAt(i))
//                break;
//        }
//        return first.substring(0,i);
    }
	//int j=0;j<strs[i].length()-1;j++
	public static void main (String[] args)
	{
		String[] str = {"flower","flow","flight"};
		String ans = longestCommonPrefix(str);
		System.out.println(ans);
		
	}
}
