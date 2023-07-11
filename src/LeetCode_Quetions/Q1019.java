package LeetCode_Quetions;

public class Q1019 {
	    public int[] nextLargerNodes(ListNode head) {
	        ListNode temp = head;
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

	    public int greaterElement(ListNode head){
	        ListNode temp = head;
	        while(temp!=null){
	            if(temp.val>head.val)
	                return temp.val;
	            else
	                temp=temp.next;
	        }
	        return 0;
	}
}
