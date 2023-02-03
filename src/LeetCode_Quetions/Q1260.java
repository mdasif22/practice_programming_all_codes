package LeetCode_Quetions;

import java.util.Arrays;
import java.util.List;

public class Q1260 {
	
	public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        /*
        //Optimal solution
        int m = grid.length;
        int n = grid[0].length;
        int total = m*n;
        // the following is done to make sure that you dont rotate more than total number of times.
        k = k % total;
        List<List<Integer>> list = new ArrayList<>();
        // create arraylist for each row.
        for(int i = 0; i < m; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < total; i++) {
            // the index below is used to calculate m and n position
            // for a given row, m = index/n, n = index%n
            // this is while trying to iterate the array as a 1D array
            // with index pointing to current index of the imaginary single dimension array
            int index = (total - k + i) % total;
            // i%n gives you the list bucket to which the element should be added.
            list.get(i/n).add(grid[index/n][index%n]);
            
        }
        return list;
        */

		//Brute force
        int n = grid.length, m = grid[0].length;
        int[][] temp = grid;
        
        while (k-- > 0) {
            // init for each loop
            temp = new int[n][m];
            
            // 1. shift right
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    temp[i][j] = grid[i][j - 1];
                }
            }
            
            // 2. move last one in this row to the next row
            for (int i = 1; i < n; i++) {
                temp[i][0] = grid[i - 1][m - 1];
            }
            
            // 3. move the last one to the first place
            temp[0][0] = grid[n - 1][m - 1];
            
            // repeat
            grid = temp;
        }
        
        return (List)Arrays.asList(temp);
    }

	public static void main(String[] args) {
		int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
		int k = 1;
		List<List<Integer>> ans = shiftGrid(grid,k);
		System.out.println(ans);
	}
}