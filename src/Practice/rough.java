package Practice;

import java.util.*;

class rough {
	
	
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list1 = new ArrayList<>();
		for(int i=0;i<5;i++) {
			List list2 = new ArrayList();
			int count=1;
			for(int j=0;j<=i;j++) {
				list2.add(count++);
			}
			list1.add(list2);
		}
		return list1;
	}
	
	public static void main(String[] args) {
		int[][] arr = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
		int N = 5;
		List ans = generate(N);
		System.out.println(ans);
	}
	
}
