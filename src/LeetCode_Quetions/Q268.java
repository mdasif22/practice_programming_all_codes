package LeetCode_Quetions;

class Q286 {
    public int missingNumber(int[] nums) {
        int expected_num = nums.length;
        int total_sum = expected_num * (expected_num + 1)/2;
        
        int sum=0;
        for(int i =0;i<nums.length;i++)
        {
            sum = sum + nums[i];
        }
        
        return total_sum - sum;
    }
}
