package StringPrograms;

public class String_Rotate {

	public static boolean rotateString(String s, String goal) {
		 int i=0;

         while(i<s.length()){
             if(s.equals(goal)) 
            	 return true;
             else{
                 String ch = s.charAt(0)+"";
                 s = s.substring(1,s.length())+ch;
             }
             i++;  
         }
         return false;
    }
	public static void main(String[] args) {
		String s = "abcde", goal = "cdeab";
		boolean ans = rotateString(s,goal);
		System.out.println(ans);
	}

}
