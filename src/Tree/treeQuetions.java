package Tree;

class node1 {
	int data;
	node1 left;
	node1 right;

	public node1(int val) {
		data = val;
	}
}

public class treeQuetions {
	// display the count of nodes
	public static int countOfNodes(node1 root) {
		if (root == null) {
			return 0;
		}

		int leftCount = countOfNodes(root.left);
		int rightCount = countOfNodes(root.right);

		return leftCount + rightCount + 1;
	}

	// displays the sum of each nodes
	public static int sumOfNodes(node1 root) {
		if (root == null) {
			return 0;
		}

		int leftSum = sumOfNodes(root.left);
		int rightSum = sumOfNodes(root.right);

		return leftSum + rightSum + root.data;
	}

	public static int heightOfTree(node1 root) {
		if (root == null)
			return 0;

		int leftHeight = heightOfTree(root.left);
		int rightHeight = heightOfTree(root.right);

		int maxHeight = Math.max(leftHeight, rightHeight) + 1;

		return maxHeight;
	}

	// it shows max diff(diameter) betwn 2 nodes by shradha di
	public static int diameterOfTreeBruteForce(node1 root) {
		if (root == null)
			return 0;

		int leftTreeDia = diameterOfTreeBruteForce(root.left);
		int rightTreeDia = diameterOfTreeBruteForce(root.right);

		int maxDia = heightOfTree(root.left) + heightOfTree(root.right) + 1;

		return Math.max(maxDia, Math.max(rightTreeDia, leftTreeDia));
	}

	//Q572 to check whether a subTree is a part of a Tree
	//by shradha di
	public static boolean isSubtree(node1 root, node1 subRoot) {
		if (subRoot == null)
			return true;
		if (root == null)
			return false;

		if (root.data == subRoot.data) {
			if (isIdentical(root, subRoot)) {
				return true;
			}
		}

		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	}

	//part of isSubtree
	public static boolean isIdentical(node1 root, node1 subRoot) {
		if (subRoot == null && root == null) {
			return true;
		}
		if (root == null || subRoot == null) {
			return false;
		}
		if (root.data == subRoot.data) {
			return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
		}
		return false;
	}

	
	public static void main(String[] args) {
		node1 root = new node1(1);
		root.left = new node1(2);
		root.right = new node1(3);	
		root.left.left = new node1(4);									//			1
		root.left.left = new node1(4);									//		   /  \
		root.left.left = new node1(4);									//		  2    3
		root.left.right = new node1(5);									//	 	 / \  / \
		root.left.right.left = new node1(6);							//		4   5 7 8
		root.right.left = new node1(7);									//		   /
		root.right.right = new node1(8);								//		  6

		//System.out.println(countOfNodes(root)); 
		
		//System.out.println(sumOfNodes(root)); 

//		System.out.println(heightOfTree(root));
		
		//System.out.println(diameterOfTreeBruteForce(root));
		
		System.out.println(isSubtree(root,root.left));
		
		
	}

}




