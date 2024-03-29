package LeetCode_Quetions;

public class Q226 {
	public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
