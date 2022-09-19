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
class Q876 {
    public ListNode middleNode(ListNode head) {
        
        //Method 1
//         ListNode f=head;
//         ListNode s=head;
        
//         while(f!=null && f.next!=null){
//             s=s.next;
//             f=f.next.next;
//         }
//         return s;
        
        
        //Method 2
		ListNode temp = head;
		int count=0;
		
		while(temp!=null) {
			temp=temp.next;
			count++;
		}
		ListNode tem = head;
		for(int i=0;i<count/2;i++) {
			tem = tem.next;
		}
		
	return tem;
    }
}
