package LeetCode_Quetions;

import java.util.HashMap;

public class Q290 {

	public static boolean wordPattern(String pattern,String s) {
		//Method 1
//		HashMap<Character,String> map = new HashMap<>();
//		String[] str = pattern.split(" ");
//		
//		for(int i=0;i<s.length();i++) {
//			char ch = s.charAt(i);
//			if(str.length!=s.length())
//                return false;
//			if(!map.containsKey(ch)) {
//				if(map.containsValue(str[i])) {
//					return false;
//				}
//				map.put(ch, str[i]);
//			}
//			else if(map.containsKey(ch)) {
//				if(!map.get(ch).equals(str[i]))
//					return false;
//			}
//		}
//		//&& !map.containsValue(str[i])
//		return true;
		
		//Method 2
		HashMap<Character,String> map = new HashMap<>();
		String[] str = s.split(" ");
		
		for(int i=0;i<pattern.length();i++) {
			char ch = pattern.charAt(i);
			if(str.length!=pattern.length())
                return false;
            
            if(map.containsKey(ch)) {
				if(!map.get(ch).equals(str[i]))
					return false;
			}
            
			else {
				if(map.containsValue(str[i])) {
					return false;
				}
				map.put(ch, str[i]);
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		String pattern ="abba";
		String str ="dog cat cat dog";
		System.out.println(wordPattern(pattern,str));
	}
}
