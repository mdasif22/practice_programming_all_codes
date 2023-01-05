package Queue;

public class Queue_Using_LikedList {
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public static class Queue{
		static Node head=null;
		static Node tail=null;
		
		public static boolean isEmpty() {
			return head==null & tail==null;
		}
		
		public static void Enque(int data) {
			Node nn = new Node(data);
			if(tail==null) {
				tail=head=nn;
				return;
			}
			
			tail.next=nn;
			tail=nn;
		}
		
		public static int Deque() {
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			
			int front=head.data;
			if(head==tail) {
				tail=null;
			}
			head=head.next;
			return front;
		}
		
		public static int peak() {
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			return head.data;
		}
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.Enque(10);
		q.Enque(20);
		q.Enque(30);
		q.Enque(40);
		q.Enque(50);
		
		while(!q.isEmpty()) {
			System.out.println(q.peak());
			q.Deque();
		}
	}

}
