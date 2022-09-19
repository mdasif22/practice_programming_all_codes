package LeetCode_Quetions;

class Q1859 {
    public String sortSentence(String s) {
    
		//String str1 = "is2 this1 test4 a3";
		String str2 = " ";
		String[] word = s.split(" ");
		String[] temp = new String[word.length];
		for(int i = 0; i<word.length; i++)
		{
			int index = word[i].charAt(word[i].length()-1)-'0';
			temp[index - 1] = word[i].substring(0,word[i].length()-1);
		}
		for(int i=0;i<temp.length;i++) {
			str2 = str2+temp[i]+" ";
		}
		
		//System.out.println(str2.trim());
        return str2.trim();

    }
}
