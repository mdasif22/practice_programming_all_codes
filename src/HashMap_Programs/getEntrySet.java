package HashMap_Programs;

import java.util.HashMap;
import java.util.Map;

public class getEntrySet {
	public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
        	map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> item:map.entrySet()) {
        	if(item.getValue()==1) {
        		return item.getKey();
        		
        	}
        }
        return 0;
    }

	public static void main(String[] args) {
    	int[] nums = {2,2,1,5,5,1,8};
    	System.out.println(singleNumber(nums));
//    	for(List<Integer> e:res) {
//    		System.out.print(e);
//    	}
    }

}
