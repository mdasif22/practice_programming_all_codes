package Java8_Features;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
//If we want to represent a group of object as a single entity then we should go for collection.
//If we want the objects from collection then we s=use stream.
/*
stream()
filter()
map()
collect()
count()
sorted()
min()
max()
forEach()
 */
public class Stream_Demo {

	public static void main(String[] args) {
		//Ex1 
		//When we want to filter some output then we use "filter" method.
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(50);
		list1.add(15);
		list1.add(7);
		list1.add(18);
		
		List<Integer> list2 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		//System.out.println("List 1 : "+list1);
		//System.out.println("List 2 : "+list2);
		
		//Ex2
		//When we want to process or modify some output then we use "map" method.
		List<Integer> marks = new ArrayList<>();
		marks.add(10);
		marks.add(50);
		marks.add(15);
		marks.add(7);
		marks.add(18);
				
		List<Integer> marks2 = marks.stream().map(i->i+5).collect(Collectors.toList());
		//System.out.println("List 1 : "+marks);
		//System.out.println("List 2 : "+marks2);
				
		//Ex3
		//When we want to count number of some output then we use "count" method.
		List<Integer> subMarks = new ArrayList<>();
		subMarks.add(10);
		subMarks.add(50);
		subMarks.add(15);
		subMarks.add(37);
		subMarks.add(318);
				
		long subMarks2 = subMarks.stream().filter(i->i<35).count();
		//System.out.println("Marks 1 : "+subMarks);
		//System.out.println("count of fail : "+subMarks2);
				
		//Ex4
		//When we want to sort the List then we use "sorted" method.
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(50);
		l1.add(15);
		l1.add(37);
		l1.add(0);
				
		List<Integer> l2 = l1.stream().sorted().collect(Collectors.toList());
		List<Integer> li = list1.stream().sorted((i1,i2)->(i1<i2)?+1:(i1>i2)?-1:0).collect(Collectors.toList());
		List<Integer> l3 = l1.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
//		System.out.println("List 1 : "+l1);
//		System.out.println("Accending : "+l2);
//		System.out.println("Decending : "+l3);
//		System.out.println("Decending Another formate : "+li);
		
		//Ex5
		//When we want to get "min" and "max" value of List then we use "min" and "max" method.
		List<Integer> l4 = new ArrayList<>();
		l4.add(10);
		l4.add(50);
		l4.add(15);
		l4.add(37);
		l4.add(0);
						
		int min = l4.stream().min((i1,i2)->i1.compareTo(i2)).get();
		int max = l4.stream().max((i1,i2)->i1.compareTo(i2)).get();
//		System.out.println("List : "+l4);
//		System.out.println("MIN value : "+min);
//		System.out.println("MAX value : "+max);
		
		
				//Ex6
				//When we want to access each value of List then we use "forEach" method.
				List<Integer> l5 = new ArrayList<>();
				l5.add(10);
				l5.add(20);
				l5.add(15);
				l5.add(3);
				l5.add(0);
				
//				Consumer<Integer> c = i->{
//					System.out.println("Square of "+i+" = "+i*i);
//				};
//				
//				l5.stream().forEach(c);
				
					// OR
				
				l5.stream().forEach(i->{
					System.out.println("Square of "+i+" = "+i*i);
				});
				
	}

}
