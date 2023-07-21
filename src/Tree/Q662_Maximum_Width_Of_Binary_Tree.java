package Tree;

import java.util.*;

//Solution - https://leetcode.com/problems/maximum-width-of-binary-tree/solutions/3436593/image-explanation-why-long-to-int-c-java-python/
public class Q662_Maximum_Width_Of_Binary_Tree {
	static class Pair {
		int line; // hd = horizontal_distance(in line)
		node1 node;

		Pair(node1 node, int line) {
			this.node = node;
			this.line = line;
		}
	}
	
	public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(root, 0));
        int maxWidth = 0;
        
        while (!queue.isEmpty()) {
            int levelLength = queue.size();
            int levelStart = queue.peek().getValue();
            int index = 0;
            
            for (int i = 0; i < levelLength; i++) {
                Pair<TreeNode, Integer> pair = queue.poll();
                TreeNode node = pair.getKey();
                index = pair.getValue();
                
                if (node.left != null) {
                    queue.add(new Pair<>(node.left, 2*index));
                }
                
                if (node.right != null) {
                    queue.add(new Pair<>(node.right, 2*index+1));
                }
            }
            
            maxWidth = Math.max(maxWidth, index - levelStart + 1);
        }
        
        return maxWidth;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
