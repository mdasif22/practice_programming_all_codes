package LeetCode_Quetions;

public class Q86 {
	    //Q86 video - https://www.youtube.com/watch?v=b4FeEwAGDtU
	    public ListNode partition(ListNode head, int x) {
	        ListNode small = new ListNode(0);
	        ListNode high = new ListNode(0);

	        ListNode smallHead = small;
	        ListNode highHead = high;

	        while(head!=null){
	            if(head.val<x){
	                smallHead.next=head;
	                smallHead=smallHead.next;
	            }
	            else{
	                highHead.next=head;
	                highHead=highHead.next;
	            }
	            head=head.next;
	        }
	        highHead.next=null;
	        smallHead.next=high.next;

	        return small.next;
	}
}
