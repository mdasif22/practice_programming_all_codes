package LeetCode_Quetions;

public class Q110 {
	public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;

        int leftH = height(root.left);
        int rightH = height(root.right);

        if(Math.abs(rightH-leftH)>1)
            return false;
        
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);

        if(!left || !right)
            return false;
        
        return true;
    }

    public int height(TreeNode root){
        if(root==null)
            return 0;
        
        int leftH = height(root.left);
        int rightH = height(root.right);

        return Math.max(leftH,rightH)+1;
    }
}
