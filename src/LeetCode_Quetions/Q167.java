package LeetCode_Quetions;

import java.util.HashMap;

class Q167 {
	    public int[] twoSum(int[] numbers, int target) {
	        HashMap<Integer,Integer> hm = new HashMap<>();
			
			for(int i=0;i<numbers.length;i++) {
				hm.put(numbers[i], i);
			}
			
			for(int i=0;i<numbers.length;i++) {
				int second = target-numbers[i];
				if(hm.containsKey(second)&& hm.get(second)!=i)
				{
					return new int[] {i+1,hm.get(second)+1};
				}
			}
			
			return new int[] {-1,-1};
	    }
	}
