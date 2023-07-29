package LeetCode_Quetions;

public class Q235 {
	
	//Q235 by striver
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root == null)
            return null;
        int curr = root.data;
        if(curr < p.val && curr < q.val){
            return lowestCommonAncestor(root.right, p ,q);
        }
        if(curr > p.val && curr > q.val){
            return lowestCommonAncestor(root.left, p ,q);
        }
        return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
