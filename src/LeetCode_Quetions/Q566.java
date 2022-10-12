package LeetCode_Quetions;

class Q566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
         //Not My code 
        //Not Understood
        int n = mat.length, m = mat[0].length;
        if (r*c != n*m) return mat;
        int[][] ans = new int[r][c];
        for (int i=0;i<r*c;i++) 
            ans[i/c][i%c] = mat[i/m][i%m];
        return ans;
    }
}
