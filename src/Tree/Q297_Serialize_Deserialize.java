package Tree;

import java.util.*;

//Striver
public class Q297_Serialize_Deserialize {
	Queue<TreeNode> que = new LinkedList<>();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) 
    		return "";
    	
        StringBuilder st = new StringBuilder();
        que.add(root);
        while(!que.isEmpty()) {
        	TreeNode curr = que.poll();
        	if(curr==null) {
        		st.append("n ");
        		continue;
        	}
        	st.append(curr.val + " ");
        	que.add(curr.left);
        	que.add(curr.right);
        }
        
        return st.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == "") 
    		return null;
    	String[] str = data.split(" ");
    	TreeNode root = new TreeNode(Integer.parseInt(str[0]));
    	que.add(root);
    	
    	for(int i=1;i<str.length;i++) {
				TreeNode parent = que.poll();
    		if(!str[i].equals("n")) {
    			TreeNode left = new TreeNode(Integer.parseInt(str[i]));
    			parent.left = left;
    			que.add(left);
    		}
    		if(!str[++i].equals("n")) {
    			TreeNode right = new TreeNode(Integer.parseInt(str[i]));
    			parent.right = right;
    			que.add(right);
    		}
    	}
    	
    	return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
