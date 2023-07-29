package Tree;

public class Q108_Convert_Sorted_Array_to_Binary_Search_Tree {
	
	public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums,0,nums.length-1);
    }

    public TreeNode createBST(int[] arr, int low,int high){
        if(low>high)
            return null;

        int mid = low + (high-low) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = createBST(arr,low,mid-1); 
        root.right = createBST(arr,mid+1,high);

        return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
