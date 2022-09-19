package LeetCode_Quetions;

import java.util.Arrays;

class Q628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
            int a = nums[0] * nums[1] * nums[len -1];
            int b = nums[len - 1] * nums[len - 2] * nums[len - 3];
            
            return a > b ? a : b;
    }
}
