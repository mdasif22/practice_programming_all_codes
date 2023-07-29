package Tree;

public class Q530_Min_Absolute_Diff_In_BST {
	int minDiff;
    Integer prev;
    public int getMinimumDifference(TreeNode root) {
        if(root == null)
            return 0;
        prev = null;    
        minDiff = Integer.MAX_VALUE;
        inOrder(root);

        return minDiff;
    }

    public void inOrder(TreeNode root){
        if(root==null)
            return;
        //left call
        inOrder(root.left);

        //If prev is null
        if(prev != null){
            minDiff = Math.min(minDiff , root.val - prev);
        }
        //assign root as prev
        prev = root.val;

        //right call
        inOrder(root.right);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
