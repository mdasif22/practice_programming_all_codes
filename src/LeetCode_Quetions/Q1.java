package LeetCode_Quetions;

class Q1 {
    public int[] twoSum(int[] nums, int target) {
        
		int n = nums.length;
        int[] ans = new int[2];
        int i=0,j=0;
        for( i=0;i<n;i++)
        {
        	for( j=i+1;j<n;j++)
        	{
        		if(nums[i]+nums[j] == target)
        		{
        			return new int[] {i,j};
        		}
        	}
        }
        return new int[] {i,j};
    
    }
}
