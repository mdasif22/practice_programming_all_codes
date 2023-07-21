package Tree;

import java.util.*;

//Q106 by striver
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int val) {
    this.val = val;
    left = null;
    right = null;
  }
}

class Q106_BuildTree_From_PostOrder_InOrder {
  static TreeNode buildTree(int[] postorder, int[] inorder) {
	//Firstly, put all inorder nodes in map to process later
    Map<Integer, Integer> map = new HashMap<>();
    for(int i=0;i<inorder.length;i++) {
    	map.put(inorder[i], i);
    }
    
    //Call our method
    TreeNode root = buildTreePostIn(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1, map);
    
    return root;
  }

  static TreeNode buildTreePostIn(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd, Map < Integer, Integer > inMap) {
	   if(postStart > postEnd || inStart > inEnd)
		   return null;
	   
	   //create the root node (which is last node of postorder)
	   TreeNode root = new TreeNode(postorder[postEnd]);
	   
	   //find position of root in preorder (last node is root of tree of postorder)
	   int inRoot = inMap.get(postorder[postEnd]);
	   //check how many numbers are in left from root
	   int numsLeft = inRoot - inStart;
	   
	   //calling function for left subTree
	   root.left =  buildTreePostIn(postorder, postStart, postStart + numsLeft - 1 , inorder, inStart, inRoot - 1, inMap);
	   //calling function for right subTree
	   root.right =  buildTreePostIn(postorder, postStart + numsLeft, postEnd-1, inorder, inRoot + 1, inEnd, inMap);
	   
	   return root;
	  }
  
  public static void main(String args[]) {

    int postorder[] = {10,20,40,50,30,60};
    int inorder[] = {40,20,50,10,60,30};
    TreeNode root = buildTree(postorder, inorder);
    
    
    
  }

}