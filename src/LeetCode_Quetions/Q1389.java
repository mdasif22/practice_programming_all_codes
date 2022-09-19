package LeetCode_Quetions;

import java.util.ArrayList;

class Q1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int size = nums.length;
        int ans [] = new int [size];
        ArrayList<Integer> target = new ArrayList<>();
        for(int i = 0 ; i < size ; i++){
            target.add(index[i],nums[i]);
        }
        for(int i = 0 ; i < size ; i++){
            ans[i] = target.get(i);
        }
        return ans;
    }
}
