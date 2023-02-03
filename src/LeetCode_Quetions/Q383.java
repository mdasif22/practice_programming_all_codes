package LeetCode_Quetions;

import java.util.HashMap;

public class Q383 {

	public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer>h=new HashMap<>();
        int n=ransomNote.length();
        int m = magazine.length();
        for(int i=0;i<n;i++) {
            if(!h.containsKey(ransomNote.charAt(i)))
                h.put(ransomNote.charAt(i), 1);
            else 
                h.put(ransomNote.charAt(i), h.get(ransomNote.charAt(i))+1);
        }
        for(int i=0;i<m;i++) {
            if(h.containsKey(magazine.charAt(i))) {
                h.put(magazine.charAt(i), h.get(magazine.charAt(i))-1);
                
            if(h.get(magazine.charAt(i))==0) 
                h.remove(magazine.charAt(i));
        }
        }
        if(h.size()==0) {
        	return true;
        }
        return false;
    }
	public static void main(String[] args) {
		String ransomNote = "aa", magazine = "aba";
		boolean ans = canConstruct(ransomNote,magazine);
    	System.out.println(ans);

	}

}
