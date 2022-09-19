package Diploma_Practice;
import java.util.*;
import java.util.Scanner;

public class StatementDemo {
	public static void main(String args[]) {

		int num1 = 0, num2 = 0, option, ex;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n Enter your choice");
			System.out.println("\n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Table \n 6.Exit");
			option = sc.nextInt();

			if (option < 5) {
				System.out.println("\nEnter the first number");
				num1 = sc.nextInt();
				System.out.println("\n Enter the second number");
				num2 = sc.nextInt();
			} else if (option == 5) {
			} else {
				break;
			}

			switch (option) {
			case 1:
				System.out.println("\nAddition is " + (num1 + num2));
				break;

			case 2:
				System.out.println("\nSubtraction is " + (num1 - num2));
				break;

			case 3:
				System.out.println("\nAddition  is " + (num1 * num2));
				break;

			case 4:
				if (num2 == 0)
					System.out.println("\nError!!! In Division denominator cannot be 0!");
				else {
					System.out.println(" \ndivision  is " + (num1 / num2));
				}
				break;

			case 5:
				int i, n;
				System.out.println("enter no:");
				n = sc.nextInt();
				System.out.println("\n");
				for (i = 1; i <= 10; i++) {
					System.out.println(+i * n);
				}
				break;

			case 6:
				break;

			default:
				System.out.println("\nInvalid choice");
			}
			System.out.println("Do you want to continue?1.yes 2.no");
			ex = sc.nextInt();
		} while (ex == 1);
	}
}
