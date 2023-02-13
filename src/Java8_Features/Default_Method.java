package Java8_Features;

//If we have a interface and thousand of classes implemented it then later on if we add new abstract method in interface then each class has to provide implementation of that method and due to this class may get break.
//To overcome this problem, Default method is introduced in java 8 which allows to create Default method and the required class only provide the implementation and remaining class can ignore it.
//If a class implementing a interface then each implementing class should provide the implementation for each method of interface.
//Without effecting implementation classes if we want to add new method to the interface then we should go for ===>Default Methods


interface Demo
{
//	void m1();
//	void m2();
	default void m3() {
		System.out.println("Default Method");
	}
}

class A implements Demo{
	public void m1() {}
	public void m2() {}
}
class B implements Demo{
	public void m1() {}
	public void m2() {}
}
class C implements Demo{
	public void m1() {}
	public void m2() {}
}
class Nth implements Demo{
	public void m1() {}
	public void m2() {}
}


public class Default_Method implements Demo{

	//If we are not satisfied with parent implementation then we can override it and provide our own implementation
	public void m3() {
		System.out.println("Override version of Default Method");
	}
	
	public static void main(String[] args) {
		Default_Method obj = new Default_Method();
		obj.m3();

	}

}
