package G4G;

import java.util.Arrays;

public class Move_all_neg {

	public static void main(String[] args) {
		int[] num = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		int[] ans = move(num);
		System.out.println(Arrays.toString(ans));

	}

	private static int[] move(int[] num) {
		
		//My Approach
//		int[] tem=new int[num.length];
//		int j=0;
//		for(int i=0;i<num.length;i++) {
//			if(num[i]<0) {
//				tem[j++]=num[i];
//			}
//		}
//		 j=num.length-1;
//		for(int i=0;i<num.length;i++) {
//			if(num[i]>=0) {
//				tem[j--]=num[i];
//			}
//		}
//		
//		return tem;
		
		//Approach 2
//		int j=0;
//		for(int i=0;i<num.length;i++) {
//			if(num[i]<0) {
//				int temp=num[i];
//				num[i]=num[j];
//				num[j]=temp;
//				j++;
//			}
//			
//		}
//		return num;
		
		return null;
	}

}
