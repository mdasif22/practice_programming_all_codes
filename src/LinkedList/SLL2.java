package LinkedList;

//Kunal's LL
public class SLL2 {

	Node head;
	Node tail;
	private static int size;
	public SLL2() {
		this.size=0;
	}
	
	//Insert at first
	public void insertFirst(int value)
	{
		Node newNode = new Node(value);
		
		newNode.next=head;
		head = newNode;
		
		if(tail==null)
		{
			tail=head;
		}
		
		size+=1;
	}
	
	//Insert at given index
	public void insertAtGiven(int value,int index) {
		if(index==0) {
			insertFirst(value);
			return;
		}
		else if(index==size) {
			insertLast(value);
			return;
		}
		else {
			
			Node temp = head;
			for(int i=1;i<index;i++) {
				temp=temp.next;
			}
			
			Node newNode = new Node(value,temp.next);
			temp.next=newNode;
			size++;
			
		}
		
	}
	
	//Insert At Last
	public void insertLast(int value) {
		if(tail==null) {
			insertFirst(value);
			return;
		}
		Node newNode = new Node(value);
		tail.next=newNode;
		tail=newNode;
		size++;
	}
	
	//Delete First
	public int deleteFirst() {
		
		int val = head.value;
		head=head.next;
		
		//System.out.println("Deleted node is : "+val);
		
		size--;
		if(head==null) {
			tail=null;
		}
		return val;
	}
	
	//Delete Last
	public int deleteLast() {
		if(size<=1) {
			return deleteFirst();
		}
		Node secondLast = get(size-2);
		int val = tail.value;
		tail=secondLast;
		tail.next=null;
		size--;
		return val;
	}
	
	// MY APPROACH
//		void dlast() {
//			if(head==null) {
//				System.out.println("List is empty");
//				return;
//			}
//			else if(head.next==null) {
//				head=null;
//				return;
//			}
//			node temp = head;
//			while(temp.next.next!=null) {
//				temp=temp.next;
//			}
//			size--;
//			temp.next=null;
//		}
	
	//Delete At given position
	public int deleteGiven(int index) {
		if(index==0) {
			return deleteFirst();
		}
		else if(index==size-1) {
			return deleteLast();
		}
		else {
			Node prev = get(index-1);
			int val = prev.next.value;
			prev.next=prev.next.next;
			size--;
			return val;
		}
	}
	
	//My Appraoch
//	void deletegiv(int index){
//		Node temp=head;
//		for(int i=1;i<index;i++) {
//			temp=temp.next;
//		}
//		int data=temp.next.value;
//		temp.next=temp.next.next;
//		System.out.println("Deleted item : "+data);
//	}
	
	//To move towards a position
	public Node get(int index) {
		Node n = head;
		for(int i=0;i<index;i++) {
			n=n.next;
		}
		
		return n;
	}
	
	//Get size of current list
	public static int getSize() {
		return size;
	}
	
	//Display List
	public void display() {
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.value+" -> ");
			temp = temp.next;
		}
		System.out.println("End");
	}
	
	
	//Creating new Node
	class Node{
		
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value=value;
			//this.next=null;
			
		}
		
		public Node(int value,Node next) {
			this.value=value;
			this.next=next;
		}
		
	}
	
	
	public static void main(String[] args) {
		SLL2 list = new SLL2();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		
		list.insertLast(5);
		list.insertLast(6);
		
		list.insertAtGiven(9, 3);
		
		list.insertLast(1);
		
		list.display();
		
		System.out.println("First Deleted node is : "+list.deleteFirst());
		System.out.println("Last Deleted node is : "+list.deleteLast());
		
		list.display();
		
		System.out.println("Given Deleted node is : "+list.deleteGiven(3));
		
		list.display();
		
		System.out.println("Size of list is : "+getSize());

	}

}
