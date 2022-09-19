package ArrayPrograms;

public class Max_Profit {
	
	public static int maxProfit(int[] prices) {
        int len = prices.length;
        
        //Method 1
        int min = prices[0];
        int max = 0,sub=0;
        for(int i =0;i<len;i++) {
        	if(prices[i]<min) {
        		min = prices[i];
        	}
        	sub =  prices[i]-min;
        	if(sub<0)
        		sub=0;
        	if(sub>max)
        		max = sub;
        }
        
        
        //Method 2
//        int max = 0;
//        int min=Integer.MAX_VALUE;
//        for(int i=0;i<len;i++) {
//        	if(prices[i] < min) {
//        		min = prices[i];
//        	}
//        	else if(prices[i] - min > max) {
//        		max = prices[i] - min;
//        	}
//        }
//        
        return max;
    }
	
	public static void main(String[] args) {
		int[] num = {2,4,1}; // 2 4 1
		int ans = maxProfit(num);
		System.out.println(ans);
	}
}