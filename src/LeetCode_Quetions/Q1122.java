package LeetCode_Quetions;

import java.util.Map;
import java.util.TreeMap;

class Q1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
            //Method 1
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int x : arr1) {
//             map.put(x, map.getOrDefault(x, 0) + 1);
//         }
//         ArrayList<Integer> li = new ArrayList<>();

//         int[] ans = new int[arr1.length];
//         int index = 0;
//         for (int i : arr2) {
//             for (int x = 0; x < map.get(i); x++) {
//                 ans[index++] = i;
//             }
//             map.remove(i);
//         }
//         TreeMap<Integer, Integer> tree = new TreeMap<Integer, Integer>(map);
//         Iterator it = tree.keySet().iterator();
//         while (it.hasNext()) {
//             int key = (int) it.next();
//             int n = map.get(key);
//             for (int j = 0; j < n; j++) ans[index++] = key;
//         }
//         return ans;
        
        //Method2
        Map<Integer,Integer> map = new TreeMap<>();
		for(int i: arr1)
			map.put(i,map.getOrDefault(i,0)+1);
		int index = 0;
		for(int i: arr2){
			int num = map.get(i);
			while(num > 0){
				arr1[index++] = i;
				num--;
			}
			map.remove(i);
		}
		for(Map.Entry<Integer,Integer> m : map.entrySet()){
			int num = m.getValue();
			while(num > 0){
				arr1[index++] = m.getKey();
				num--;
			}
		}
		return arr1;
    }
}
