package Tree;

//Q404  sum of all left leaf nodes
public class Q404_sumOfLeftLeaf {
	int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        //Method 1
        /*
        if (root==null){
            return 0;
        }
        // -For Leaf Node
        if (root.left!=null&& root.left.left==null && root.left.right==null){
            // - This way only left leaf data will be added
            sum+=root.left.val;
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return sum;
        */

        //Method 2
        if(root == null)
            return 0;
        
        //for left tree
        sumLeft(root.left, true);
        //for right tree
        sumLeft(root.right, false);
        return sum;
    }

    public void sumLeft(TreeNode root , boolean flag){
        if(root == null)
            return;

        //if its left tree and leaf node
        if(flag && root.left==null && root.right==null){
            sum+=root.val;
        }

        //for left tree
        sumLeft(root.left, true);
        //for right tree
        sumLeft(root.right, false);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
