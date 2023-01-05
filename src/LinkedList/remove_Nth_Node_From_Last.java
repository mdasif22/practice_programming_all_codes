package LinkedList;

public class remove_Nth_Node_From_Last {
	//Problem 19
	public ListNode removeNthFromEnd(ListNode head, int n) {
	  if(head.next==null)
	      return null;
	  
	  ListNode temp = head;
	  int len = 0;
	  while(temp!=null){
	      temp=temp.next;
	      len++;
	  }
	  if(n==len)
	      return head.next;
	  
	  int size=len-n;
	  ListNode prev = head;
	  while(size-->1){
	      prev=prev.next;
	  }
	  prev.next = prev.next.next;
	  
	  return head;
}
}
