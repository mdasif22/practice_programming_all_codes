package LeetCode_Quetions;

public class Q240 {
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
        return false;

        int n=matrix.length,m=matrix[0].length;
        int i=0,j=m-1;
        while(i<n && j>=0){
        	int num = matrix[i][j];
            if(num==target){
                return true;
            }
            if(num>target){
                j--;
            }
            else
            i++;
        }
        return false;
    }

	public static void main(String[] args) {
		int[][] matrix = {{1,4,7,11,15},
						 {2,5,8,12,19},
						 {3,6,9,16,22},
						 {10,13,14,17,24},
						 {18,21,23,26,30}};
		int target=20;
		boolean ans = searchMatrix(matrix,target);
		System.out.println(ans);
	}

}
