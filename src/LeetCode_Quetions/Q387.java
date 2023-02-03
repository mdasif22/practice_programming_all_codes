package LeetCode_Quetions;

public class Q387 {

	 public static int firstUniqChar(String s) {
	        //Solution 1
	        for(int i=0;i<s.length();i++){
	            char letter=s.charAt(i);

	            //if first index value is same to the last index value
	            if(s.indexOf(letter)==s.lastIndexOf(letter)){
	                return i;
	            }
	        }

	        //else return -1
	        return -1;

	        //Solution 2
	        /*
	        HashMap<Character,Integer> map = new HashMap<>();//Creating a hashmap which will take every character and note its occurrence.
	        for(int i = 0 ; i < s.length() ; i++){
	            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
	        }
	        for(int i = 0 ; i < s.length() ; i++){
	            if(map.get(s.charAt(i))==1) return i;//If the occurrence of any char is once, then it is the required ans
	        }
	        return -1;//else returning -1
	        */
	        
	    }
	
	public static void main(String[] args) {
		String s = "leetcode";
		int ans = firstUniqChar(s);
    	System.out.println(ans);
	}

}
