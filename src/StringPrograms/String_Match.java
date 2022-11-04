package StringPrograms;

class String_Match {
	public static void main(String[] args) {
		int i=0,j=0;
		String s="xabcdey";
		String x="ab*de";
		int ind=-1,count=0;
		while(i<s.length() && j<x.length()) {
			if(x.charAt(j)=='*' && x.charAt(j-1)==s.charAt(i-1) && x.charAt(j+1)==s.charAt(i+1)) {
				i++;j++;
			}
			else if(x.charAt(j)==s.charAt(i)) {
				if(count==0) {
					ind=i;
					count++;
					}
				i++;j++;
			}
			else
				i++;
		}
		
		System.out.println(ind);
	}
}