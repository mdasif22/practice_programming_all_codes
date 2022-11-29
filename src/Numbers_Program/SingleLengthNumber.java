package Numbers_Program;

public class SingleLengthNumber {
	public static void main(String[] args) {
		int sum = 0, num = 38;
		while (num > 9) {
			sum = 0;
			while (num > 0) {
				int rem = num % 10;
				sum += rem;
				num /= 10;
			}
			num = sum;
		}
		System.out.println(sum);
	}
}