package LeetCode_Quetions;

import java.util.*;

public class Q1394 {
	
	public static int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
        	hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        
        int max=-1;
        for (int n : hm.keySet()) {
            if (n == hm.get(n)) {
                max = Math.max(max, n);
            }
        }
        return max;
    }

	public static void main(String[] args) {
		int[] arr = {2,2,2,3,3};
		int ans = findLucky(arr);
		System.out.println(ans);
	}

}
