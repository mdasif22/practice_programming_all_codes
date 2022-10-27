package G4G;

public class Rotation_Number {
	int findKRotation(int nums[], int n) {
        
        //Method 1 O(logn)
        int low=0;
        int high=n-1;
        
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[high])
                low=mid+1;
            else 
                high=mid;
        }
        return low;
        
        //Method 2 O(n)
        // int min=arr[0];
        // int min_index=0;
        // for(int i=1;i<n;i++){
        //     if(arr[i]<min){
        //         min=arr[i];
        //         min_index=i;
        //     }
        // }
        // return min_index;
    }
}
