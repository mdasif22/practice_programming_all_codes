package G4G;

import java.util.Arrays;

class array_rev
{
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		int j=0,k=ar.length-1;
		for(int i=0;i<ar.length;i++) {
			if(j<=k) {
				int temp=ar[j];
				ar[j]=ar[k];
				ar[k]=temp;
				j++;
				k--;
			}
		}
		System.out.println(Arrays.toString(ar));
	}
	
}