package LeetCode_Quetions;

import java.util.HashMap;

public class Q771 {
	
	public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : stones.toCharArray())
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        int res=0;
        for(char ch : jewels.toCharArray())
            res+=hm.getOrDefault(ch,0);
        return res;
    }

}
