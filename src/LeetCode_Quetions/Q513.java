package LeetCode_Quetions;

public class Q513 {
	public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>(List.of(root));
        int bottomLeftVal = 0;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            bottomLeftVal = node.val;

            if (node.right != null) {
                queue.add(node.right);
            }

            if (node.left != null) {
                queue.add(node.left);
            }
        }

        return bottomLeftVal;
    }
}
