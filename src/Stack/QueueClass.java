package Stack;

public class QueueClass{
	int rear = -1;
	int[] data;
	static int DEFAULT = 10;
	
	QueueClass() {
		this(DEFAULT);
	}
	QueueClass(int size)
	{
		this.data = new int[size];
	}
	
	public boolean isFull() {
		return rear == data.length-1;
	}
	public boolean isEmpty() {
		return rear == -1;
	}
	
	public void enque(int item) {
		if(isFull()) {
			System.out.println("Stack is full!!");
			return;
		}
		rear++;
		data[rear] = item;
	}
	
	public int deque() {
		if(isEmpty()) {
			System.out.println("Stack is already empty!!");
			return -1;
		}
		
		int front = data[0];
		for(int i=0;i<rear+1;i++) {
			data[i] = data[i+1];
		}
		rear--;
		return front;
		
	}
	
	int peek() {
		if(isEmpty()) {
			System.out.println("Stack is already empty!!");
			return -1;
		}
		
		return data[0];
	}
	
	public void display() {
		System.out.println("\nData in stack!!");
		for(int i=0;i<rear+1;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		QueueClass q = new QueueClass(5);
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.display();
		
		System.out.println("Deletd item is : "+q.deque());
		System.out.println("Deletd item is : "+q.deque());
		
		q.display();
		
		q.enque(50);
		q.enque(60);
		q.display();
	}

}
