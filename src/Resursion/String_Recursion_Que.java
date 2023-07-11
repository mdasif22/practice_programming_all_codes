package Resursion;

import java.util.ArrayList;
import java.util.List;

public class String_Recursion_Que {
	
	//it will skip all 'a' from string
	public static void skipAllA(String processed,String unPro) {
		if(unPro.isEmpty()) {
			System.out.println(processed);
			return;
		}
		
		char c = unPro.charAt(0);
		if(c=='a') {
			skipAllA(processed,unPro.substring(1));
		}
		else {
			skipAllA(processed + c,unPro.substring(1));
		}
	}
	
	public static void subsequence(String processed, String unPro) {
		if(unPro.isEmpty()) {
			System.out.println(processed);
			return;
		}
		
		char ch = unPro.charAt(0);
		
		//make two fucntion calls one for either take the character or ignore it
		//it will print in random order
		subsequence(processed + ch, unPro.substring(1));
		subsequence(processed, unPro.substring(1));
		
		//if u want to print it in an order than
//		subsequence(processed, unPro.substring(1));
//		subsequence(processed + ch, unPro.substring(1));
		
	}

	//it will reverse a string
	public static void StringReverse(String str, int index) {
		if(index==0) {
			System.out.print(str.charAt(index)+" ");
			return;
		}
		
		System.out.print(str.charAt(index)+" ");
		StringReverse(str,index-1);
	}
	
	//it will print first and last occurance of a char
	static int first = -1;
	static int last = -1;
	public static void CharOccurance(String str, int index, char element) {
		if(index==str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currEle = str.charAt(index);
		if(currEle == element) {
			if(first==-1) {
				first=index;
			}else {
				last=index;
			}
		}
		CharOccurance(str,index+1,element);
	}
	
	//remove duplicate from string with recursion
	static boolean map[] = new boolean[26];
	public static void removeDuplicates1(String str, int index,String newStr) {
		if(index==str.length()) {
			System.out.println(newStr);
			return;
		}
		
		char currEle = str.charAt(index);
		if(map[currEle-'a']==true) {
			removeDuplicates1(str,index+1,newStr);
		}
		else {
			newStr+=currEle;
			map[currEle-'a']=true;
			removeDuplicates1(str,index+1,newStr);
		}
	}
	
	//remove duplicate from string without recursion
	public static void removeDuplicates2(String str) {
		String newstr = new String();
		int length = str.length();
		for (int i = 0; i < length; i++) {
			char charAtPosition = str.charAt(i);

			if (newstr.indexOf(charAtPosition) < 0) {
				newstr += charAtPosition;
			}
		}
		System.out.println(newstr);
	}
	
	//*************	STRING PERMUTATION *******************
		//By Kunal	
		public static void permutation1(String p,String up)
		{
			if(up.isEmpty())
			{
				System.out.println(p);
				return;
			}
			
			char ch = up.charAt(0);
			for(int i=0;i<=p.length();i++)
			{
				
				String f=p.substring(0,i);
				String s=p.substring(i,p.length());
				permutation1(f+ch+s,up.substring(1));
			}
			
		}


	//************ STRING PERMUTATION METHOD 2 *********************
	//By Summit
		public static List<String>  permutation2(String up,String p)
		{
			if (up.isEmpty()) {
				List list = new ArrayList();
				list.add(p);
				return list;
			}
			
			
			ArrayList<String> ans = new ArrayList<String>();
			for(int i=0;i<up.length();i++)
			{
				char ch = up.charAt(i);
				String f=up.substring(0,i);
				String s=up.substring(i+1);
				ans.addAll(permutation2(f+s,p+ch));
			}
			return ans;
			
		}

	public static void main(String[] args) {
		String str1 = "baccabha";
		String str2 = "abc";
		String str3 = "asif";
		String str4 = "babcdanabgabah";
		String str5 = "madam";
		String str = "abc";
		
		//skipAllA("",str);
		
		//subsequence("",str2);
		
		//StringReverse(str3, str3.length()-1);
		
		//CharOccurance(str4,0,'a');
		
		//removeDuplicates1(str5,0,"");

		//permutation1("",str);
		
		List ans = permutation2(str,"");
		System.out.println(ans);
	}

}
