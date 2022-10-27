package G4G;

public class floor_of_Sorted_Array {
	static int findFloor(long arr[], int n, long x)
    {
        int low=0;
        int high=n-1;
        int floor=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
                return mid;
            if(arr[mid]<x){
                
                low=mid+1;
                floor=mid;
            }
            else{
            high=mid-1;
            }
        }
        return floor;
    }
}
