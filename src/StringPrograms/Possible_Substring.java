package StringPrograms;

public class Possible_Substring {

	public static void main(String[] args) {
		String str="abc";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}

	}

}

//*************** Number of Possible SubStrings ***************
//Number of Possible SubStrings
//class codechef{
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	String str = sc.next();
//	int n = str.length();
//	System.out.println("Possible Substrings are = "+(n*(n+1))/2);
//		
//	}
//}
