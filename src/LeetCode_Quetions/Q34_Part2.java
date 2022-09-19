package LeetCode_Quetions;

import java.util.Arrays;

public class Q34_Part2 {

	public static int[] searchRange(int[] nums, int target) {
		
		int[] pos = new int[2];
		pos[0] = -1;
		pos[1] = -1;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				pos[0] = i;
				break;
			}
		}
		for(int i=nums.length-1;i>=0;i--) {
			if(nums[i]==target) {
				pos[1] = i;
				break;
			}
		}
		
		return pos;
	}
	
	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		int[] ans = searchRange(nums,target);
		System.out.println(Arrays.toString(ans));
	}

}
