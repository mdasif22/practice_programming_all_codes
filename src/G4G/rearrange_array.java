package G4G;

import java.util.Arrays;

public class rearrange_array {

	public static int[] rearrange(int[] arr) {
		int j=0;
		int k=1;
		int count=0;
		int[] temp = new int[arr.length];

		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0)
				count++;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0 && j<arr.length) {
				temp[j]=arr[i];
				j=j+2;
			}	
		}
		
		count = count-1;
		for(int i=0;i<arr.length;i++) {
			if(k<arr.length) {
				if(arr[i]>0 && count != 0) {
					temp[k] = arr[i]; 
					k=k+2;
					count--;
				}
				else {
					if(arr[i]>0) {
						temp[k]=arr[i];
						k++;
					}
				}
			}
			
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, -4, -11,-3};
		int[] ans = rearrange(arr);
		System.out.println(Arrays.toString(ans));
	}

}
