package LeetCode_Quetions;

class Q1351 {
    public int countNegatives(int[][] grid) {
        
        int i = 0, j = 0, count = 0;
        while (i < grid.length) {// i for row & j for colunm
            if (grid[i][j] < 0) {
                count++;
                j++;
            } else {
                j++;
            }
            if (j == grid[i].length) {
            // if column range exceed increase row number
                i++;
                j = 0;
            }
        }

        return count;
        
        //My Approach
        // int count=0;
        // for(int row = 0;row<grid.length;row++){
        //     for(int col = 0;col<grid[row].length;col++){
        //     if(grid[row][col]<0)
        //         count++;
        //     }
        // }
        //  return count++;
    }
}