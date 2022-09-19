package LeetCode_Quetions;

import java.util.Arrays;

public class Q75 {

	public static void sortColors(int[] nums) {
        int temp,low=0,mid=0,high=nums.length-1;
        while(mid<=high) {
        	switch(nums[mid]) {
        	case 0:{
        		temp = nums[low];
        		nums[low]=nums[mid];
        		nums[mid]=temp;
        		
        		low++;
        		mid++;
        		break;
        	}
        	
        	case 1:{
        		mid++;
        		break;
        	}
        	
        	case 2:{
        		temp=nums[mid];
        		nums[mid]=nums[high];
        		nums[high]=temp;
        		
        		high--;
        		break;
        	}
        	
        	}
        }
        
    }
	
	public static void main(String[] args) {
		
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}

}
