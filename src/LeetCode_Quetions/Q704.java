package LeetCode_Quetions;

public class Q704 {

	public static int search(int[] nums, int target) {
        int low = 0,high = nums.length-1;
        while(low<=high) {
        	int mid = low+(high-low)/2;
        	if(nums[mid]==target)
        		return mid;
        	else if(nums[mid]>target)
        		high = mid-1;
        	else
        		low = mid+1;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		int target = 9;
		int ans = search(nums,target);
		System.out.println(ans);
	}

}
