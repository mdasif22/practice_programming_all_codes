package LeetCode_Quetions;

public class Q205 {
	public static boolean isIsomorphic(String s, String t) {
        for(int i = 0; i < s.length(); i++){
        	int a = s.indexOf(s.charAt(i));
        	int b = t.indexOf(t.charAt(i));
              if(s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))){
                  return false;
              }
          }  
          return true;
    }
	
	public static void main(String[] args) {
		String s = "foo", t = "bar";
		boolean ans = isIsomorphic(s,t);
		System.out.println(ans);

	}

}
