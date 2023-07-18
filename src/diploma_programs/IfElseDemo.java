import java.util.*;

public class IfElseDemo {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
		a = sc.nextInt();
		System.out.println("ENTER THE second NUMBER");
		b = sc.nextInt();
		System.out.println("ENTER THE third NUMBER");
		c = sc.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("greater number is=" + a);
			} else {
				System.out.println("greater number is=" + c);
			}
		}

		else {
			if (b > c) {
				System.out.println("greater number is=" + b);
			} else {
				System.out.println("greater number is=" + c);
			}
		}

	}

}
