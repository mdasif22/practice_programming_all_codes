package G4G;

import java.util.Arrays;

public class Kth_element_of_two_sorted_Arrays {
	public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int[] result = new int[m+n];
        int i=0,j=0;
        int index=0;
        while(i<n && j<m) {
        	if(arr1[i]<arr2[j]) {
        		result[index++]=arr1[i++];
        	}
        	else {
        		result[index++]=arr2[j++];
        	}
        }
        while(i<n) {
        	result[index++]=arr1[i++];
        }
        while(j<m) {
        	result[index++]=arr2[j++];
        }
        
       // return result;
        return result[k-1];
        
    }

	public static void main(String[] args) {
		int arr1[] = {2, 3, 6, 7, 9};
		int arr2[] = {1, 4, 8, 10};
		int k=5;
		long ans = kthElement(arr1,arr2,arr1.length,arr2.length,k);
		//int[] ans = kthElement(arr1,arr2,arr1.length,arr2.length,k);
		System.out.println(ans);

	}

}
