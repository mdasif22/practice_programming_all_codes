package LeetCode_Quetions;

public class Q700 {
	public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && val != root.val){
            root = val < root.val? root.left : root.right;
        }
        return root;
    }
}
