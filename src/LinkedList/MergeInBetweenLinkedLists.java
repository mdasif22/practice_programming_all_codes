package LinkedList;

import LinkedList.LLQ.Node;

public class MergeInBetweenLinkedLists {
	//Q1669 - reference from submitted values
		 public Node mergeInBetween(Node list1, int a, int b, Node list2) {
			 Node temp = list1;
			 Node start = list1; 
			 Node end = list1;

		        // Take the first pointer to location a.
		        while(a>1){
		            a--;
		            start = start.next;
		        }

		         // take the second pointer to location b.
		        while(b>0){
		            b--;
		            end = end.next;
		        }
		        end=end.next;
		        // connecting first pointer to list2
		        start.next=list2;
		        
		        // traverse thorugh list2 and connect the end to second pointer
		        while(list2.next!=null){
		            list2=list2.next;
		        }
		        list2.next = end;

		        return temp;
		}
}
