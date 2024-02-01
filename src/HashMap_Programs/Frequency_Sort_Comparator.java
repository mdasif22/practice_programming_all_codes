package HashMap_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Frequency_Sort_Comparator {
	
	public static int[] frequencySort(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int item : nums) {
			//list.add(item);
			map.put(item, map.getOrDefault(item, 0)+1);
		}
		List<Integer> list = new ArrayList(map.keySet());
		Collections.sort(list, (a,b)->
		(map.get(a)==map.get(b))? b-a : map.get(a)-map.get(b)
		);
		
		int[] ans = new int[nums.length];
		int j=0;
		for(int ele : list) {
			for(int i=0;i<map.get(ele);i++) {
				ans[j++] = ele;
			}
		}
		return ans;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
