package LeetCode_Quetions;

public class Q285 {
	
	//Q285 by striver
    public static Node inOrderSuccessor(Node root, int key) {
    	Node succ = null;
    	while(root!=null) {
    		if(root.data<=key)
    			root = root.right;
    		else {
    			succ = root;
    			root = root.left;
    		}
    	}
    	return succ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
