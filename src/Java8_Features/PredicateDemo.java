package Java8_Features;

//it works with boolean only. If we want to check some condition and return boolean value then it is used.
// we can use IntPredicate instead of Predicate to avoid internal autoboxing and autounboxing
import java.util.ArrayList;
import java.util.function.*;
public class PredicateDemo {
	String name;
	double sal;
	PredicateDemo(String name,double sal){
		this.name=name;
		this.sal=sal;
	}

	public static void main(String[] args) {
		//Ex1
		//IntPredicate we can also use instead Predicate
		Predicate<Integer> p = i->i%2==0;
		System.out.println(p.test(10));
		System.out.println(p.test(15));
		System.out.println();
		
		//Ex2
		Predicate<String> p2 = i->i.length()>5;
		System.out.println("Length of string is Grt thn 5? "+p2.test("Asifaa"));
		
		//Ex3
		String[] name= {"Asif","Chanda","Rabina","Amma","Raju"};
		for(String str : name) {
			if(p2.test(str)) {
				System.out.println(str);
			}
		}
		System.out.println();
		
		//Ex4
		ArrayList<PredicateDemo> list = new ArrayList<>();
		list.add(new PredicateDemo("Asif",31000));
		list.add(new PredicateDemo("Rabina",40000));
		list.add(new PredicateDemo("Sabina",25000));
		list.add(new PredicateDemo("Ain",22000));
		list.add(new PredicateDemo("javed",38000));
		list.add(new PredicateDemo("iffu",30000));
		
		Predicate<PredicateDemo> p3= emp->emp.sal>30000;
		
		for(PredicateDemo emp : list) {
			if(p3.test(emp)) {
				System.out.println(emp.name+" : "+emp.sal);
			}
		}
		System.out.println();
		
		//Ex5 Predicate joining(and,or,negate)
		int[] num = {6,11,12,20,8,30,5};
		Predicate<Integer> p4= n-> n%2==0;
		Predicate<Integer> p5= n-> n>10;
		for(int n : num) {
			if(p4.and(p5).test(n)) {
				System.out.println("The number which are grter than 10 and even : "+n);
			}
		}
		System.out.println();
		for(int n : num) {
			if(p4.or(p5).test(n)) {
				System.out.println("The number which are grter than 10 or even : "+n);
			}
		}
	}

}
