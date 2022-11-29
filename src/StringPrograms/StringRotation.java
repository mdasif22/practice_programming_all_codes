package StringPrograms;

public class StringRotation {
	
	public static boolean StringIsRotated(String str, String check) {
		String res = str + str;
		if (res.contains(check)) {
			return true;
		}

		return false;
	}

	public static String RotateStringLeft(String str, int times) {
		String str2 = str.substring(times) + str.substring(0, times);

		return str2;
	}

	public static String RotateStringRight(String str, int times) {
		int partition = str.length() - times;
		String str2 = str.substring(partition) + str.substring(0, partition);

		return str2;
	}

	public static void main(String[] args) {
		// String str="abcde";  //abcdebddea
		// String check="bcdea";
		// boolean ans = StringIsRotated(str,check);
		// System.out.println(ans);

		// String str="abcde";  //left=cdeab, right=deabc
		// int times=2;
		// //String ans = RotateStringLeft(str,times);
		// String ans = RotateStringRight(str,times);
		// System.out.println(ans);

	}

}
