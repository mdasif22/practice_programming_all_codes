package LeetCode_Quetions;

public class Q938 {
	int sum;
    public int rangeSumBST(TreeNode root, int X, int Y) {
        if(root == null)
					return 0;
		
		if(root.val>=X && root.val<=Y) {
			rangeSumBST(root.left,X,Y);
			sum+=root.val;
			rangeSumBST(root.right,X,Y);
		}
		else if(root.val>=Y) {
			rangeSumBST(root.left,X,Y);
		}
		else {
			rangeSumBST(root.right,X,Y);
		}
    
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
