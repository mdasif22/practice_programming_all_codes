package StringPrograms;

import java.util.*;

//*************	STRING PERMUTATION *******************
//By Kunal
//class String_Permutation{
//	
//	static void permutation(String p,String up)
//	{
//		if(up.isEmpty())
//		{
//			System.out.println(p);
//			return;
//		}
//		
//		char ch = up.charAt(0);
//		for(int i=0;i<=p.length();i++)
//		{
//			
//			String f=p.substring(0,i);
//			String s=p.substring(i,p.length());
//			permutation(f+ch+s,up.substring(1));
//		}
//		
//	}
//	
//	public static void main(String[] args) {
//		String str = "abc";
//		permutation("",str);
//	}
//}

//************ STRING PERMUTATION METHOD 2 *********************
//By Sumit
class String_Permutation{
	
	static List<String>  permutation(String up,String p)
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
			ans.addAll(permutation(f+s,p+ch));
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		String str = "abc";
		List ans = permutation(str,"");
		System.out.println(ans);
	}
}