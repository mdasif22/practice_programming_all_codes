package Practice;

import java.util.*;

class rough {
	public static void removeDuplicates(String str)   
    {   
        String newstr = new String();   
        int length = str.length();   
        for (int i = 0; i < length; i++)    
        {   
            char charAtPosition = str.charAt(i);   
                
            if (newstr.indexOf(charAtPosition) < 0)   
            {   
                newstr += charAtPosition;   
            }   
        }   
        System.out.println(newstr);  
    } 

    public static void main(String[] args) {
    	
    }
}