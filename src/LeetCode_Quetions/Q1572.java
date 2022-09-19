package LeetCode_Quetions;

class Q1572 {
    public int diagonalSum(int[][] mat) {
        
		
		int n = mat[0].length, j = n - 1, sum = 0;
		for(int i = 0; i < n; i++){
		if(i!=j){
		sum = sum + mat[i][i] + mat[i][j];
		}
		else{
		sum = sum + mat[i][i];
		}
		j--;
		}
		return sum;
		
    }
}
