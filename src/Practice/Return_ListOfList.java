package Practice;

import java.util.ArrayList;
import java.util.List;

class Return_ListOfList {
	
	
	public static List<List<Integer>> generate() {
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
		List ans = generate();
		System.out.println(ans);
	}
	
}