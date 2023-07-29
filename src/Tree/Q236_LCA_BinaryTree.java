package Tree;

public class Q236_LCA_BinaryTree {
	
	//Method 1 Optimized Apprch
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left == null)
            return right;
        else if(right == null)
            return left;
        else
            return root;
    }

    //Method 2 Not Optimized Apprch
    /*
    public static boolean getPath(TreeNode root, TreeNode n, ArrayList<TreeNode> list){
        if(root == null){
            return false;
        }

        list.add(root);

        if(root.val == n.val){
            return true;
        }
        boolean foundLeft = getPath(root.left,n,list);
        boolean foundRight = getPath(root.right,n,list);

        if(foundLeft || foundRight){
            return true;

        }
        list.remove(list.size()-1);
        return false;
       }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();

        getPath(root, p, path1);
        getPath(root, q,path2);

        //lca
           int i=0;
           for(; i<path1.size() && i<path2.size();i++){
               if(path1.get(i) != path2.get(i)){
                   break;
               }
           }
           TreeNode lca = path1.get(i-1);
           return lca;
    }
    */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
