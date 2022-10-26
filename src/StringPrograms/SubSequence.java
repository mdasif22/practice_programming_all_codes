package StringPrograms;

//******** SUBSEQUENCE STRING ******
class SubSequence{
	
	static void subseq(String p,String up)
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return;
		}
			
		char c = up.charAt(0);
		subseq(p+c,up.substring(1));
		subseq(p,up.substring(1));
	}
	
	public static void main(String[] args) {
		subseq("","abc");
		
	}
}