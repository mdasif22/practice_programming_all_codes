package LeetCode_Quetions;

class Q905 {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,j=nums.length-1;
        int[] ans = new int[nums.length];
        for(int k=0;k<nums.length;k++){
            if(nums[k]%2==0){
                ans[i++] = nums[k];
            }
            else
            {
              ans[j--] = nums[k];  
            }
        }
        return ans;
    }
}
