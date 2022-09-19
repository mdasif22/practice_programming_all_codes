package LeetCode_Quetions;

class Q121 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        
        //Method 1
        // int len = prices.length;
        // int max = 0;
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<len;i++) {
        // 	if(prices[i] < min) {
        // 		min = prices[i];
        // 	}
        // 	else if(prices[i] - min > max) {
        // 		max = prices[i] - min;
        // 	}
        // }

        
        //Method 2 
        int min = prices[0];
        int max = 0,sub=0;
        for(int i =0;i<len;i++) {
        	if(prices[i]<min) {
        		min = prices[i];
        	}
        	sub =  prices[i]-min;
        	if(sub>max)
        		max = sub;
        }
        
        return max;
    
    
    }
}
