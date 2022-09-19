package LinkedList;

public class CLL1 {

	Node head ;
	Node tail;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
		
	}
	
	public void insert(int data) {
		Node nn = new Node(data);
		if(head==null) {
			head=nn;
			tail=nn;
			return;
		}
		
		tail.next = nn;
		nn.next=head;
		tail=nn;
	}
	
	void display() {
		Node temp=head;
		if(head!=null) {
			do {
				System.out.print(temp.data+" -> ");
				temp=temp.next;
			}while(temp!=head);
		}
		System.out.println("End");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CLL1 list = new CLL1();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.display();
				
	}

}
