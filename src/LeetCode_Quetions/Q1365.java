package LeetCode_Quetions;

class Q1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
		int[] result = new int[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			int count=0;
			for(int j=0;j<nums.length;j++)
			{
				if(nums[j] < nums[i] )
				{
					count++;
				}
					
			}
			result[i] = count;
		}
		
		return result; //[4,0,1,1,3]
  
    }
}