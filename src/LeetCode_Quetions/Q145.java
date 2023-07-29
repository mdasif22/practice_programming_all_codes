package LeetCode_Quetions;

public class Q145 {
	//Its a recursive apprch
    //Now try to do iterative apprch
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)
            return list;
        
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
    
        return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
