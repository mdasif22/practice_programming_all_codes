package LinkedList;

public class ListReverse {

	Node head;
	Node tail;
	// Creating new Node
	static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;		
		}

		public Node Iterativereversel2(Node l1) {
			// TODO Auto-generated method stub
			return null;
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
	
	public void insertFirst(int value)
	{
		Node newNode = new Node(value);
		
		newNode.next=head;
		head = newNode;
		
		if(tail==null)
		{
			tail=head;
		}
	}
	
	public void insertLast(int value) {
		if(tail==null) {
			insertFirst(value);
			return;
		}
		Node newNode = new Node(value);
		tail.next=newNode;
		tail=newNode;
	}
	
	//Iterative Approach
	//Problem .....
	public void Iterativereversel() {
		if(head==null || head.next==null)
			return;
		
		Node prev = null;
		Node current = head;
		
		while(current!=null) {
			Node next = current.next;
			current.next = prev;
			
			prev = current;
			current = next;
		}
		head=prev;
		
	}
	
	 //List reverse 2
	//Q92
	 public static Node reverseBetween(Node head, int left, int right) {
	       Node dummy = new Node(0);
	       Node prev = dummy;
	       
	       for(int i=0;i<left-1;i++) {
	    	   prev=prev.next;
	       }
	       
	       Node cur = prev.next;
	       
	       for(int i=0;i<right-left;i++) {
	    	   Node next = cur.next;
	    	   cur.next=next.next;
	    	   next.next=prev.next;
	    	   prev.next=next.next;
	       }
	       
	       return dummy.next;
	 }
	
	//Recursive approach to reverse a Linkedlist
	void Recursivereverse(Node node) {
		if(node==tail) {
			head = tail;
			return;
		}
		
		Recursivereverse(node.next);
		tail.next = node;
		tail = node;
		tail.next =null;
	}
	
	//Part of Problem 234 leetcode
	Node mid(Node h1) {
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
	
	//Part of Problem 234 leetcode
	public Node Iterativereversel2(Node midhead) {
		if(midhead==null || midhead.next==null)
			return midhead;
		
		Node prev = null;
		Node current = midhead;
		
		while(current!=null) {
			Node next = current.next;
			current.next = prev;
			
			prev = current;
			current = next;
		}
		return prev;
		
	}
	
	//Part of Problem 234 leetcode
	//Check Palindrom
	public boolean isPalindrome(Node head) {
        if(head==null || head.next==null)
        	return true;
        
        Node middle = mid(head);
        Node first = head;
        Node second = Iterativereversel2(middle.next);
        
        while(first!=null&&second!=null) {
        	if(first.data!=second.data) {
        		return false;
        	}
        	first=first.next;
        	second=second.next;
        }
		return true;
    }
	
	//Problem 143
	public void reorder(Node head) {
		if(head==null || head.next==null) {
			return;
		}
		
		Node middle = mid(head);
		Node firsthead = head;
		Node secondhead = Iterativereversel2(middle);
		
		while(firsthead!=null && secondhead!=null) {
			Node temp = firsthead.next;
			firsthead.next = secondhead;
			firsthead=temp;
			
			temp = secondhead.next;
			secondhead.next = firsthead;
			secondhead=temp;
		}
		if(firsthead!=null)
			firsthead.next=null;
	}
	
	
	//Problem 61 (Rotate list)
	public Node rotate(Node head,int k) {
		if(k<=0 || head==null || head.next==null)
			return head;
		
		Node temp = head;
		int length = 1;
		while(temp.next!=null) {
			temp=temp.next;
			length++;
		}
		temp.next=head; //connecting last node to first not (circle)
		
		int rotation = k % length; 
		int size = length - rotation;
		Node lastnode = head;
		
//		while(size-->1)
//			lastnode=lastnode.next;
		
		for(int i=0;i<size-1;i++) {
			lastnode=lastnode.next;
		}
		
		head = lastnode.next;
		lastnode.next=null;
		
		return head;
	}
	
	
	
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("End");
		
	}
	public void display1() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {

		ListReverse list = new ListReverse();
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(4);
		list.insertLast(5);
		//list.insertLast(1);
		list.display();
		
//		list.swapNodes(list.head, 2);
//		list.display();
		
//		list.Recursivereverse(list.head);
//		list.display();
		
//		list.Iterativereverse1();
//		list.display();
		
		//System.out.println("Is List is palindrom? "+list.isPalindrome(list.head));
		
//		list.reorder(list.head);
//		list.display();
		
		list.head =  list.rotate(list.head,2);
		list.display();
		
	}

}
