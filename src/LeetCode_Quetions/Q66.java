package LeetCode_Quetions;

class Q66 {
    public int[] plusOne(int[] digits) {
        
			int index = digits.length-1;
			
			while(index>=0)
			{
				if(digits[index]!=9)
	        	{
	        		digits[index] = digits[index]+1;
	        		return digits;
	        	}
				
				digits[index] = 0;
				index--;
			}
			
			int[] result = new int[digits.length+1];
			result[0] = 1;
			return result;
        
    }
}