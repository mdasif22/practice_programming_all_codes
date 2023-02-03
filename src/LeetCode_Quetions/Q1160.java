package LeetCode_Quetions;

import java.util.HashMap;

public class Q1160 {
	
	public static int countCharacters1(String[] words, String chars) {
        int arr1[] = new int[26];
        for(int i=0;i<chars.length();i++){
            int num = chars.charAt(i)-97;
            arr1[num]++;
        }
        int len=0;
        for(int i=0;i<words.length;i++){
            String str = words[i];
            int arr2[] = new int[26];
            for(int j=0;j<str.length();j++){
                int num = str.charAt(j)-97;
                arr2[num]++;
            }
            int flag=0;
            for(int k=0;k<26;k++){
                if(arr2[k]>arr1[k]){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                len=len+str.length();
        }
        return len;
    }
	
	public static int[] charFreq = new int[26];
	public static int countCharacters2(String[] words, String chars) {
        int count = 0;
        for(char c : chars.toCharArray()) {
        	++charFreq[c - 'a'];
        }
        	
        for(String word : words) {
        	if(isGood(word)) {
        		count += word.length();
        	}
        }
        	
        return count;
    }
    
    public static boolean isGood(String word) {
        int[] localCharFreq = new int[26];
        for(char c : word.toCharArray()) {
        	++localCharFreq[c - 'a'];
        }
        	
        for(int i = 0; i < 26; i++) {
        	if(localCharFreq[i] > charFreq[i]) 
        		return false;
        }
        	
		
        return true;
    }
    
    public static int countCharacters3(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>(); 
        
        for(char ch: chars.toCharArray()){ //Create a hashmap where the value of each character key is the number of times it appears in 'chars'. Think of it as the number of uses available. 
            map.put(ch, map.getOrDefault(ch, 0) + 1); //if the key is not already in the map, add it and set the value to 1. If it is already in the map, add one to the value (number of uses)
        }
        
        //The above hashmap is only used as a template to make copies we can use when we check
        
        int result = 0; //initialize the result
        
        for(String word: words) { //For every string in words, we make a temp hashmap by copying the main hashmap. We default to being a 'good' string. 
            HashMap<Character, Integer> temp = new HashMap<>(map);
            boolean good = true;
            
            //Next, we iterate over the word. 
            for(int i = 0; i < word.length(); i++){
                char ch = word.charAt(i); 
                
                //If our temp map contains the character and the number of remaining uses of that character is greater than 0,
                if(temp.containsKey(ch) && temp.get(ch) > 0){
                    
                    temp.put(ch, temp.get(ch) -1); //Then decrement the number of remaining uses of ch in the hashmap. 
                } else {
                    //if at any point we find a character in our word that is either not in the map, or has run out of uses, then this is not a good word. End the loop so we can return.
                    good = false;
                    break;
                }
            }
            
            //When the loops have stopped running, see if the word is good. If it is, add its length to our result, and then check the next word.
            if(good) {
                result += word.length();
            }
        }
        
        return result;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"cat","bt","hat","tree"}; 
		String chars = "atach";
		int ans = countCharacters2(words,chars);
		System.out.println(ans);
	}

}
