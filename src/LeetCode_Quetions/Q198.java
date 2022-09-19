package LeetCode_Quetions;

public class Q198 {
	
	//My Approach but optimised
	public static int rob(int[] nums) {
		
		if(nums.length==1)
			return nums[0];
		
	    int sum1 =0,sum2=0;
	    for(int i=0;i<nums.length;i++) {
	    	if(i>=nums.length)
	    		return sum1;
	    	else {
	    		sum1+=nums[i++];
	    	}
	    }
	    
	    for(int i=1;i<nums.length;i++) {
	    	if(i>=nums.length)
	    		return sum1;
	    	else {
	    		sum2+=nums[i++];
	    	}
	    }
	    
	    return Integer.max(sum1, sum2);
	}
	
	public static void main(String[] args) {
		int[] nums = {1};
		int ans = rob(nums);
		System.out.println(ans);
	}
	
}
