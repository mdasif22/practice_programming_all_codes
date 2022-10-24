package ArrayPrograms;

//********************* ARRAY ROTATE RIGHT SHIFT ********************
//class Rotate_Arrays
//{
//	public static int[] rotate(int[] nums, int k) {
//    
//		int index = nums.length-1;
//		for(int j=1;j<=k;j++)
//		{
//			int last = nums[index];
//			for(int i=index;i>0;i--)
//			{
//				nums[i] = nums[i-1];
//				
//			}
//			nums[0] = last;
//		}
//		
//		return nums;
//		
//}
//	
//	public static void main(String[] args) {
//		int[] nums = {1,2,3,4,5,6,7}; 
//		int k = 3;
//		int[] ans = rotate(nums,k);
//		System.out.println(Arrays.toString(ans));
//	}
//}


//********************* LEFT ROTATE ****************
//class Rotate_Arrays
//{
//	public static int[] rotate(int[] nums, int k) {
//    
//		int index = nums.length-1;
//		for(int j=1;j<=k;j++)
//		{
//			int first = nums[0];
//			for(int i=0;i<nums.length-1;i++)
//			{
//				nums[i] = nums[i+1];
//				
//			}
//			nums[index] = first;
//		}
//		
//		return nums;
//		
//}
//	
//	public static void main(String[] args) {
//		int[] nums = {1,2,3,4,5,6,7}; 
//		int k = 3;
//		int[] ans = rotate(nums,k);
//		System.out.println(Arrays.toString(ans));
//	}
//}


//Problem 189(Right shift)
//class Rotate_Arrays
//{
//	public static int[] rotate(int[] nums, int k) {
//    
//		int index = nums.length-1;
//		for(int j=1;j<=k;j++)
//		{
//			int last = nums[index];
//			for(int i=index;i>0;i--)
//			{
//				nums[i] = nums[i-1];
//				
//			}
//			nums[0] = last;
//		}
//		
//		return nums;
//		
//}
//	
//	public static void main(String[] args) {
//		int[] nums = {1,2,3,4,5,6,7}; 
//		int k = 3;
//		int[] ans = rotate(nums,k);
//		System.out.println(Arrays.toString(ans));
//	}
//}
