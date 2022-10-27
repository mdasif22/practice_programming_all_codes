package LeetCode_Quetions;

import java.util.*;

public class Q54 {
	//Spiral Matrix 1
	public static  List<Integer> spiralOrder(int[][] matrix) {
		//WE have to move in 4 directions left-right, right-bottom,bottom-left,left-top
        List<Integer> list = new ArrayList<>();
        int row = matrix.length;
        if(row==0)
        	return list;
        int col = matrix[0].length;
        
        
        int l=0,r=col-1,t=0,b=row-1,direction=0;
        
        while(l<=r && t<=b) {
        	if(direction == 0) {
        		for(int i=l;i<=r;i++) {
        			list.add(matrix[t][i]);
        		}
        		direction=1;
        		t++;
        	}
        	else if(direction == 1) {
        		for(int i=t;i<=b;i++) {
        			list.add(matrix[i][r]);
        		}
        		direction=2;
        		r--;
        	}
        	else if(direction == 2) {
        		for(int i=r;i>=l;i--) {
        			list.add(matrix[b][i]);
        		}
        		direction=3;
        		b--;
        	}
        	else if(direction == 3) {
        		for(int i=b;i>=t;i--) {
        			list.add(matrix[i][l]);
        		}
        		direction=0;
        		l++;
        	}
        }
        return list;
        
    }

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		List ans = spiralOrder(matrix);
		System.out.println(ans);
	}

}
