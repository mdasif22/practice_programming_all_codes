package LeetCode_Quetions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Q1207 {
	public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
		for(int ele : arr) {
			map.put(ele, map.getOrDefault(ele, 0)+1);
		}
		
		for(int occ : map.keySet()) {
			if(list.contains(map.get(occ)))
            {
                return false;
            }
            list.add(map.get(occ));
		}
		return true;
    }

	public static void main(String[] args) {
		int[] arr = {1,2,2,1,1,3};
		boolean ans = uniqueOccurrences(arr);
		System.out.println(ans);
	}

}
