package StringPrograms;

class ArrangeString_Using_Number
{
	public static void main (String[] args)
	{	
		  //My approach
		  String str = "test4 this1 the3 is2";
		  String res = "";
		  String[] words = str.split(" ");
		  int[] index = new int[words.length];
		  String[] ans = new String[words.length];
		  for(int i=0;i<index.length;i++) {
			  int l=words[i].length()-1;
			  index[i] = Integer.parseInt(words[i].substring(l));
		  }
		  for(int i=0;i<index.length;i++) {
			  ans[index[i]-1] = words[i];
		  }
		  for(String ele:ans) {
			  res+=ele + " ";
		  }
		  System.out.println(res);
		
		
		
		/*
		//Method 1 O(n)
		String str = "test4 this1 the3 is2";
		String str2 = "";
		String[] word = str.split(" ");
		String[] temp = new String[word.length];
		for(int i = 0; i<word.length; i++)
		{
			int index = word[i].charAt(word[i].length()-1)-'0';
			temp[index - 1] = word[i].substring(0,word[i].length()-1);
		}
		for(int i=0;i<temp.length;i++) {
			str2 = str2+temp[i]+" ";
		}
		
		System.out.println(str2.trim());
       */
		
		//Method 2 O(n2)
//		String str = "test4 this1 the3 is2";
//		String[] words = str.split(" ");	
//		for(int i=0;i<words.length;i++) {
//			for(int j=i+1;j<words.length;j++) {
//				int first = Integer.parseInt(words[i].substring(words[i].length()-1)) ;
//				int second = Integer.parseInt(words[j].substring(words[j].length()-1)) ;
//				
//				if(first > second) {
//					String temp = words[i];
//					words[i]=words[j];
//					words[j]=temp;
//				}
//			}
//		}
//		
//		String s = "";
//		for(int i=0;i<words.length;i++) {
//			s+=words[i].substring(0,words[i].length()-1) +" ";
//		}
//		System.out.println(s);
	}
}