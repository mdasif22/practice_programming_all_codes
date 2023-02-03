package LeetCode_Quetions;

import java.util.Arrays;

public class Q1475 {

	public static int[] finalPrices(int[] prices) {
		int[] ans = new int[prices.length];
        for(int i=0;i<prices.length-1;i++) {
        	
        		ans[i]=prices[i]-smaller(prices,i+1,prices[i]);

        }
        ans[prices.length-1]=prices[prices.length-1];
        return ans;
    }
	
	public static int smaller(int[] prices, int current,int ele) {
		int min=0;
		for(int i=current;i<prices.length;i++) {
			if(prices[i]<=ele) {
				min=prices[i];
				break;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] prices = {10,1,1,6};
		int[] ans=finalPrices(prices);
		System.out.println(Arrays.toString(ans));
	}

}
