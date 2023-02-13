package Java8_Features;
import java.util.*;
import java.util.function.*;

class Employee{
	int eid;
	String name;
	Employee(int eid,String name){
		this.eid=eid;
		this.name=name;
	}
}

public class BiFunction_Demo {

	public static void main(String[] args) {
		//Ex1
		BiFunction<Integer,Integer,Integer> f1=(a,b)-> (a+b)/2;
		System.out.println(f1.apply(10,20));
		System.out.println(f1.apply(50,20));
		System.out.println(f1.apply(50,50));
		System.out.println();
		
		//Ex2
		List<Employee> list = new ArrayList<>();
		BiFunction<Integer,String,Employee> f2=(eid,name)->new Employee(eid,name);
		list.add(f2.apply(1, "Asif"));
		list.add(f2.apply(2, "Banku"));
		list.add(f2.apply(3, "Javed"));
		list.add(f2.apply(4, "Irfan"));
		
		for(Employee e : list) {
			System.out.println("Employee id : "+e.eid);
			System.out.println("Employee name : "+e.name);
			System.out.println();
		}
	}

}
