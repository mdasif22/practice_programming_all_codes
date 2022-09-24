package LeetCode_Quetions;

public class Q74 {

public static boolean searchMatrix(int[][] mat, int target) {
        
        //Method 1 Binary search
        int rows = mat.length; 
        int cols = mat[0].length;
        int start = 0;
        int end = (rows*cols)-1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mat[mid/cols][mid%cols] == target) return true;
            else if(mat[mid/cols][mid%cols] > target) end = mid-1;
            else start = mid+1;
        }
        return false;
        
        //Method 2 Brute force 
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[i].length;j++){
        //         if(matrix[i][j]==target)
        //             return true;
        //     }
        // }
        //  return false;
    }
	
	public static void main(String[] args) {
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 11;
		boolean ans = searchMatrix(matrix,target);
		System.out.println(ans);

	}

}
