package LinkedList;

import LinkedList.LLQ.Node;

public class SortList {
	Node head=null;
	
	// Creating new Node
	static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;		
		}	
	}
	
	//Insert Last method
	public void last(int data) {
		Node nn = new Node(data);
		if (head == null) {
		head = nn;
		return;
		}
		
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = nn;
	}
	
	
	//Bubble Sort
	void Bubblesort() {
		Node temp = head;
		int count =0;
		
		while(temp!=null) {
			temp=temp.next;
			count++;
		}
		
		for(int i=0;i<count;i++) {
			Node f = head;
			Node s = head.next;
			for(int j=0;j<count-i-1;j++) {
				if(f.data>s.data) {
					int value = f.data;
					f.data=s.data;
					s.data=value;
				}
				f=f.next;
				s=s.next;
			}
			
		}
		
	}
	
	
	public Node mid(Node h1) {
		
		if(h1==null)
			return h1;
		
		Node s=h1;
		Node f=h1;
		while(f.next != null && f.next.next != null){
          s=s.next;
          f=f.next.next;
      }
      return s;
	}
	
	
	//Merge Sort
	Node mergeSort(Node h) {
		if(h == null || h.next==null) {
			return h;
		}
		Node middle = mid(h);
		Node midNext = middle.next;
		middle.next=null;
		
		Node left = mergeSort(h);
		Node right = mergeSort(midNext);
		
		Node SortedList = mergeList(left,right);
		
		return SortedList;
	}
	
	
	 Node mergeList(Node left, Node right) {
		 Node result = null;
		 if(left==null)
			 return right;
		 if(right==null) {
			 return left;
		 }
		 
		 if(left.data<right.data) {
			 result = left;
			 result.next = mergeList(left.next,right);
		 }
		 else {
			 result = right;
			 result.next = mergeList(left,right.next);
		 }
			 
		return result;
	}

	 
	// Display method
	 public void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println("End");
			
		}
	 
	public static void main(String[] args) {
		
		SortList list = new SortList();
		list.last(4);
		list.last(5);
		list.last(1);
		list.last(3);
		list.last(2);
		list.last(6);
		list.display();
		
//		list.Bubblesort();
//		list.display();
		
	 	list.head = list.mergeSort(list.head);
		list.display();
		
	}

}
