package LeetCode_Quetions;

public class Q99 {
	
	TreeNode prev,first,mid,last;
	public  void recoverTree(TreeNode root) {
        /* Optional
				first=mid=last=null;
				prev = new TreeNode(Integer.MIN_VALUE);
				*/
        inOrderForRecoverTree(root);
        if(first!=null && last!=null) {
        	int temp = first.val;
        	first.val = last.val;
        	last.val = temp;
        }
        else if(first!=null && mid!=null) {
        	int temp = first.val;
        	first.val = mid.val;
        	mid.val = temp;
        }  
    }
	
	private  void inOrderForRecoverTree(TreeNode root) {
		if(root==null)
        	return;
		
		inOrderForRecoverTree(root.left);
		if(prev!=null &&(root.val < prev.val)) {
			if(first==null) {
				first = prev;
				mid = root;
			}
			else {
				last = root;
			}
		}
		prev = root;
		inOrderForRecoverTree(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
