package LeetCode_Quetions;

import java.util.*;

public class Q1403 {
	
	public static List<Integer> minSubsequence(int[] nums) {
		//My approach
        /*
        List list = new ArrayList();
		Arrays.sort(nums);
		int sum=0;
		int i=nums.length-1;
		while(sum <= Arrays.stream(nums).sum()-sum) {
		    sum+=nums[i];
		    list.add(nums[i]);
		    i--;
		}	
		return list;
        */

        int total = 0;
        for(int i=0;i<nums.length;i++){
            total += nums[i];
        }
        Arrays.sort(nums);
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            ans.add(nums[i]);
            sum += nums[i];
            if(sum>total-sum){
                return ans;
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		int[] nums = {4,4,7,6,7};
		List ans = minSubsequence(nums);
		System.out.println(ans);
	}

}
