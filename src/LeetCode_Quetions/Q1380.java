package LeetCode_Quetions;

import java.util.ArrayList;
import java.util.List;

public class Q1380 {
	public static List luckyNumbers(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		ArrayList ar = new ArrayList();
		int ak[] = new int[m];
		int a[] = new int[n];
		for (int i = 0; i < m; i++) // find min element in each row
		{
			int min = matrix[i][0];
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] < min)
					min = matrix[i][j];
			}
			ak[i] = min;
		}
		for (int j = 0; j < n; j++) // find max element in each column
		{
			int max = matrix[0][j];
			for (int i = 0; i < m; i++) {
				if (matrix[i][j] > max)
					max = matrix[i][j];
			}
			a[j] = max;
		}
		for (int i = 0; i < m; i++) // now comapring max element of each column with min element of each row if
									
		{
			for (int j = 0; j < n; j++) {
				if (ak[i] == a[j])
					ar.add(ak[i]);
			}
		}
		return ar;
	}

	public static void main(String[] args) {
		int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
		List res = luckyNumbers(matrix);
		System.out.println(res);
		
	}
}
