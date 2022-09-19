package Stack;

public class CQue {
	int rear = -1;
	int front = -1;
	int size;
	int[] data;
	static int DEFAULT = 10;
	
	CQue() {
		this(DEFAULT);
	}
	CQue(int n)
	{
		this.data = new int[n];
		this.size=n;
	}
	
	
	public boolean isFull() {
		return (rear+1)%size == front;
	}
	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}
	
	public void enque(int item) {
		if(isFull()) {
			System.out.println("Queue is already full!!");
			return;
		}
		if(front==-1)
			front=0;
		
		rear = (rear+1)%size;
		data[rear] = item;
	}
	
	public int deque() {
		if(isEmpty()) {
			System.out.println("Queue is already empty!!");
			return -1;
		}
		
		int ans = data[front];
		if(rear==front) {
			rear=front=-1;
		}
		else {
			front = (front+1)%size;
		}
		//rear--;
		return ans;
	}
	
	int peek() {
		if(isEmpty()) {
			System.out.println("Stack is already empty!!");
			return -1;
		}
		
		return data[front];
	}
	
	public void display() {
		System.out.println("\nData in stack!!");
		for(int i=0;i<size;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		CQue q = new CQue(5);
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.enque(50);
		//q.enque(60);
		q.display();
		
		System.out.println("Deletd item is : "+q.deque());
		System.out.println("Deletd item is : "+q.deque());
		
		q.enque(70);
		q.enque(80);
		//q.enque(90);
		q.display();
		

	}

}
