package StringPrograms;

import java.util.HashMap;

public class Find_Words_That_Can_Be_Formed_by_Characters {
	public static int countCharacters1(String[] words, String chars) {
		int[] arr1 = new int[26];
		for(char c : chars.toCharArray()) {
			arr1[c-'a']++;
		}
		
		int len=0;
		for(int i=0;i<words.length;i++) {
			String str = words[i];
			int[] arr2 = new int[26];
			for(char c : str.toCharArray()) {
				arr2[c-'a']++;
			}
			
			boolean flag = true;
			for(int j=0;j<26;j++) {
				if(arr2[j]>arr1[j]) {
					flag=false;
					break;
				}
			}
			
			if(flag) {
				len+=str.length();
			}
		}
		return len;
	}

	public static int countCharacters2(String[] words, String chars) {
		HashMap<Character,Integer> map1 = new HashMap<>();
		for(char c : chars.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0)+1);
		}
		
		int len=0;
		for(String word : words) {
			HashMap<Character,Integer> map2 = new HashMap<>(map1);
			boolean good=true;
			for(char c  : word.toCharArray()) {
				if(map2.containsKey(c) && map2.get(c)>0) {
					map2.put(c, map2.get(c)-1);
				}else {
					good=false;
					break;
				}
			}
			if(good) {
				len+=word.length();
			}
		}
		return len;
	}
	
	public static void main(String[] args) {
		String[] words = {"cat","bt","hat","tree"}; 
		String chars = "atach";
		int ans = countCharacters2(words,chars);
		System.out.println(ans);	//output=10

	}

}
