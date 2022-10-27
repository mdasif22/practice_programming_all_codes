package LeetCode_Quetions;

class Q540 {
    public int singleNonDuplicate(int[] nums) {
        
    	//METHOD 1
        //Strivers's video
         int high = nums.length-2;
         int low = 0;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==nums[mid^1]){ //if even and odd elements are same
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return nums[low];
        
        
        //METHOD 2
        //Watched video from tech dose utube channel
        /*
        int high = nums.length-1;
        int low = 0;
        int mid;
        
        //Boundary cases
        if(high==0)
            return nums[0];
        else if(nums[0]!=nums[1])
            return nums[0];
        else if(nums[high]!=nums[high-1])
            return nums[high];

        while(low<=high)
        {
            mid = low + (high-low)/2;
            //Unique element condition
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1])
                return nums[mid];
            //check if it is in even index or odd index
            if(((mid%2)==0 && nums[mid]==nums[mid+1])
               ||  ((mid%2)==1 && nums[mid]==nums[mid-1]))
                low = mid+1;
            else
                high = mid-1;
            
        }
        return -1;
        */
    }
}