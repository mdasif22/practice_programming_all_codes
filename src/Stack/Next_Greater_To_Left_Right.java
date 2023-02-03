package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_To_Left_Right {
	
	public static int[] greaterLeft(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int size = arr.length;
		int[] ngl = new int[size];
		
		for(int i=0;i<size;i++) {
			while(st.size()>0 && st.peek()<=arr[i]) {
				st.pop();
			}
			
			//int ans=0;
			if(st.size()>0) {
				ngl[i]=st.peek();
			}
			else {
				ngl[i]=-1;
			}
			//ngl[i]=ans;
			st.push(arr[i]);
		}
		return ngl;
	}

	public static int[] greaterRight(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int size = arr.length;
		int[] ngl = new int[size];
		
		for(int i=size-1;i>=0;i--) {
			while(st.size()>0 && st.peek()<=arr[i]) {
				st.pop();
			}
			
			//int ans=0;
			if(st.size()>0) {
				ngl[i]=st.peek();
			}
			else {
				ngl[i]=-1;
			}
			//ngl[i]=ans;
			st.push(arr[i]);
		}
		return ngl;
	}
	public static void main(String[] args) {
		int[] arr= {3,4,1,2,5}; 	
		int[] ans = greaterRight(arr);		//ans= [4,5,2,5,-1]
		//int[] ans = greaterLeft(arr);	//ans = [-1,-1,4,4,-1]
		System.out.println(Arrays.toString(ans));

	}

}
