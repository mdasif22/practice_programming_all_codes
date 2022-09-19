package LinkedList;
import java.util.*;
public class Rough {
	
	public static boolean canJump(int[] nums) 
	{
		int reachable = 0;
	    for(int i=0;i<nums.length;i++){
	        if(reachable<i)
	            return false;
	        reachable = Integer.max(reachable, i+nums[i]);
	        
	    }
	    return true;
    }    
		
	public static void main(String[] args) {
		int[] matrix = 	{0,1,1};	//{1,2,3,4};
		boolean ans = canJump(matrix);
		System.out.println(ans);
		
	}
}
