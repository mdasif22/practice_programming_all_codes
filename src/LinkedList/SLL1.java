package LinkedList;

public class SLL1 {
	
	Node head;
	Node tail;
	private static int size ;
	
	SLL1(){
		this.size=0;
	}
	
	//Creating a Node
	class Node{
		int value;
		Node next;
		
		public Node(int value) {
			this.value=value;
			size++;
		}
		public Node(int value,Node next) {
			this.value=value;
			this.next=next;
			size++;
		}
		
	}
	
	//Insert at first
	void insertFirst(int value) {
		Node newNode = new Node(value);
		if(head==null) {
			head = newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
		
	}
	
	
	//Insert At Given Node
	public void insertAtGiven(int value,int index) {
		if(index==0) {
			insertFirst(value);
			return;
		}
		else {
			Node temp=head;
			for(int i=1;i<index;i++) {
				temp=temp.next;
			}
			Node newNode = new Node(value,temp.next);
			temp.next=newNode;
		}
	}
	
	
	//Insert At Last
	public void insertLast(int value) {
		Node newNode=new Node(value);
		if(head==null) {
			head=newNode;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		temp.next=newNode;
		
	}
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		int data = head.value;
		size--;
		head = head.next;
		System.out.println("Deleted node : "+data);
	}
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		
		Node LastElement = head.next;
		Node secondLastElement = head;
		while(LastElement.next != null) {
			LastElement = LastElement.next;
			secondLastElement=secondLastElement.next;
		}
		System.out.println("Deleted node is : "+LastElement.value);
		secondLastElement.next=null;
	}
	
	// MY APPROACH
//	void dlast() {
//		if(head==null) {
//			System.out.println("List is empty");
//			return;
//		}
//		else if(head.next==null) {
//			head=null;
//			return;
//		}
//		node temp = head;
//		while(temp.next.next!=null) {
//			temp=temp.next;
//		}
//		size--;
//		temp.next=null;
//	}
	
	
	//Display
	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.value+" -> ");
			temp=temp.next;
		}
		System.out.println("End");
	}

	public static int getSize() {
		return size;
	}
	
	public static void main(String[] args) {
		
		SLL1 list = new SLL1();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(5);
		
//		list.insertLast(1);
//		list.insertLast(2);
//		list.insertLast(3);
//		list.insertLast(4);
//		list.insertLast(5);
		list.display();
		//list.insertAtGiven(8, 1);
		
		//list.deleteFirst();
		list.deleteLast();
		
		list.display();
		
		System.out.println("Size of list is : "+getSize());
		
	}

}
