package LeetCode_Quetions;

public class Q98 {
	
	//Q98 by striver
		public boolean isValidBST(Node root) {
	        return isValidBST(root, Long.MIN_VALUE,Long.MAX_VALUE);
	    }
	    public boolean isValidBST(Node root, long minVal, long maxVal){
	        if(root == null)
	            return true;
	        if(root.data >= maxVal || root.data <= minVal)
	            return false;
	        return isValidBST(root.left,minVal,root.data) && isValidBST(root.right,root.data,maxVal);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
