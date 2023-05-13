package LeetCode_Quetions;

import java.util.Arrays;

public class Q1913 {
	public int maxProductDifference(int[] nums) {
        //Method 1 With Sorting
        Arrays.sort(nums);
        return nums[nums.length-1]*nums[nums.length-2] - nums[0]*nums[1];

         //Method 2 Without Sorting
         /*
        int max = 0, max2 = 0;
        int min = 10001, min2 = 10001;
        for (int i : nums) {
            if (i > max) {          // 1
                max2 = max;
                max = i;
            } else if (i > max2) {  // 2
                max2 = i;
            }
            if (i < min) {          // 3
                min2 = min;
                min = i;
            } else if (i < min2) {  // 4
                min2 = i;
            }
        }
        // return the product difference
        return max * max2 - min * min2; 
        */
    }
}
