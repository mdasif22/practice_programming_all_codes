package LeetCode_Quetions;

public class Q925 {
	public static boolean isLongPressedName(String name, String typed) {
		//Wrong Answer
//        String str="";
//        int i=0,j=0;
//        while(j<typed.length()) {
//        	if(name.charAt(i)==typed.charAt(j)) {
//        		str+=typed.charAt(j);
//        		i++;
//        		j++;
//        	}
//        	else
//        		j++;
//        }
//        if(name.equals(str))
//        	return true;
//        return false;
//    }

	public static void main(String[] args) {
		String name = "saeed", typed = "ssaaedd";
		boolean ans = isLongPressedName(name,typed);
		System.out.println(ans);

	}

}
