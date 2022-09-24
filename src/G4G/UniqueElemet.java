package G4G;

import java.util.*;

public class UniqueElemet {

	public static void main(String[] args) {
		int[] arr = {2,4,7,2,7};
		//Method 1 My approach
//		List list = new ArrayList();
//		for(int i=0;i<arr.length;i++) {
//			if(list.contains(arr[i])) {
//				int tem =list.indexOf(arr[i]);
//				list.remove(tem);
//			}
//			else {
//				list.add(arr[i]);
//			}
//		}
//		
//		System.out.println(list);

		//Method 2
		int ans =0;
		for(int i=0;i<arr.length;i++) {
			ans = ans^arr[i];
		}
		System.out.println(ans);
	}
}
