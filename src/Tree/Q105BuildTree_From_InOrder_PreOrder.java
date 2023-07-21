package Tree;

import java.util.*;

//Q105 by striver
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

class Q105BuildTree_From_InOrder_PreOrder {
  static TreeNode buildTree(int[] preorder, int[] inorder) {
	//Firstly, put all inorder nodes in map to process later
    Map<Integer, Integer> map = new HashMap<>();
    for(int i=0;i<inorder.length;i++) {
    	map.put(inorder[i], i);
    }
    
    //Call our method
    TreeNode root = buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);
    
    return root;
  }

  static TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map < Integer, Integer > inMap) {
   if(preStart > preEnd || inStart > inEnd)
	   return null;
   
   //create the root node (which is first node of preorder)
   TreeNode root = new TreeNode(preorder[preStart]);
   
   //find position of root in preorder (first node is root of tree of preorder)
   int inRoot = inMap.get(preorder[preStart]);
   //check how many numbers are in left from root
   int numsLeft = inRoot - inStart;
   
   //calling function for left subTree
   root.left =  buildTree(preorder, preStart + 1, preStart + numsLeft, inorder, inStart, inRoot - 1, inMap);
   //calling function for right subTree
   root.right =  buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder, inRoot + 1, inEnd, inMap);
   
   return root;
  }
  
  public static void main(String args[]) {

    int preorder[] = {10,20,40,50,30,60};
    int inorder[] = {40,20,50,10,60,30};
    TreeNode root = buildTree(preorder, inorder);
    
    
    
  }

}