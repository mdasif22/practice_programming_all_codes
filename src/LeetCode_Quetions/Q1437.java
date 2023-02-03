package LeetCode_Quetions;

public class Q1437 {

	public static boolean kLengthApart(int[] nums, int k) {
        int count=0;
        int one=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]==1 && one==0) {
        		one++;
        	}
        	else if(nums[i]==1) {
        		if(count>=k) {
        			count=0;
        		}
        			
        		else
        			return false;
        	}
        	else if(nums[i]!=1) {
        		count++;
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		int[] nums = {1,0,0,1,0,1}; int k = 2;
		boolean ans = kLengthApart(nums,k);
		System.out.println(ans);
	}

}
