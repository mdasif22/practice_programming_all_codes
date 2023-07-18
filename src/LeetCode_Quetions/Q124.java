package LeetCode_Quetions;

public class Q124 {
	public int maxPathSum(TreeNode root) {
        int[] maxVal = new int[1];
        maxVal[0] = Integer.MIN_VALUE;
        maxPath(root,maxVal);
        return maxVal[0];
    }
    public int maxPath(TreeNode root , int[] maxVal){
        if(root==null)
            return 0;
        
        int leftH = Math.max(0, maxPath(root.left,maxVal));
        int rightH = Math.max(0, maxPath(root.right,maxVal));

        maxVal[0] = Math.max(maxVal[0], leftH+rightH+root.val);
        return Math.max(rightH,leftH) + root.val;
    }
}
