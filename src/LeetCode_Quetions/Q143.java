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
class Q143 {
    
    ListNode mid(ListNode h1) {
		
		if(h1==null)
			return h1;
		
		ListNode s=h1;
		ListNode f=h1;
		while(f.next != null && f.next.next != null){
          s=s.next;
          f=f.next.next;
      }
      return s;
	}
    
    public ListNode Iterativereversel2(ListNode midhead) {
		if(midhead==null || midhead.next==null)
			return midhead;
		
		ListNode prev = null;
		ListNode current = midhead;
		
		while(current!=null) {
			ListNode next = current.next;
			current.next = prev;
			
			prev = current;
			current = next;
		}
		return prev;
		
	}
    
    public void reorderList(ListNode head) {
        
		if(head==null || head.next==null) {
			return;
		}
		
		ListNode middle = mid(head);
		ListNode firsthead = head;
		ListNode secondhead = Iterativereversel2(middle);
		
		while(firsthead!=null && secondhead!=null) {
			ListNode temp = firsthead.next;
			firsthead.next = secondhead;
			firsthead=temp;
			
			temp = secondhead.next;
			secondhead.next = firsthead;
			secondhead=temp;
		}
		if(firsthead!=null)
			firsthead.next=null;
	
    }
}