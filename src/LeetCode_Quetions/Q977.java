package LeetCode_Quetions;

import java.util.Arrays;

class Q977 {
    public int[] sortedSquares(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i=0;i<temp.length;i++){
            temp[i] = nums[i] * nums[i];
        }
        Arrays.sort(temp);
        return temp;
    }
}
