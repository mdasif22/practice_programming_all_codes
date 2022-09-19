package Diploma_Practice;
public class FunctionDemo {
	public static int multiplication(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	public static void display() {
		System.out.println("Successfully Executed!!!");
	}

	public static void main(String args[]) {
		int num1 = 10; 
		int num2 = 50;
		int res = multiplication(num1, num2);
		System.out.println("\t\n\nMultiplication IS " + res);
		display();
	}
}