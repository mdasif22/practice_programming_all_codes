package LeetCode_Quetions;

public class Q278 extends VersionControl {
    public int firstBadVersion(int n) {
        
        //Approach1 Binary Search
        int start =1;
        int end = n;
        int ans = -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)==false){
                start = mid+1; 
            }
            else{
                ans  = mid;
                end = mid-1;
            }
        }
        return ans;
        
        //Approach 2 (Brute force)
        // for(int i=1;i<=n;i++){
        //     if(isBadVersion(i))
        //         return i;
        // }
        // return -1;
    }
}
