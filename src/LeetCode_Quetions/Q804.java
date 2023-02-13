package LeetCode_Quetions;

import java.util.*;

public class Q804 {
	public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       Set<String> code=new HashSet<>();
   
       for(String word:words){
           StringBuilder sb=new StringBuilder();

           for(char c:word.toCharArray()){
               int index=c-'a';
               sb.append(morseCode[index]);

           }
           code.add(sb.toString());
       }
       
       return code.size();
    }

	public static void main(String[] args) {
		String[] words = {"gin","zen","gig","msg"};
		int ans = uniqueMorseRepresentations(words);
		System.out.println(ans);

	}

}
