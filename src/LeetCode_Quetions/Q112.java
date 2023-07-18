package LeetCode_Quetions;

public class Q112 {
	public boolean hasPathSum(TreeNode root, int targetSum) {
        /*
        //Method 1
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            if((targetSum - root.val) == 0){
                return true;
            }else{
                return false;
            }
        }
        return hasPathSum(root.left,(targetSum - root.val)) || hasPathSum(root.right,(targetSum - root.val));
    */

    //Method 2
    if(root==null)
        return false;
    int sum=0;
    return pathSum(root,targetSum,sum);
    }

    public boolean pathSum(TreeNode root, int target, int sum){
        if(root==null)
            return false;
        if(root.left == null && root.right == null){
            sum+=root.val;
            if(sum==target)
                return true;
        }

        return pathSum(root.left,target,sum+root.val) || pathSum(root.right,target,sum+root.val);
    }
}
