package LeetCode_Quetions;

class Q832 {
    public int[][] flipAndInvertImage(int[][] image) {
        
       
       
       int n = image.length;
       int[][] flip = new int[n][n]; 
       for(int row=0;row<image.length;row++)
       {
    	   for(int column=0;column<image[row].length;column++)
           {
        	  flip[row][column] = image[row][n-column-1];
           }
       }
	
       for(int row=0;row<image.length;row++)
       {
    	   for(int column=0;column<image[row].length;column++)
           {
        	  if(flip[row][column] == 0)
        	  {
        		  flip[row][column] = 1;
        	  }
        	  else
        		  flip[row][column] = 0;
           }
       }
       
       return flip;
    
    }
}