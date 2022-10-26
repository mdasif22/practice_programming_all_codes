package LeetCode_Quetions;

import java.util.Arrays;

public class Q48 {
	
	public static void rotate(int[][] matrix) {
        
		//Transpose the matrix first
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<i;j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		//For reversing the element of each row 
		//Method 1
		for(int i=0;i<matrix.length;i++) {
			int left = 0;
			int right = matrix.length-1;
			while(left<right) {
				int temp = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = temp;
				left++;
				right--;
			}
		}
		
		//For reversing the element of each row 
		//Method 2
//		for(int i=0;i<matrix.length;i++) {
//			for(int j=0;j<matrix.length/2;j++) {
//				int temp = matrix[i][j];
//				matrix[i][j] = matrix[i][matrix.length-1-j];
//				matrix[i][matrix.length-1-j] = temp;
//			}
//		}
		
    }

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
