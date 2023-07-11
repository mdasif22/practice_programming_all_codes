package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Divisor3 {

	static ArrayList<Integer> threeDivisors(ArrayList<Integer> query, int q){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < q; i++) {
			int ans = 0;
			long first_que = query.get(i);
			for (long j = 1; j <= first_que; j++) {
				int count = 0;
				// long y=j*j;
				for (int k = 1; k <= j; k++) {
					if (j % k == 0) {
						count++;
					}
				}
				if ((count) == 3) {
					ans++;
				}

			}

			list.add(ans);

		}
		
				//Someone approach
//				ArrayList<Integer> list=new ArrayList<Integer>();
//		        for(int i=0;i<q;i++){
//		            int ans=0;
//		            long d=query.get(i);
//		            for(long j=1;j*j<=d;j++){
//		                long y=j*j;
//		                int c=0;
//		                for(long z=1;z<=j;z++){
//		                if(y%z==0){
//		                    c++;
//		                }
//		               }
//		               if((2*c-1)==3){
//		                   ans++;
//		               }
//		            }
//		           list.add(ans);
//		        }
//				
//
//				return list;
		

		return list;
	    }
	

    public static void main(String[] args) {
    	int a[] = {2,2,5,50,1};
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(6);
    	//list.add(10);
    	ArrayList<Integer> ans = threeDivisors(list,1);
    	System.out.println(ans);
    	
    }

}
