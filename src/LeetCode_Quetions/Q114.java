package LeetCode_Quetions;

public class Q114 {
	//Q114 by Striver
		node1 prev = null;
	    public void flatten(node1 root) {
	        if(root == null)
	            return;
	        
	        flatten(root.right);
	        flatten(root.left);

	        root.right = prev;
	        root.left = null;
	        prev = root;
	    }
}
