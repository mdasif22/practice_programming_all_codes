package Sliding_Window;

import java.util.HashSet;
import java.util.Set;
public class Substrings_of_Size_Three_with_Distinct_Characters {
	public static int countGoodSubstrings(String s) {
		Set<Character> set = new HashSet<>();
		int count=0;
        for(int i=0;i<s.length()-2;i++) {
        	set.add(s.charAt(i));
        	set.add(s.charAt(i+1));
        	set.add(s.charAt(i+2));
        	if(set.size()==3)
        		count++;
        	set.clear();
        }
        return count;
        
        /*
    	int windowStart = 0;
            int count = 0;
            Map<Character, Integer> map = new HashMap<>();
            for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
                char rightChar = s.charAt(windowEnd);
                map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
                
    		// if at any point in time, the size of map becomes greater than 3
                while(map.size() >= 3) {
    				//first check, if the current length of our window is 3
    				   //length is 3, we are going to increment count and break for the current window. 
                    if ((windowEnd - windowStart + 1) == 3) {
                        count++;
                        break;
                    }
                    else {
//    					 otherwise, take one character out from left side of the window and start decrementing its
//    					frequency from the map. Decrementing means, we are not considering this element 
//    					in our window. And, if its frequency becomes zero, we'll remove it from the map. 
 * 
                        char leftChar = s.charAt(windowStart);
                        map.put(leftChar, map.get(leftChar) - 1);
                        if(map.get(leftChar) == 0) {
                            map.remove(leftChar);
                        }
                        windowStart++;
                    }
                }
            }
            return count;
    */
    }

	public static void main(String[] args) {
		String s = "xyzzaz";
		int ans = countGoodSubstrings(s);
		System.out.println(ans);

	}

}
