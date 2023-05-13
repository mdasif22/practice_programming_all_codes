package LeetCode_Quetions;

import java.util.Stack;

public class Q456 {
	
	public static boolean find132pattern(int[] nums) {
		Stack<Integer> st = new Stack<>();
        int secondMax = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < secondMax) {
                return true;
            }
            while (!st.isEmpty() && nums[i] > st.peek()) {
                secondMax = Math.max(secondMax, st.pop());
            }
            st.push(nums[i]);
        }

        return false;
        
    }

	public static void main(String[] args) {
		int[] nums = {-1,3,2,0};
		boolean ans = find132pattern(nums);
		System.out.println(ans);

	}

}
