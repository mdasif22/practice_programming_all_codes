package LeetCode_Quetions;

import java.util.HashMap;

public class Q1287 {
	//Optimal solution
	public static int findSpecialInteger1(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;
        int result = 0;

        for(int i : arr) 
        	map.put(i, map.getOrDefault(i, 0) + 1);

        for(int i : map.keySet()){
            max = Math.max(max,map.get(i));
        }
        for(int i : map.keySet()){
            if(max == map.get(i)) result = i;
        }

        return result;
    }

	//Optimal solution
	public static int findSpecialInteger2(int[] arr) {
        int limit=arr.length/4;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[i+limit])
                return arr[i];
        }
        return -1;
    }
	
	public static int findSpecialInteger3(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) count++;
            }
            if(count > n / 4) return arr[i];
        }
        return -1;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,6,6,6,6,7,10};
		int ans = findSpecialInteger1(arr);
		System.out.println(ans);
	}

}
