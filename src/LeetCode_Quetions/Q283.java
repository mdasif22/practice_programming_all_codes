package LeetCode_Quetions;

class Q283 {
    public void moveZeroes(int[] nums) {
        
		int len = nums.length;
		int j=0;
        for(int i=0;i<len;i++)
        {	
        	if(nums[i] != 0)
        	{
        		int temp = nums[i];
        		nums[i] = nums[j];
        		nums[j] = temp;
        		j++;
        	}
        }
        //System.out.println(Arrays.toString(nums));
    
    }
}
