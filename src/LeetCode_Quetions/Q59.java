package LeetCode_Quetions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q59 {
	//Spiral Matrix 2
	public static int[][] generateMatrix(int n) {
        int l = 0,r=n-1,t=0,b=n-1,d=0;
        int[][] matrix = new int[n][n];
        int num=1;
        while(l<=r && t<=b) {
        	if(d==0) {
        		for(int i=l;i<=r;i++) {
        			matrix[t][i]=num;
        			num++;
        		}
        		d=1;
        		t++;
        	}
        	else if(d==1) {
        		for(int i=t;i<=b;i++) {
        			matrix[i][r]=num;
        			num++;
        		}
        		d=2;
        		r--;
        	}
        	else if(d==2) {
        		for(int i=r;i>=l;i--) {
        			matrix[b][i]=num;
        			num++;
        		}
        		d=3;
        		b--;
        	}
        	else if(d==3) {
        		for(int i=b;i>=t;i--) {
        			matrix[i][l]=num;
        			num++;
        		}
        		d=0;
        		l++;
        	}
        }
        return matrix;
    }

	public static void main(String[] args) {
		int n = 3;
		int[][] ans = generateMatrix(n);
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i]);
			}
			System.out.println();
		}
	}
}
