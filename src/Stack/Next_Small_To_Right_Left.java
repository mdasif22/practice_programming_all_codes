package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Next_Small_To_Right_Left {
	
	public static int[] smallerRight(int[] arr) {
		Stack<Integer> st = new Stack();
		int size = arr.length;
		int[] sr = new int[size];
		
		for(int i=size-1;i>=0;i--) {
			
			while(st.size()>0 && st.peek()>=arr[i]) {
				st.pop();
			}
			int ans=0;
			if(st.size()>0) {
				ans=st.peek();
			}
			else {
				ans=-1;
			}
			sr[i]=ans;
			st.push(arr[i]);
			
		}
		return sr;
	}
	
	public static int[] smallerLeft(int[] arr) {
		Stack<Integer> st = new Stack();
		int size = arr.length;
		int[] sr = new int[size];
		
		for(int i=0;i<size;i++) {
			
			while(st.size()>0 && st.peek()>=arr[i]) {
				st.pop();
			}
			int ans=0;
			if(st.size()>0) {
				ans=st.peek();
			}
			else {
				ans=-1;
			}
			sr[i]=ans;
			st.push(arr[i]);
			
		}
		return sr;
	}

	public static void main(String[] args) {
		int[] arr= {3,4,1,2,5}; 	
		int[] ans = smallerRight(arr);	//ans = [1,1,-1,-1,-1]
		//int[] ans = smallerLeft(arr);		//ans= [-1,3,-1,1,2]
		System.out.println(Arrays.toString(ans));
	}

}
