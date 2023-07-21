package LeetCode_Quetions;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Q1022 {
    List<String> list = new ArrayList<>();
	public int sumRootToLeaf(TreeNode root) {
        if(root==null)
        	return 0;
        int sum=0;
        sum(root,"");
        
        for(String s : list) {
        	sum+=Integer.parseInt(s,2);
        }

        return sum;
    }

	private void sum(TreeNode root, String str) {
		if(root==null)
        	return;
		
		if(root.left==null && root.right==null) {
			str+=root.val;
			list.add(str);
			return;
		}
		str+=root.val;
		sum(root.left, str);
		sum(root.right, str);
		
		return;
	}
}
