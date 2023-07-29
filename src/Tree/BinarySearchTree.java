package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//By Shradha di
public class BinarySearchTree {
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
		}
	}

	// Shradha
	public static Node insert(Node root, int val) {
		//if root is null then create first value as root
		if(root == null) {
			root = new Node(val);
			return root;
		}
		//if value is less than root then GO to left tree
		if(root.data > val) {
			root.left = insert(root.left , val);
		}
		//if value is greater than root then GO to right tree
		else {
			root.right = insert(root.right, val);
		}
		
		return root;
	}
	
		// Striver
		public static Node insertIterative(Node root, int val) {
			//if root is null then create first value as root
			if(root == null) {
				root = new Node(val);
				return root;
			}
			
			Node curr = root;
			while(true) {
				if(curr.data <= val) {
					if(curr.right!=null) {
						curr = curr.right;
					}
					else {
						curr.right = new Node(val);
						break;
					}
				}
				else {
					if(curr.left!=null) {
						curr = curr.left;
					}
					else {
						curr.left = new Node(val);
						break;
					}
				}
			}
			
			return root;
		}
	
	// Shradha
	public static boolean search(Node root, int target) {
		if(root == null)
			return false;
		
		if(root.data > target) {
			return search(root.left, target);
		}
		else if(root.data == target) {
			return true;
		}
		else {
			return search(root.right, target);
		}
	}

	//Q700 by striver
	public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && val != root.val){
            root = val < root.val? root.left : root.right;
        }
        return root;
    }
	
	//Q450 by Shradha di
	public static Node delete(Node root, int target) {
		if(root == null)
			return null;
		
		if(root.data > target)
			root.left = delete(root.left, target);
		else if(root.data < target)
			root.right = delete(root.right, target);
		else {
			//case 1 : its a leaf node
			if(root.left == null && root.right==null)
				return null;
			
			//case 2 : only 1 child is there either left or right
			if(root.left == null)
				return root.right;
			else if(root.right==null)
				return root.left;
			
			//case 3 : there are 2 children on that node
			Node inOrderSuc = inOrderSuccessor(root.right);
			root.data = inOrderSuc.data;
			root.right = delete(root.right,inOrderSuc.data);
		}
		return root;
	}
	
	public static Node inOrderSuccessor(Node root) {
		while(root.left!=null) {
			root = root.left;
		}
		return root;
	}
	
	//Striver
	public static int findCeil(Node root, int target) {
		int ceil = -1;
		while(root != null) {
			if(root.data == target) {
				ceil = root.data;
				return ceil;
			}
			
			if(target > root.data)
				root = root.right;
			else {
				ceil = root.data;
				root = root.left;
			}
		}
		return ceil;
	}
	
	//Striver
	public static int findFloor(Node root, int target) {
		int floor = -1;
		while (root != null) {
			if (root.data == target) {
				floor = root.data;
				return floor;
			}

			if (target > root.data) {
				floor = root.data;
				root = root.right;
			}
			else {
				root = root.left;
			}
		}
		return floor;
	}
	
	//Q938 by Shradha di
	public static void PrintInRange(Node root, int X, int Y) {
		if(root == null)
			return;
		
		if(root.data>=X && root.data<=Y) {
			PrintInRange(root.left,X,Y);
			System.out.print(root.data + " ");
			PrintInRange(root.right,X,Y);
		}
		else if(root.data>=Y) {
			PrintInRange(root.left,X,Y);
		}
		else {
			PrintInRange(root.right,X,Y);
		}
	}
	
	//Shradha
	public static void printRoot2LeafPath(Node root, ArrayList<Integer> path) {
		if(root == null)
			return;
		
		path.add(root.data);
		//check leaf node
		if(root.left == null && root.right == null) {
			printPath(path);
		}
		else { //non-leaf node
			printRoot2LeafPath(root.left,path);
			printRoot2LeafPath(root.right,path);
		}
		path.remove(path.size()-1);
	}
	
	private static void printPath(ArrayList<Integer> path) {
		for(int i=0;i<path.size();i++) {
			System.out.print(path.get(i)+" -> ");
		}
		System.out.println();
	}
	
	//Q230 by striver
	public static int kthSmallestORMaximum(Node root, int k) {
        if(root==null)
            return 0;
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root,list);
        
        //to return Kth maximum value  
        //return list.get(list.size()- k);
        
        //to return Kth minimum value
        return list.get(k-1);
    }
	
	//Q98 by striver
	public boolean isValidBST(Node root) {
        return isValidBST(root, Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValidBST(Node root, long minVal, long maxVal){
        if(root == null)
            return true;
        if(root.data >= maxVal || root.data <= minVal)
            return false;
        return isValidBST(root.left,minVal,root.data) && isValidBST(root.right,root.data,maxVal);
    }
    
    //Q235 by striver
    public Node lowestCommonAncestor(Node root, TreeNode p, TreeNode q) {
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
    
    //Q285 My Approach
    static int ans=-1;
    public static int findSuccORPrede(Node root,int key) {
    	if (root == null)
    		return -1;
    	if(root.data==key) {
    		ans = Prede(root.left);
    		if(ans==-1)
    			return -1;
        	return ans;
    	}
    	
    	if(root.data>key) {
    		findSuccORPrede(root.left,key);
    	}
    	else {
    		findSuccORPrede(root.right,key);
    	}
    	
    	return ans;
    
    }
    static int Succ(Node root) {
    	if(root==null)
    		return -1;
		while(root.left!=null) {
			root = root.left;
		}
		return root.data;
	}
    
    static int Prede(Node root) {
    	if(root==null)
    		return -1;
		while(root.right!=null) {
			root = root.right;
		}
		return root.data;
	}
    
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

    public static void inOrder(Node root, List<Integer> list){
        if(root==null)
            return;
        inOrder(root.left,list);
        list.add(root.data);
        inOrder(root.right,list);
    }

	//InOrder traversal always gives you SORTED values of BST
	// Shradha
	public static void inOrder(Node root) {
		if(root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	//Q653 My Approach
	//Diff appraoch is in leetcode which is little gud approach
	public static boolean findTarget(Node root, int k) {
        if(root == null)
        	return false;
        List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        Integer []ans = new Integer[list.size()]; 
        return twoSum(list.toArray(ans),k);
    }
	
	public static boolean twoSum(Integer[] arr,int key) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		for(int i=0;i<map.size();i++) {
			int second = key - arr[i];
			if(map.containsKey(second) && map.get(second)!=i) {
				return true;
			}
		}
		return false;
	}
	
	static Node prev,first,mid,last;
	public static void recoverTree(Node root) {
		 /* Optional
		first=mid=last=null;
		prev = new TreeNode(Integer.MIN_VALUE);
		*/
        
        inOrderForRecoverTree(root);
        if(first!=null && last!=null) {
        	int temp = first.data;
        	first.data = last.data;
        	last.data = temp;
        }
        if(first!=null && mid!=null) {
        	int temp = first.data;
        	first.data = mid.data;
        	mid.data = temp;
        }
    }
	
	private static void inOrderForRecoverTree(Node root) {
		if(root==null)
        	return;
		
		inOrderForRecoverTree(root.left);
		if(prev!=null &&(root.data < prev.data)) {
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
		Integer[] arr = {7,1,3,6,5};
		int[] values = {5,1,3,4,2,7,6};				//    5
		Node root = null;							//   /  \
		int target = 28;								//  1     7
													//   \	  /
		//for inserting values in tree			  //      3  6 
		for(int i=0;i<values.length;i++) {		  //     /  \
			root = insert(root, values[i]);       //    2    4       
		}
		
//		inOrder(root);
//		System.out.println();
//		
//		delete(root,5);
//		inOrder(root);
//		System.out.println();
		
//		if(search(root,target)) {
//			System.out.println("Target exist");
//		}
//		else {
//			System.out.println("Target does not exist");
//		}
		
		//System.out.println(findCeil(root,6));
		
		//System.out.println(findFloor(root, 6));
		
		//PrintInRange(root,3,7);
		
		//printRoot2LeafPath(root, new ArrayList<>());
		
		//System.out.println(kthSmallestORMaximum(root,2));
		
		//System.out.println(findSuccORPrede(root,5));
		
		//System.out.println(twoSum(arr,target));
		
		System.out.println(findTarget(root,target));
		
		
	}

}
