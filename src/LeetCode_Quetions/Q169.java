package LeetCode_Quetions;

import java.util.*;

public class Q169 {

	public static int majorityElement(int[] nums) {
		// Method 1 (My approach)
//        int mid=nums.length/2;
//        int max=0;
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        for(int i=0;i<nums.length;i++) {
//        	if(!hm.containsKey(nums[i])) {
//        		hm.put(nums[i], 1);
//        	}
//        	else {
//        		hm.put(nums[i], hm.get(nums[i])+1);
//        	}
//        }
//        
//       Set<Integer> keys = hm.keySet();  
//       int k=0 ;
//      for (Integer x : keys) {  
//          if (hm.get(x) > max) {  
//              max=hm.get(x);
//              k=x;
//          }  
//      }
//      return k;

		// Method 2 Moore's voting algo
		int count=0,element=0;
        for(int ele : nums){
            if(count==0)
                element = ele;
            if(ele == element)
                count++;
            else
                count--;
        }
        return element;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 3 };
		int ans = majorityElement(nums);
		System.out.println(ans);

	}

}
