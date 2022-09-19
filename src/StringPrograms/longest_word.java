package StringPrograms;

public class longest_word {

	public static void main(String[] args) {
		String str1 = "This is australia india pakistan and afganishtaan";
		String[] str2 = str1.split(" ");
		String greater="";
		String lowest = "";
		int len1=0;
		int len2=str2[0].length();;
		for(int i=0;i<str2.length;i++) {
			if(str2[i].length()>len1) {
				len1 = str2[i].length();
				greater = str2[i];
			}
			else if(str2[i].length()<len2) {
				len2 = str2[i].length();
				lowest = str2[i];
			}
		}
		
		System.out.println("Greatest element is : "+greater);
		System.out.println("Smallest element is : "+lowest);
	}

}
