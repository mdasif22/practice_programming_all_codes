package Tree;

import java.util.*;
import java.util.function.*;

class node1 {
	int data;
	node1 left;
	node1 right;

	public node1(int val) {
		data = val;
	}
}

public class treeQuetions {
	// display the count of nodes
	public static int countOfNodes(node1 root) {
		if (root == null) {
			return 0;
		}

		int leftCount = countOfNodes(root.left);
		int rightCount = countOfNodes(root.right);

		return leftCount + rightCount + 1;
	}

	// displays the sum of each nodes
	public static int sumOfNodes(node1 root) {
		if (root == null) {
			return 0;
		}

		int leftSum = sumOfNodes(root.left);
		int rightSum = sumOfNodes(root.right);

		return leftSum + rightSum + root.data;
	}

	public static int heightOfTree(node1 root) {
		if (root == null)
			return 0;

		int leftHeight = heightOfTree(root.left);
		int rightHeight = heightOfTree(root.right);

		int maxHeight = Math.max(leftHeight, rightHeight) + 1;

		return maxHeight;
	}
	
	//Q110 striver O(n2)
    public boolean isBalanced(node1 root) {
        if(root==null)
            return true;

        int leftH = heightOfTree(root.left);
        int rightH = heightOfTree(root.right);

        if(Math.abs(rightH-leftH)>1)
            return false;
        
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);

        if(!left || !right)
            return false;
        
