package StringPrograms;

import java.util.*;

public class Valid_Anagrams {
	
	public static boolean validAnagram(String str1, String str2) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(int i=0;i<str2.length();i++) {
			char ch = str2.charAt(i);
			if(map.get(ch)==1)
				map.remove(ch);
			else if(map.get(ch)>1)
				map.put(ch, map.get(ch)-1);
		}
		if(map.size()==0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		String str1="abbcaad";
		String str2="babacda";
		boolean ans = validAnagram(str1,str2);
		System.out.println(ans);

	}

}
