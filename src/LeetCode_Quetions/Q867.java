package LeetCode_Quetions;

class Q867 {
    public int[][] transpose(int[][] matrix) {
        
		int len=matrix.length;
		int[][] mat= new int[matrix[0].length][len];     
		
		for(int row=0;row<len;row++)
		{
			for(int col=0;col<matrix[row].length;col++)
			{
				mat[col][row] = matrix[row][col];
			}
			
		}
		return mat;
	
    
    }
}