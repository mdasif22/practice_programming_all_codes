package LeetCode_Quetions;

import java.util.Arrays;

public class Q1491 {
	public static double average(int[] salary) {
        double min=salary[0];
        double max = salary[0];
        int count=0;
        for(int i=0;i<salary.length;i++) {
        	if(salary[i]>max) {
        		max = salary[i];
        		
        		}
        	else if(salary[i]<min)
        		min = salary[i];
        }
        
        double sum = 0.0;
        for(int i=0;i<salary.length;i++) {
        	if(salary[i] == min || salary[i] == max) {
        		continue;
        	}
        	else {
        		sum+=salary[i];
        		count++;
        	}
        }
        return sum/count;
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] nums = {4000,3000,1000,2000};
		double ans = average(nums);
		System.out.println(ans);
	}
}
