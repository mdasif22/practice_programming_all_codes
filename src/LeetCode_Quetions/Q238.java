package LeetCode_Quetions;

class Q238 {
    public int[] productExceptSelf(int[] nums) {
    	
        int mul=1;
        int[] answer = new int[nums.length];
        
		//Left array
        for(int i=0;i<nums.length;i++) {
        	answer[i] = mul;
        	mul*=nums[i];
        }
        
        //Right array
        mul=1;
        for(int i=nums.length-1;i>=0;i--) {
        	answer[i] = answer[i]*mul;
        	mul*=nums[i];
        }
        
        return answer;
    
    }
}