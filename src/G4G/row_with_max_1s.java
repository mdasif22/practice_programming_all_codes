package G4G;

public class row_with_max_1s {
	
	static int rowWithMax1s(int arr[][], int n, int m) {
       int max=0,count=0,index=-1;
       for(int i=0;i<n;i++) {
    	   count=0;
    	   
    	   for(int j=0;j<m;j++) {
    		   if(arr[i][j]==1) {
    			   count++;  
    		   }
    	   }
    	   if(count > max) {
    		   max=count;
    		   index=i;
    	   }

       }
       return index;
    }

	public static void main(String[] args) {
		int[][] arr = {{0, 1, 1, 1},
				           {0, 0, 1, 1},
				           {1, 1, 1, 1},
				           {0, 0, 0, 0}};
		int N = 4 , M = 4;
		int ans = rowWithMax1s(arr,N,M);
		System.out.println(ans);
	}

}
