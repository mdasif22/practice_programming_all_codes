package LeetCode_Quetions;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Q61 {
    public ListNode rotateRight(ListNode head, int k) {
        
		if(k<=0 || head==null || head.next==null)
			return head;
		
		ListNode temp = head;
		int length = 1;
		while(temp.next!=null) {
			temp=temp.next;
			length++;
		}
		temp.next=head;
		
		int rotation = k % length; 
		int size = length - rotation;
		ListNode lastnode = head;
//		while(size-->0) {
//			lastnode=lastnode.next;
//		}
		for(int i=0;i<size-1;i++) {
			lastnode=lastnode.next;
		}
		head = lastnode.next;
		lastnode.next=null;
		
		return head;
	
    }
}