package LeetCode_Quetions;

import java.util.Arrays;

class Q189 {
    public static void rotate(int[] nums, int k) {
    	int r=k%nums.length;
        int arr[] = new int[r];
        int index=0;
        for(int i=nums.length-r;i<nums.length;i++){
            arr[index++]=nums[i];
            //index++;
        }
        for(int j=nums.length-1;j>=r;j--)
            nums[j]=nums[j-r];
        for(int i=0;i<r;i++)
            nums[i]=arr[i];
    
    }
    
    public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(nums,k);
		System.out.println(Arrays.toString(nums));
	}
}
