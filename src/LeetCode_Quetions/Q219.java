package LeetCode_Quetions;

import java.util.*;

//import java.lang.Math;
class Q219 {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
      
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
      for (int i = 0; i < nums.length; i++)
      {
          if (map.containsKey(nums[i]))
          {
              if (Math.abs(i - map.get(nums[i])) <= Math.abs(k)) 
              {
                  return true;
              }
          }
          map.put(nums[i], i);
      }
      return false;
  
  }
}
