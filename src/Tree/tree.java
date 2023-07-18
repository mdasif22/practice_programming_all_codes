package Tree;

import java.util.*;

//By striver and shradha di
class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int val) {
		data=val;
	}
}

public class tree {
	//PreOrder traversal
	public static void preOrder(Node node) {
		if(node==null)
			return;
		
		System.out.println(node.data);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	//PreOrder traversal using iterative apprch by striver
	public static void preOrderIterative(Node node) {
		if (node == null)
			return;

		Stack<Node> st = new Stack<Node>();
		st.push(node);
		while(!st.isEmpty()) {
			Node root = st.pop();
			System.out.println(root.data+" ");
			if(root.right!=null)
				st.push(root.right);
			if(root.left!=null)
				st.push(root.left);
		}
		
	}
	
	//InOrder traversal
	public static void InOrder(Node node) {
		if (node == null)
			return;

		InOrder(node.left);
		System.out.println(node.data);
		InOrder(node.right);
	}
	
	//PostOrder traversal
	public static void PostOrder(Node node) {
		if (node == null)
			return;

		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.data+" ");
	}
	
	//LevelOrder Traversal by shradha di
	public static void LevelOrder(Node node) {
		if(node==null)
			return;
		
		Queue<Node> que = new LinkedList<>();
		que.add(node);
		que.add(null);
		
		while(!que.isEmpty()) {
			Node currNode = que.remove();
			if(currNode==null) {
				System.out.println();
				if(que.isEmpty())
					break;
				else {
					que.add(null);
				}
			}
			else {
				System.out.print(currNode.data+" ");
				if(currNode.left!=null)
					que.add(currNode.left);
				if(currNode.right!=null)
					que.add(currNode.right);
			}
		}
	}	
	
	//HomeWork by Shradha (My approach)
		public static int SumInKLevel(Node node,int k) {
			if(node==null)
				return 0;
			int c=0,sum=0;
			
			Queue<Node> que = new LinkedList<>();
			que.add(node);
			que.add(null);
			
			while(!que.isEmpty()) {
				Node currNode = que.remove();
				
				if(currNode==null) {
					//System.out.println();
					c++;
					if(que.isEmpty())
						break;
					else {
						que.add(null);
					}
				}
				else {
					//System.out.print(currNode.data+" ");
					if(c==k) {
						sum+=currNode.data;
					}
					if(currNode.left!=null)
						que.add(currNode.left);
					if(currNode.right!=null)
						que.add(currNode.right);
				}
			}
		return sum;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);	
		root.left.left = new Node(4);									//			1
		root.left.left = new Node(4);									//		   /  \
		root.left.left = new Node(4);									//		  2    3
		root.left.right = new Node(5);									//	 	 / \  / \
		root.left.right.left = new Node(6);								//		4   5 7 8
		root.right.left = new Node(7);									//		   /
		root.right.right = new Node(8);									//		  6
		
		//preOrder(root);
		//preOrderIterative(root);
		
		//InOrder(root);
		
		//PostOrder(root);
		
		//LevelOrder(root);
		
		//System.out.println(SumInKLevel(root,1));
	}
}
