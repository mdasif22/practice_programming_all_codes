package LeetCode_Quetions;

public class Q1528 {
	public static String restoreString(String s, int[] indices) {
		char[] shuffle = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            shuffle[indices[i]]= s.charAt(i);
        }
//        String str = "";
//        for(int i=0;i<shuffle.length;i++) {
//        	str+=shuffle[i];
//        }
//        return str;
        
        return new String(shuffle);
    }
	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		String ans = restoreString(s,indices);
		System.out.println(ans);
	}

}
