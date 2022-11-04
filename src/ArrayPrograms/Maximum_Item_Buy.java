package ArrayPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Maximum_Item_Buy {
	static int find(int n,int k,List<Integer> list){
		List<Integer> list2 = new ArrayList();
		for(int i=1;i<=k;i++) {
			if(!list.contains(i)) {
				list2.add(i);
			}
		}
		int count=0,i=0,sum=0;
		Collections.sort(list2);  
		while(i<list2.size()) {
			sum+=list2.get(i);
			if(sum<=k) {
				count++;
			}
			else if(sum>k)
				break;
			i++;
		}
		return count+list.size();
	}
	public static void main(String[] args) {
	    List<Integer> list = new ArrayList();
	    list.add(1);
	    list.add(3);
	    list.add(8);
		
		int n=10;
		int m=3,k=10;
		int ans = find(n,k,list);
		System.out.println(ans);
	}
}