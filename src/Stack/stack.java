package Stack;
import java.util.*;

//************** STACK USING ARRAY *****************
//public class stack {
//
//	int top = -1;
//	static int DEFAULT_SIZE = 10;
//	int[] data;
//	
//	public stack() {
//		this(DEFAULT_SIZE);
//	}
//	public stack(int size) {
//		this.data = new int[size];
//	}
//	
//	
//	public void push(int value) {
//		if(isFull()) {
//			System.out.println("Stack is full");
//			//return false;
//			return;
//		}
//		top++;
//		data[top] = value;
//		//return true;
//	}
//	
//	public int pop() throws Exception{
//		if(isEmpty()) {
//			throw new Exception ("Stack is empty");	
//		}
////		int element = data[top];
////		top--;
////		return element;
//		
//		return data[top--];
//	}
//	
//	public int peek()  throws Exception{
//		if(isEmpty()) {
//			throw new Exception ("Stack is empty");	
//		}
//		return data[top];
//	}
//	private boolean isFull() {
//		return top == data.length-1;
//	}
//	private boolean isEmpty() {
//		return top == -1;
//	}
//	
//	public void display() {
//		System.out.println("Data in stack!!");
//		for(int i=0;i<data.length;i++) {
//			System.out.println(data[i]);
//		}
//	}
//	public static void main(String[] args) throws Exception{
//		stack stk = new stack(5);
//		stk.push(1);
//		stk.push(2);
//		stk.push(3);
//		stk.push(4);
//		stk.push(5);
//		stk.display();
//
//		System.out.println();
//		System.out.println("POP "+stk.pop());
//	}
//
//}


// ************** STACK USING LINKED LIST *****************
//class stack{
//	
//	static class node {
//		int data;
//		node next;
//		
//		node(int data){
//			this.data=data;
//			this.next=null;
//		}
//	}
//	
//	static class Stackclass{
//		static node head;
//		
//		private static boolean isEmpty() {
//			// TODO Auto-generated method stub
//			return head==null;
//		}
//		
//		public static void push(int data) {
//			node nn = new node(data);
//			if(isEmpty()) {
//				head = nn;
//				return;
//			}
//			nn.next=head;
//			head=nn;
//		}
//
//		public static int pop() {
//			if(isEmpty()) {
//				System.out.println("Stack is empty");
//				return -1;
//			}
//			int top = head.data;
//			head = head.next;
//			return top;
//		}
//		
//		public static void display() {
//			node temp = head;
//			System.out.println("Elements in stack!!");
//			while(temp!=null) {
//				System.out.println(temp.data);
//				temp=temp.next;
//			}
//			System.out.println();
//		}
//	}
//	
//	public static void main(String[] args) {
//		Stackclass stk = new Stackclass();
//		stk.push(1);
//		stk.push(2);
//		stk.push(3);
//		stk.push(4);
//		stk.display();
//		
//		System.out.println("Deleted item is : "+stk.pop());
//		System.out.println("Deleted item is : "+stk.pop());
//		System.out.println();
//		stk.display();
//	}
//	
//}


//**************** REVERSE STRING USING STACK ***************
//class stack{
//	public static void main(String[] args) {
//		String str = "asif";
//		String str1 = "";
//		Stack s = new Stack();
//		char[] ch = str.toCharArray();
//		
//		for(int i=0;i<str.length();i++) {
//			s.add(ch[i]);
//		}
//		while(!s.empty()) {
//			Object s1 = s.peek();
//			str1+=s1;
//			s.pop();
//		}
//		
//		System.out.println(str1);
//	}
//}


class stack{
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		System.out.println(s);
		
	}
}
