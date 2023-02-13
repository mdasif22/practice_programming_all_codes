package Java8_Features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//Consumer simply take one input and consumes it and does not return any output.

class student{
	String name;
	int marks;
	student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
}

public class ConsumerDemo {
	public static void main(String[] args) {
		//Ex1
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
		
		Consumer<student> c1 = stud->{
			
				System.out.println("Name : "+stud.name);
				System.out.println("Marks : "+stud.marks);
				System.out.println("Grade : "+f4.apply(stud));
				System.out.println();
			
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
				c1.accept(stud);	
			}
			///c1.accept(stud);
		}
		System.out.println();
		
		
		//Ex2 Consumer Chaining using andThen method
		Consumer<Integer> squareMe=num1->System.out.println("Sequare is : "+num1*num1);
		Consumer<Integer> cubeMe=num1->System.out.println("Cube is : "+num1*num1*num1);
		squareMe.andThen(cubeMe).accept(5);
		System.out.println();
	}
}
