package Java8_Features;
import java.util.function.*;
//it takes input, produces and return output.

class student{
	String name;
	int marks;
	student(String name,int marks){
		this.name=name;
		this.marks=marks;
		
	}
}

public class FunctionDemo {

	public static void main(String[] args) {
		//Ex1
		Function<Integer,Integer> f1= num->num*num;
		System.out.println("Square is : "+f1.apply(4));
		System.out.println("Square is : "+f1.apply(5));
		System.out.println();
		
		//Ex2
		Function<String,Integer> f2=str->str.length();
		Function<String,String> f3=str->str.toUpperCase();
		System.out.println("Square is : "+f2.apply("Asif"));
		System.out.println("String is : "+f3.apply("asif"));
		System.out.println();
		
		//Ex3
		Predicate<student> p1 = stud->stud.marks>=60;
		Function<student,String> f4=stud->{
			int marks=stud.marks;
			String grade="";
			if(marks>=80) return grade="A";
			else if(marks>=60)  grade="B";
			else if(marks>=50)  grade="C";
			else if(marks>=35)  grade="D";
			else  grade="Failed";
			return grade;
		};
		
		student[] s= {
				new student("Asif",90),
				new student("Banku",65),
				new student("Ain",55),
				new student("Iffu",45),
				new student("Java",25)
		};
		
		for(student stud : s) {
			if(p1.test(stud)) {
				System.out.println("Name : "+stud.name);
				System.out.println("Marks : "+stud.marks);
				System.out.println("Grade : "+f4.apply(stud));
				System.out.println();
			}
		}
		System.out.println();
		
		
		//Ex4 Function chaining(andThen, compose) methods
		//andThen= first f1 will be applied then f2
		//compose= first f2 will be applied then f1
		Function<Integer,Integer> f5=i->2*i;
		Function<Integer,Integer> f6=i->i*i*i;
		System.out.println("andThen method : "+f5.andThen(f6).apply(2));
		System.out.println("compose method : "+f5.compose(f6).apply(2));
		System.out.println();
	}

}