        return true;
    }
    
    public boolean isBalancedOptimized(node1 root) {
        return dfsHeight(root) != -1;
    }
    
    public int dfsHeight(node1 root) {
    	if(root==null)
            return 0;

        int leftH = dfsHeight(root.left);
        if(leftH == -1)
        	return -1;
        
        int rightH = dfsHeight(root.right);
        if(rightH == -1)
        	return -1;
        
        if(Math.abs(rightH-leftH)>1)
            return -1;
        
        return Math.max(leftH, rightH)+1;
    }

	// it shows max diff(diameter) betwn 2 nodes by shradha di
	public static int diameterOfTreeBruteForce(node1 root) {
		if (root == null)
			return 0;

		int leftTreeDia = diameterOfTreeBruteForce(root.left);
		int rightTreeDia = diameterOfTreeBruteForce(root.right);

		int maxDia = heightOfTree(root.left) + heightOfTree(root.right) + 1;

		return Math.max(maxDia, Math.max(rightTreeDia, leftTreeDia));
	}

	//Q572 to check whether a subTree is a part of a Tree
	//by shradha di
	public static boolean isSubtree(node1 root, node1 subRoot) {
		if (subRoot == null)
			return true;
		if (root == null)
			return false;

		if (root.data == subRoot.data) {
			if (isIdentical(root, subRoot)) {
				return true;
			}
		}

		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	}

	//part of isSubtree
	public static boolean isIdentical(node1 root, node1 subRoot) {
		if (subRoot == null && root == null) {
			return true;
		}
		if (root == null || subRoot == null) {
			return false;
		}
		if (root.data == subRoot.data) {
			return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
		}
		return false;
	}
	
	//Q124 Hard (striver)
	public int maxPathSum(node1 root) {
        int[] maxVal = new int[1];
        maxVal[0] = Integer.MIN_VALUE;
        maxPath(root,maxVal);
        return maxVal[0];
    }
    public int maxPath(node1 root , int[] maxVal){
        if(root==null)
            return 0;
        
        int leftH = Math.max(0, maxPath(root.left,maxVal));
        int rightH = Math.max(0, maxPath(root.right,maxVal));

        maxVal[0] = Math.max(maxVal[0], leftH+rightH+root.data);
        return Math.max(rightH,leftH) + root.data;
    }
    
    //Q100(to check whether two tree r same or not) by striver
    public boolean isSameTree(node1 p, node1 q) {
        if(p==null || q==null)
            return p==q;
        
        return p.data==q.data && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
	
	// HomeWork by Shradha (My approach)
	public static int SumInKLevel(node1 node, int k) {
		if (node == null)
			return 0;
		int c = 0, sum = 0;

		Queue<node1> que = new LinkedList<>();
		que.add(node);
		que.add(null);

		while (!que.isEmpty()) {
			node1 currNode = que.remove();

			if (currNode == null) {
				// System.out.println();
				c++;
				if (que.isEmpty())
					break;
				else {
					que.add(null);
				}
			} else {
				// System.out.print(currNode.data+" ");
				if (c == k) {
					sum += currNode.data;
				}
				if (currNode.left != null)
					que.add(currNode.left);
				if (currNode.right != null)
					que.add(currNode.right);
			}
		}
		return sum;
	}
	
	//Q112
	public static boolean hasPathSum(node1 root, int targetSum) {
        /*
        //Method 1
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            if((targetSum - root.data) == 0){
                return true;
            }else{
                return false;
            }
        }
        return hasPathSum(root.left,(targetSum - root.data)) || hasPathSum(root.right,(targetSum - root.data));
    */

    //Method 2
    if(root==null)
        return false;
    int sum=0;
    return pathSum(root,targetSum,sum);
    
   }

    public static boolean pathSum(node1 root, int target, int sum){
        if(root==null)
            return false;
        if(root.left == null && root.right == null){
            sum+=root.data;
            if(sum==target)
                return true;
        }

        return pathSum(root.left,target,sum+root.data) || pathSum(root.right,target,sum+root.data);
    }
    
    //Left side view by striver
    public static List<Integer> leftSideView(node1 root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        leftSideFunc(root,ans,0);
        return ans;
    }

    public static void leftSideFunc(node1 root, ArrayList<Integer> ans, int level){
    	if(root==null)
            return;
        
        if(ans.size()==level){
            ans.add(root.data);
        }
        
        leftSideFunc(root.left,ans,level+1);
        leftSideFunc(root.right,ans,level+1);
       
    }
    
    //Q199 right side view by striver
    public static List<Integer> rightSideView(node1 root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        rightSideFunc(root,ans,0);
        return ans;
    }

    public static void rightSideFunc(node1 root, ArrayList<Integer> ans, int level){
        if(root==null)
            return;
        
        if(ans.size()==level){
            ans.add(root.data);
        }
        
        rightSideFunc(root.right,ans,level+1);
        rightSideFunc(root.left,ans,level+1);
    }
    
    //Q101 by striver
    public boolean isSymmetric(node1 root) {
        if(root==null)
            return true;
        return isSymmetricHelp(root.left,root.right);
    }

    public boolean isSymmetricHelp(node1 left, node1 right){
        if(left==null || right==null)
            return left==right;
        
        if(left.data!=right.data)
            return false;
        
        return isSymmetricHelp(left.left,right.right) && isSymmetricHelp(left.right,right.left);
    }
    
    public static ArrayList<Integer> PrintRootToNodePath(node1 root,int targetNode) {
    	ArrayList<Integer> ans = new ArrayList<>();
    	if(root == null)
    		return ans;
    	
    	RootToNodePath(root,ans,targetNode);
    	
    	return ans;
    }
    
	private static boolean RootToNodePath(node1 root, ArrayList<Integer> ans, int targetNode) {
		if(root==null)
			return false;
		
		ans.add(root.data);
		
		if(root.data == targetNode)
			return true;
		
		if( RootToNodePath(root.left,ans,targetNode) || RootToNodePath(root.right,ans,targetNode))
			return true;
		
		ans.remove(ans.size()-1);
		return false;
	}
	
	//Q1022
	static List<String> list = new ArrayList<>();
	public static int sumRootToLeaf(node1 root) {
        if(root==null)
        	return 0;
        int sum=0;
        sum(root,"");
        
        for(String s : list) {
        	sum+=Integer.parseInt(s,2);
        }
        
        return sum;
    }

	private static void sum(node1 root, String str) {
		if(root==null)
        	return;
		
		if(root.left==null && root.right==null) {
			str+=root.data;
			list.add(str);
			return;
		}
		str+=root.data;
		sum(root.left, str);
		sum(root.right, str);
		
		return;
	}
	
	//Q129
	public static int sumNumbers(node1 root) {
        if(root==null)
        	return 0;
        int sum=0;
        sumRoot(root,"");
        
        for(String s : list) {
        	sum+=Integer.parseInt(s);
        }
        
        return sum;
    }
	
	private static void sumRoot(node1 root, String str) {
		if(root==null)
        	return;
		
		if(root.left==null && root.right==null) {
			str+=root.data;
			list.add(str);
			return;
		}
		str+=root.data;
		sumRoot(root.left, str);
		sumRoot(root.right, str);
		
		return;
	}
	
	//Q226
	public node1 invertTree(node1 root) {
		if (root == null)
			return root;

		node1 temp = root.left;
		root.left = root.right;
		root.right = temp;

		invertTree(root.left);
		invertTree(root.right);

		return root;
	}
	
	//Q114 by Striver
	node1 prev = null;
    public void flatten(node1 root) {
        if(root == null)
            return;
        
        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }
    
    //Q236 by striver
    public static node1 lowestCommonAncestor(node1 root, node1 p, node1 q) {
        if(root==null || root == p || root == q){
            return root;
        }
        node1 left = lowestCommonAncestor(root.left,p,q);
        node1 right = lowestCommonAncestor(root.right,p,q);

        if(left == null)
            return right;
        else if(right == null)
            return left;
        else
            return root;
    }
	
	public static void main(String[] args) {
		node1 root = new node1(1);
		root.left = new node1(2);
		root.right = new node1(3);	
		root.left.left = new node1(4);									//			1
		root.left.left = new node1(4);									//		   /  \
		root.left.left = new node1(4);									//		  2    3
		root.left.right = new node1(5);									//	 	 / \  / \
		root.left.right.left = new node1(6);							//		4   5 7 8
		root.right.left = new node1(7);									//		   /
		root.right.right = new node1(8);								//		  6
		
		//System.out.println(countOfNodes(root)); 
		
		//System.out.println(sumOfNodes(root)); 

//		System.out.println(heightOfTree(root));
		
		//System.out.println(diameterOfTreeBruteForce(root));
		
		//System.out.println(isSubtree(root,root.left));
		
		//System.out.println(SumInKLevel(root,1));
		
		//System.out.println(hasPathSum(root,14));
		
		//System.out.println(rightSideView(root));
		
		//System.out.println(leftSideView(root));
		
		//System.out.println(PrintRootToNodePath(root,6));
		
		//System.out.println(sumRootToLeaf(root));
		
		System.out.println(sumNumbers(root));
		
	}

}




