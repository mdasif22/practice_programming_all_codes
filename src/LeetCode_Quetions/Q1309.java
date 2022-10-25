package LeetCode_Quetions;

public class Q1309 {

	public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
       
        //we can add 96 to each value according to standard ascii encoding 
        int i =0;
        while(i<s.length()){
            if((i+2)<s.length() && s.charAt(i+2) == '#'){
                //we will pickup these two chars before the #
                
                String newS = s.substring(i,i+2);
                int newSAsInt = Integer.parseInt(newS);//converting the string to integer
                //now we have the number we want to convert to string 
                
                char charToBeAdded = (char)(newSAsInt +96);//adding 96 as mentioned
                
                sb.append(charToBeAdded);
                i+=3;
            }
            
            else{
                char currentChar = s.charAt(i);
                int currentCharAsInt = currentChar - '0';
                
                char charToBeAdded = (char)(currentCharAsInt+96);
                sb.append(charToBeAdded);
                
                i++;
                
            }
        }
        
        return sb.toString();
    }
	
	public static void main(String[] args) {
		String s = "10#11#12";
		String ans = freqAlphabets(s);
		System.out.println(ans);
	}

}
