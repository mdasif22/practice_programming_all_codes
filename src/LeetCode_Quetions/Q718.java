package LeetCode_Quetions;

public class Q718 {
	public static int findLength(int[] nums1, int[] nums2) {
			int m = nums1.length;
	        int n = nums2.length;
	        int maxCount=0;
	        for(int i=-n+1;i<m;i++)
	        {
	            int count=0;
	            for(int j=0;j<n;j++)
	            {
	                if(i+j<0)
	                {
	                    continue;
	                }
	                else if(i+j>=m)
	                {
	                   break; 
	                }
	                else if(nums1[i+j]==nums2[j])
	                {
	                   count++;;
	                    maxCount = Math.max(maxCount,count);
	                }
	                else
	                {
	                    count =0;
	                }
	            }
	        }
	        return maxCount;
    }

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,2,1}, nums2 = {3,2,1,4,7};
		int ans = findLength(nums1,nums2);
		System.out.println(ans);
	}

}
