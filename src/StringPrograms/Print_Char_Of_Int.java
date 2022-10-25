package StringPrograms;

public class Print_Char_Of_Int {
	public String convertToTitle(int columnNumber) {
        
        String result = "";
        int n = columnNumber;
        while(n>0){
            char c = (char) ('A' + (n-1)%26);
            result = c+result;
            n=(n-1)/26;
        }
        
        return result;
    
    }
}
