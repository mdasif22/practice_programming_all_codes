package LinkedList;

import LinkedList.LLQ.Node;

public class NextGreaterNodeInLinkedList {
	//Q1019 - ans referenced from submitted ans
		 public int[] nextLargerNodes(Node head) {
			 	Node temp = head;
		        int len=0;
		        while(temp!=null){
		            len++;
		            temp=temp.next;
		        }
		 
		        int arr[] = new int[len];
		        int i=0;
		        while(head!=null){
		            int val = greaterElement(head);
		            arr[i++] = val;
		            head=head.next;
		        }
		        return arr;
		    }

		    public int greaterElement(Node head){
		    	Node temp = head;
		        while(temp!=null){
		            if(temp.value>head.value)
		                return temp.value;
		            else
		                temp=temp.next;
		        }
		        return 0;
		}
}
