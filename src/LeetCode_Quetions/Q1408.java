package LeetCode_Quetions;

import java.util.*;

public class Q1408 {
	public static  List<String> stringMatching(String[] words) {
        List list = new ArrayList();
        for(int i=0;i<words.length;i++) {
        	for(int j=0;j<words.length;j++) {
        		if(words[i].contains(words[j])) {
        			if(words[i]==words[j]) {
        				continue;
        			}
        			if(!list.contains(words[j]))
        				list.add(words[j]);
        		}
        	}
        }
        return list;
    }

	public static void main(String[] args) {
		String[] words = {"mass","as","hero","superhero"};
		List ans = stringMatching(words);
		System.out.println(ans);
	}

}
