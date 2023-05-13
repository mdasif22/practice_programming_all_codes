package LeetCode_Quetions;

import java.util.Arrays;

public class Q1710 {

public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b)-> b[1]-a[1]);
        int maxUnits=0;
        for(int[] box : boxTypes) {
        	int noOfBox=box[0];
        	int noOfUnit=box[1];
        	if(truckSize>=noOfBox) {
        		maxUnits+=noOfBox*noOfUnit;
        		truckSize-=noOfBox;
        	}
        	else {
        		maxUnits+=truckSize*noOfUnit;
        		return maxUnits;
        	}
        }
        return maxUnits;
    }

	public static void main(String[] args) {
		int[][] boxTypes = {{1,3},{2,2},{3,1}}; 
		int inttruckSize = 4;
		int ans = maximumUnits(boxTypes,inttruckSize);
		System.out.println(ans);

	}

}
