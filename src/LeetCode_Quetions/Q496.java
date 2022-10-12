package LeetCode_Quetions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Q496 {
	
	
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> list2 = new ArrayList();
        for(int i=0;i<nums1.length;i++) {
        	int max = nums2[0];
        	for(int j=0;j<nums2.length;j++) {
        		if(nums1[i] == nums2[j]) {
        			list2.add(greater(nums2,nums2[j],j));
        		}
        	}
        }
        
        int[] ans = new int[list2.size()];
        int i=0;
        for(int ele : list2){
            ans[i++]=(int)ele;
        }
        return ans;
    }
	
	static int greater(int[] arr,int num,int index) {
		int max = -1;
		for(int i=index;i<arr.length;i++) {
			if(arr[i]>num) {
				max = arr[i];
				break;
			}
		}		
		return max;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		int duration = 2;
		int[] ans = nextGreaterElement(nums1,nums2);
		//List ans = nextGreaterElement(nums1,nums2);
		System.out.println(Arrays.toString(ans));
	}
	
}

