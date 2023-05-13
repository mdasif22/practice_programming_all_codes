package LeetCode_Quetions;

import java.util.Arrays;
import java.util.List;

public class Q324 {
public static void wiggleSort(int[] nums) {
	int[] arr=nums.clone();
    Arrays.sort(arr);
    int n=nums.length-1;
    for(int i=1;i<nums.length;i+=2) {
    	nums[i] = arr[n--];
    }
    for(int i=0;i<nums.length;i+=2) {
    	nums[i] = arr[n--];
    }
}

	public static void main(String[] args) {
		int[] nums = {1,5,1,1,6,4};
		wiggleSort(nums);
		

	}

}
