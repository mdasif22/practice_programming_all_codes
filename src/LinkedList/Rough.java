package LinkedList;
import java.util.*;

import LinkedList.LLQ.Node;
public class Rough {
	
	Node head;
	Node tail;
	static int size;
	
	Rough(){
		this.size=0;
	}
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			size++;
		}
		Node(int data,Node next){
			this.data=data;
			this.next=next;
			size++;
		}
	}
	
	void insertFirst(int data) {
		Node nn=new Node(data);
		if(head==null) {
			head=nn;
			return;
		}
		nn.next=head;
		head=nn;
	}
	
	void insertGiv(int data,int index) {
		
		Node temp=head;
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		Node nn=new Node(data,temp.next);
		temp.next=nn;
		size++;
	}
	
	void insertLast(int data) {
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
	
	void deleteFirst() {
		size--;
		int data=head.data;
		head=head.next;
		System.out.println("\nDeleted node : "+data);
	}
	
	void deletegiv(int index){
		Node temp=head;
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}
		int data=temp.next.data;
		temp.next=temp.next.next;
		System.out.println("Deleted item : "+data);
	}
	
	void deleteLast() {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		size--;
		int data=temp.next.data;
		temp.next=null;
		System.out.println("\nDeleted node : "+data);
	}
	
	public void duplicate() {
		Node temp = head;
		while (temp.next != null) {
			if (temp.data == temp.next.data) {
				temp.next = temp.next.next;
				 size--;
			} else {
				temp = temp.next;
			}

		}
		tail=temp;
		tail.next=null;
	}
	
	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.print("End \n");
	}
		
	public static void main(String[] args) {
		Rough list=new Rough();
		list.insertLast(10);
		list.insertLast(20);
		list.insertLast(30);
		list.insertLast(30);
		list.insertLast(50);
		list.display();
		list.duplicate();
		list.display();
//		list.deleteFirst();
//		list.display();
//		list.deleteLast();
//		list.display();
	}
}
