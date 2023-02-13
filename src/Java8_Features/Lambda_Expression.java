package Java8_Features;

//functional interface
interface interf1{
	public void display();
}

interface interf2{
	public void square(int a,int b);
}

//this is normal process without lambda
class demo1 implements interf1{
	public void display() {
		System.out.println("Hello Asif");
	}
}

//this is normal process without lambda
class demo2 implements interf2{
	public void square(int a,int b) {
		System.out.println(a+b);
	}
}

public class Lambda_Expression {

	public static void main(String[] args) {
		//if we create class then
		//interf dm = new demo1();
		
		//if we create class then
//		demo2 dm = new demo2();
//		dm.square(10,20);
		
		//if we use lambda method
//		interf1 i = ()->System.out.println("Hello Asif");
//		i.display();
		
		interf2 i = (a,b)->System.out.println(a+b);
		i.square(100, 400);
	}

}
