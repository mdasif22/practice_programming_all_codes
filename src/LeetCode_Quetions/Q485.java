package LeetCode_Quetions;

class Q485 {
	
	public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0,count=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]==1) {
        		count++;
        		if(count>max)
        			max=count;
        	}
        	else
        		count=0;
        }
        return max;
    }
	
	public static void main(String[] args) {
		int[] num = {1,1,0,1,1,1}; //0,1,2,3
		int ans = findMaxConsecutiveOnes(num);
		System.out.println(ans);
	}
	
}