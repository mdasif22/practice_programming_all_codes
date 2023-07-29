package Tree;

import java.util.*;

public class Q897_Convert_BST_Into_Right_SkewedTree {
	
	ArrayList<Integer> list = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        TreeNode newRoot = new TreeNode(0);
        TreeNode target = newRoot;
        inOrder(root);

        for(Integer item : list){
            newRoot.right = new TreeNode(item);
            newRoot.left = null;
            newRoot = newRoot.right;
        }
        return target.right;
    }
    public void inOrder(TreeNode root){
        if(root==null)
            return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
