package Sliding_Window;

import java.util.Arrays;

class First_negative_integer_in_every_window_of_size_k {
	
	public static long[] printFirstNegativeInteger(long A[], int N, int K)
    {
		//Method 1 (Brute Force)
        long[] result = new long[N-K+1];

        for(int i=0; i < N-K+1 ; i++)
        {
            for(int j=0 ; j < K; j++)
            {
                if(A[i+j] < 0)
                {
                    result[i] = A[i+j];
                    break;
                }
            }
        }
        return result;
		
		//Method 2 (Brute Force)
//		long[] B=new long[N-K+1];
//	       for(int i=0;i<N-K+1;i++){
//	           for(int j=i;j<K+i;j++){
//	               if(A[j]<0){
//	                   B[i]=A[j];
//	                   break;
//	               }else{
//	                   continue;
//	               }
//	           }
//	           
//	       } 
//	       return B;
    }

	
	public static void main(String[] args) {
		int N = 5, K = 2;
		long A[] = {12, -1, -7, 8, -15, 30, 16, 28};
		long[] ans = printFirstNegativeInteger(A,N,K);
		System.out.println(Arrays.toString(ans));
	}
}