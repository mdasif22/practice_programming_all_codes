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
class Q83 {
    public ListNode deleteDuplicates(ListNode temp) {
        if(temp==null)
            return temp;
        ListNode head = temp;
		while(temp.next!=null) {
			if(temp.val == temp.next.val) {
				temp.next=temp.next.next;
			}
			else {
				temp=temp.next;
			}	
		}
        return head;
    }
}
