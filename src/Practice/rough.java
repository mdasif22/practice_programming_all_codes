package Practice;

import java.util.*;
import java.lang.*;
import java.io.*;

class rough
{	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		   
		    	if(y%x==0) {
		    		System.out.println("YES");
		    		break;
		    	}
		    	else
		    		System.out.println("NO");
		    		
		}
	}
		
}