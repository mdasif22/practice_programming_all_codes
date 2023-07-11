package LeetCode_Quetions;

public class Q1669 {
	    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
	        ListNode temp = list1;
	        ListNode start = list1; 
	        ListNode end = list1;

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
