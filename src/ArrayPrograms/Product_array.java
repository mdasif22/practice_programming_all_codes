package ArrayPrograms;

import java.util.Arrays;

public class Product_array {
	public static int[] productExceptSelf(int[] nums) {
        
        int mul=1;
        int[] answer = new int[nums.length];
        
        //My method O(n2)
//        for(int i=0;i<nums.length;i++) {
//        	int mul =1;
//        	for(int k=0;k<nums.length;k++) {
//        		if(nums[i] == nums[k])
//            		continue;
//            	mul = mul*nums[k];
//            	
//        	}
//        	
//        		answer[i] = mul;
//        }
//        return answer;
		
        //Optimal soution O(n)
		//Left array
        for(int i=0;i<nums.length;i++) {
        	answer[i] = mul;
        	mul*=nums[i];
        }
        mul=1;
        for(int i=nums.length-1;i>=0;i--) {
        	answer[i] = answer[i]*mul;
        	mul*=nums[i];
        }
        
        return answer;
    }
	
		
	public static void main(String[] args) {
		int[] matrix = 	{0,0};	//{1,2,3,4};
		int[] ans = productExceptSelf(matrix);
		System.out.println(Arrays.toString(ans));
		
	}
}
