package HashMap_Programs;

import java.util.*;

public class MajorityElements {
	
	public static List<Integer> MajorityElement(int[] arr) {
		Map<Integer, Integer> hm = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		}
		for (int key : hm.keySet()) {
			if (hm.get(key) > len / 3) {
				list.add(key);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr1= {1,3,2,5,1,3,1,5,1};  // {1,2}
		 List ans = MajorityElement(arr1);
		 System.out.println(ans);

	}

}
