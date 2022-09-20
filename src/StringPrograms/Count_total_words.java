package StringPrograms;

class Count_total_words
{
	public static void count(String str) {
		int vowel=0,con=0,word=0,total=0;
		String s=str.toLowerCase();
		String[] s1= s.split(" ");
		//int j=0;
		for(int i=0;i<s1.length;i++) {
			for(int k=0;k<s1[i].length();k++) {
				char ch = s1[i].charAt(k);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vowel++;
				}
				else
					con++;
				
				total++;
			}
			word++;
		}
		
		System.out.println("Vowel = "+vowel);
		System.out.println("consonent = "+con);
		System.out.println("word = "+word);
		System.out.println("total = "+total);
		
	}
	
	
	
	public static void main(String[] args) {
		String str="hello i am Asif";
		//System.out.println();
		count(str);
	}
	
}