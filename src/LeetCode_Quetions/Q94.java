package LeetCode_Quetions;

public class Q94 {
	public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null)
            return ans;
        InOrder(root,ans);
        return ans;
    }

    public void InOrder(TreeNode node,ArrayList<Integer> ans) {
		if (node == null)
			return;

		InOrder(node.left,ans);
		ans.add(node.val);
		InOrder(node.right,ans);
	}
}
