package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class hashset {
	
	//Remove duplicates
	public static void main(String[] args) {
		ArrayList k = new ArrayList();
		k.add(2);
		k.add(3);
		k.add(1);
		k.add(4);
		k.add(2);
		
		HashSet s = new HashSet();
		Iterator i = k.iterator();
		while(i.hasNext()) {
			Integer in = (Integer)i.next();
			s.add(in);
			//System.out.println(in);
		}

		System.out.println(k);
		System.out.println(s);
	}

}
