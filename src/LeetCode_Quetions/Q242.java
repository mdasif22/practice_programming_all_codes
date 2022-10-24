package LeetCode_Quetions;

import java.util.HashMap;

public class Q242 {
	public static boolean isAnagram(String s, String t) {
		//Solution 1
        HashMap<Character,Integer> hm = new HashMap();
        for(int i=0;i<s.length();i++) {
        	char c = s.charAt(i);
        	hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        
        for(int i=0;i<t.length();i++) {
        	char c = t.charAt(i);
        	
        	if(!hm.containsKey(c))
        		return false;
        	else if(hm.get(c)==1)
        		hm.remove(c);
        	else
        		hm.put(c, hm.get(c) - 1);
        		
        }
        return hm.size()==0;
        
        //Solution 2
//        int count[]=new int[26];
//        for(int i=0;i<s.length();i++)
//            count[(int)s.charAt(i)-'a']++;
//        
//        for(int i=0;i<t.length();i++)
//            count[(int)t.charAt(i)-'a']--;
//        
//        for(int i=0;i<26;i++)
//            if(count[i]!=0) return false;
//        
//        return true;
    }
	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		boolean ans = isAnagram(s,t);
		System.out.println(ans);

	}

}
