package LeetCode_Quetions;

public class Q104 {
	public int maxDepth(TreeNode root) {
        if (root == null)
			return 0;

		int leftHeight = maxDepth(root.left);
		int rightHeight = maxDepth(root.right);

		int maxHeight = Math.max(leftHeight, rightHeight) + 1;

		return maxHeight;
    }
}
