package Java8_Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1<o2)?+1:(o1>o2)?-1:0;
	}

//	@Override
//	public int compare(Integer o1, Integer o2) {
//		if(o1<o2)
//			return +1;
//		else if(o1>o2)
//			return -1;
//		else
//			return 0;
//	}
	
}

public class comparator {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(20);
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(25);
		l.add(0);
		
		System.out.println(l);
		Comparator<Integer> c = (o1,o2) -> (o1<o2)?+1:(o1>o2)?-1:0;
		Collections.sort(l,c);
		System.out.println(l);
		
		//using stream
		List<Integer> l1 = l.stream().sorted((i1,i2)->(i1<i2)?+1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println("Using stream comparator in sorted : "+l1);
	}
}
