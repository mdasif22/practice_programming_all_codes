package Tree;

import java.util.ArrayList;
import java.util.*;

class node3 {
	int data;
	node3 left;
	node3 right;

	public node3(int val) {
		data = val;
	}
}

public class leftView_bottomView {
	
	public static int findBottomLeftValue(node3 root) {
        if (root == null) {
            return 0;
        }

        Queue<node3> queue = new LinkedList<>(List.of(root));
        int bottomLeftVal = 0;

        while (!queue.isEmpty()) {
        	node3 node = queue.poll();
            bottomLeftVal = node.data;

            if (node.right != null) {
                queue.add(node.right);
            }

            if (node.left != null) {
                queue.add(node.left);
            }
        }

        return bottomLeftVal;
    }

	public static void main(String[] args) {
		node3 root = new node3(1);
		root.left = new node3(2);
		root.right = new node3(3);	
		root.left.left = new node3(4);									//			1
		root.left.left = new node3(4);									//		   /  \
		root.left.left = new node3(4);									//		  2    3
		root.left.right = new node3(5);									//	 	 / \  / \
		root.left.right.left = new node3(6);							//		4   5 7 8
		root.right.left = new node3(7);									//		   /
		root.right.right = new node3(8);								//        6	

		System.out.println(findBottomLeftValue(root));
		
	}

}
