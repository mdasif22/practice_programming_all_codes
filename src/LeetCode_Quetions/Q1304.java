package LeetCode_Quetions;

class Q1304 {
    public int[] sumZero(int n) {
        
        
		int[] temp = new int[n];
		
		if(n%2==0)
		{
			for(int i=0;i<n-1;i=i+2)
			{
				temp[i] = i+1;
				temp[i+1] = -(i+1);
			}
		}
		else {
			for(int i=0;i<n-1;i=i+2)
			{
				temp[i] = i+1;
				temp[i+1] = -(i+1);
			}
			temp[temp.length-1] = 0;
		}
		
		return temp;
    
    }
}
