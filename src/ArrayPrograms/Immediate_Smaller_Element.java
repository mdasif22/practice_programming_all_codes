package ArrayPrograms;

import java.util.Arrays;

public class Immediate_Smaller_Element {
	
	static void immediateSmaller(int arr[], int n) {
		for (int i =0; i < n-1; i++) {
            if ( arr[i] > arr[i+1]) {
                arr[i] = arr[i+1];
            }
            else {
                arr[i] = -1;
            }
        }
         arr[n-1] = -1;
	}

	public static void main(String[] args) {
		int[] arr = {4, 2, 1, 5, 3};
		immediateSmaller(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
