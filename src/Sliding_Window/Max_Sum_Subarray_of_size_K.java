package Sliding_Window;

import java.util.ArrayList;

public class Max_Sum_Subarray_of_size_K {
	
	static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        int i=0,j=0;
        long sum = 0;
        long max=Integer.MIN_VALUE;
        
//        while(j<N){
//            sum+=Arr.get(j);
//            if(j-i+1 < K) {
//            	j++;
//            }
//            else if(j-i+1 == K) {
//            	max=Math.max(max, sum);
//            	sum-=Arr.get(i);
//            	i++;j++;
//            }
//        }
        
        while(j<N){
            sum+=Arr.get(j);
            if(j-i+1==K){
                max=Math.max(max,sum);
                    sum-=Arr.get(i++);
                }
                j++;
        }
        
        return max;
    }

	public static void main(String[] args) {
		int N = 4, K = 2;
		ArrayList<Integer> Arr =new ArrayList();
		Arr.add(100);
		Arr.add(200);
		Arr.add(300);
		Arr.add(400);
		Long ans = maximumSumSubarray(K,Arr,N);
		System.out.println(ans);
	}

}
