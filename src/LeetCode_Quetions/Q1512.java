package LeetCode_Quetions;

class Q1512 {
    public int numIdenticalPairs(int[] nums) {
        
        int count1=0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i] == nums[j])
					count1++;
			}
		}
		
		return count1;
    
    }
}
