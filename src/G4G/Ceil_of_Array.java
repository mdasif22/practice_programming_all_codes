package G4G;

import java.util.Arrays;

public class Ceil_of_Array {
	public static Pair getFloorAndCeil(int[] arr, int n, int x) {
		int floor = -1;
        int ceil = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                floor = ceil = arr[i];
            }
            else if(arr[i]>x){
                ceil = Math.min(ceil,arr[i]);
            }
            else{
                floor = Math.max(floor,arr[i]);
            }
        }
        if(ceil == Integer.MAX_VALUE) ceil = -1;
        return new Pair(floor,ceil);
    }

	public static void main(String[] args) {
		int N = 8, X = 7;
		int Arr[] = {5, 6, 8, 9, 6, 5, 5, 6};
		int[] ans = getFloorAndCeil(Arr,N,X);
		System.out.println(Arrays.toString(ans));
	}

}
