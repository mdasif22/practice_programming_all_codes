package LeetCode_Quetions;

class Q287 {
    public int findDuplicate(int[] nums) {
        
        //Method 1
// 		int i=0;
// 		while(i<nums.length) {
			
// 			if(nums[i] != i+1)
// 			{
// 				int correct = nums[i]-1;	//Formula
// 				if(nums[i] != nums[correct] )
// 				{
// 					swap(nums,i,correct);
// 				}
// 				else
// 					return nums[i];
// 			}
			
// 			else
// 				i++;
			
// 		}
		
// 		return -1;
        
        
        //Method 2
// 		int i = 0;
// 		while (i < nums.length) {
// 			int correct = nums[i] - 1; // Formula
// 			if (nums[i] != nums[correct]) {
// 				swap(nums, i, correct);
// 			} else
// 				i++;

// 		}

		
// 		for (int index = 0; index < nums.length; index++) {
// 			if (nums[index] != index + 1) {
// 				return nums[index];
// 			}
// 		}

// 		return -1;
	
        
    }
    
    static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
    
}

