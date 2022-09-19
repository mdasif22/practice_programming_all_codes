package ArrayPrograms;
//PROBLEM 53
public class Max_Subarray {
	
	public static int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++) {
        	sum+=nums[i];
        	if(sum>max) {
        		max=sum;
        	}
        	if(sum<0) {
        		sum=0;
        	}
        }
        return max;
    }
	
	public static void main(String[] args) {
		int[] num = {-2,1,-3,4,-1,2,1,-5,4};
		int ans = maxSubArray(num);
		System.out.println(ans);
		
	}
}
