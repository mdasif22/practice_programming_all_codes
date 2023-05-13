package LeetCode_Quetions;

import java.util.*;

public class Q229 {
	public static List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> hm = new HashMap();
        List<Integer> list = new ArrayList();
        int len=nums.length/3;
        for(int ele:nums) {
        	hm.put(ele, hm.getOrDefault(ele, 0)+1);
        }
        for(int k:hm.keySet()) {
        	if(hm.get(k)>len) {
        		list.add(k);
        	}
        }
        return list;
    }

	public static void main(String[] args) {
		int[] nums = {1,2};
		List ans = majorityElement(nums);
		System.out.println(ans);
	}

}
