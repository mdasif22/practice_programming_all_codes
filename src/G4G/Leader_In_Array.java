package G4G;

import java.util.*;

public class Leader_In_Array {

	public static ArrayList<Integer> leaders(int arr[], int n){
		ArrayList<Integer>list=new ArrayList<>();
        int max=0;
        for(int i=n-1;i>-1;i--)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
            
        return list;
    }
	
	public static void main(String[] args) {
		int n = 6;
		int A[] = {16,17,4,3,5,2};	
		List ans = leaders(A,n);
		System.out.println(ans);
	}

}
