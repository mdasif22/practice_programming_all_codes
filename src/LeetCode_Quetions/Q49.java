package LeetCode_Quetions;

import java.util.*;

public class Q49 {
public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap();
        for(String str : strs) {
        	char[] c = str.toCharArray();
        	Arrays.sort(c);
        	String word = String.valueOf(c);
        	if(!hm.containsKey(word)) {
        		hm.put(word, new ArrayList<>());
        	}
        	hm.get(word).add(str);
        }
        return new ArrayList<>(hm.values());
    }

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};	//[["bat"],["nat","tan"],["ate","eat","tea"]]
		List<List<String>> ans = groupAnagrams(strs);
		System.out.println(ans);
	}

}
