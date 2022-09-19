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
class Q234 {
    
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
    
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null)
        	return true;
        
        ListNode middle = mid(head);
        ListNode first = head;
        ListNode second = Iterativereversel2(middle.next);
        
        while(first!=null&&second!=null) {
        	if(first.val!=second.val) {
        		return false;
        	}
        	first=first.next;
        	second=second.next;
        }
		return true;
    
    }
}
