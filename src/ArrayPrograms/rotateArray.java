package ArrayPrograms;

import java.util.Arrays;

public class rotateArray {

	//Method 1 ( Right shift)
	public static int[] rotateRight1(int[] nums, int k) {
		int n = nums.length;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[(i+k)%n] = nums[i];
        }
        nums = temp;
        return nums;
	}
	
	//Method 2  (Right shift)
	public static int[] rotateRight2(int[] nums, int k) {
	      
		int index = nums.length-1;
		for(int j=1;j<=k;j++)
		{
			int last = nums[index];
			for(int i=index;i>0;i--)
			{
				nums[i] = nums[i-1];
				
			}
			nums[0] = last;
		}
		
		return nums;
		
  }
	
	//left rotate single time
	public static int[] rotateLeft1(int[] nums) {
		int temp = nums[0];
		for(int i=1;i<nums.length;i++) {
			nums[i-1]=nums[i];
		}
		nums[nums.length-1] = temp;
		return nums;
	}
	
	//Easiest Way
	public static int[] RotateArrayLeft2(int[] arr, int times) { // 1,2,3,4,5 = 3,4,5,1,2
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp[i % arr.length] = arr[(i + times) % arr.length];
		}

		return temp;
	}
	
	    //left rotate multiple times
		public static int[] rotateLeft2(int[] nums, int k) {
			int[] temp = new int[k];
			int len = nums.length;
			//store first k elements in temp array (to add it later in the end of num array)
			for(int i=0;i<k;i++) {
				temp[i]=nums[i];
			}
			
			//shifting remaining elements at starting
			for(int i=0;i<len-k;i++) {
				nums[i]=nums[i+k];
			}
			
			//add temp(first k elements) elements at end
			int j=0;
			for(int i=len-k;i<len;i++) {
				nums[i]=temp[j++];
			}
			return nums;
		}
	
	public static void main(String[] args) {
		int[] nums1= {1,2,3,4,5};
		int[] nums2= {};
		
//		int[] ans1 = rotateRight1(nums1,2);
//		System.out.println(Arrays.toString(ans1));
		
//		int[] ans2 = rotateLeft2(nums1,2);
//		System.out.println(Arrays.toString(ans2));
		
		int[] ans2 = rotateLeft2(nums1,2);
		System.out.println(Arrays.toString(ans2));
		
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] ans = RotateArrayLeft2(arr, 2);
		System.out.println(Arrays.toString(ans));

	}
}
