package LeetCode_Quetions;
import java.util.ArrayList;

public class Q230 {
	//Q230 by striver
		public static int kthSmallestORMaximum(Node root, int k) {
	        if(root==null)
	            return 0;
	        ArrayList<Integer> list = new ArrayList<>();
	        inOrder(root,list);
	        
	        //to return Kth maximum value  
	        //return list.get(list.size()- k);
	        
	        //to return Kth minimum value
	        return list.get(k-1);
	    }

	    public static void inOrder(Node root, ArrayList<Integer> list){
	        if(root==null)
	            return;
	        inOrder(root.left,list);
	        list.add(root.data);
	        inOrder(root.right,list);
	    }
}
