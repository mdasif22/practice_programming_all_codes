package LinkedList;

public class DLL1 {
	
	Node head;
	private static int size;
	
	DLL1(){
		this.size=0;
	}
	//Creating New node
	public class Node{
		int value;
		Node next;
		Node prev;
		
		public Node(int value) {
			this.value = value;
			size++;
		}
		public Node(int value,Node next,Node prev) {
			this.value = value;
			this.next=next;
			this.prev=prev;
			size++;
		}
	}
	
	public void insertFirst(int value) {
		Node newNode = new Node(value);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		newNode.prev=null;
		head.prev=newNode;
		head = newNode;
	}
	
	public void insertGiven(int value,int index) {
		if(index==0) {
			insertFirst(value);
			return;
		}
		else if(index==size-1) {
			insertLast(value);
			return;
		}
		else {
			if(index>size) {
				System.out.println("Index does not exist");
				return;
			}
			Node temp=head;
			for(int i=1;i<index;i++) {
				temp=temp.next;
			}
			Node newNode = new Node(value,temp.next,temp);
			temp.next=newNode;
			temp.next.prev=newNode;
		}
	}
	
	public void insertLast(int value) {
		Node newNode = new Node(value);
		if(head==null) {
			head=newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next=newNode;
		newNode.prev = temp;
	}
	
	public void deleteFirst() {
		if(head == null) {
		 System.out.println("List is empty");
		return;
		}
		int data = head.value;
		head=head.next;
		System.out.println("Deletd item is : "+data);
		size--;
		
	}
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		
		size--;
		Node secondLast = head;
		Node last=head.next;
		while(last.next!=null) {
			last = last.next;
			secondLast = secondLast.next;
		}
		int val=last.value;
		secondLast.next=null;
		System.out.println("Deleted last node is : "+val);
	}
	
	public void display()
	{
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.value+" -> ");
			temp = temp.next;
		}
		System.out.println("End");
	}
	
	static int getSize() {
		return size;
	}
	public static void main(String[] args) {
		DLL1 list = new DLL1();
//		list.insertFirst(1);
//		list.insertFirst(2);
//		list.insertFirst(3);
//		list.insertFirst(4);
		
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(4);
		
		list.display();
		
		list.insertGiven(8,2);
		
		list.display();
		System.out.println("Size of current list is : "+getSize());
		
//		list.deleteFirst();
//		list.display();
		
		list.deleteLast();
		list.display();
		System.out.println("Size of current list is : "+getSize());
	}

}
