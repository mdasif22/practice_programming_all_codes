package LeetCode_Quetions;
import java.util.*;
//350. Intersection of Two Arrays II
class Q350 {
    public int[] intersect(int[] arr1, int[] arr2) {
           List<Integer> list = new ArrayList();
       int n = arr1.length;
       int m = arr2.length;
       int i=0,j=0;
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       while(i<n && j<m) {
    	   if(arr1[i]==arr2[j]) {
    		   list.add(arr1[i]);
    		   i++;
    		   j++;
    	   }
    	   else if(arr1[i]>arr2[j]) {
    		   j++;
    	   }
    	   else
    		   i++;
       }
       
       int[] ans = new int[list.size()];
       int k=0;
       for (Integer ele : list) {
    	   ans[k++]=ele;
       }    
       return ans;
    }
}