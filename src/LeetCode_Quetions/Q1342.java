package LeetCode_Quetions;

class Q1342 {
    public int numberOfSteps(int num) {
        
        int count = 0;
        int temp = num;
        for(int i =0;i<temp;i++)
        {
        	if(num==0)
        		break;
        	
        	if(num%2==0)
            {
            	num = num /2;
            	count++;
            }
            else {
            	num = num-1;
            	count++;
    		}
        }
        
		return count;
    
    }
}