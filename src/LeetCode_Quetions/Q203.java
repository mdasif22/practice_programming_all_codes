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
class Q203 {
    public ListNode removeElements(ListNode head, int val) {
        
//         while(head != null && head.val == val) {
//             head = head.next;
//         }
//         if(head == null) {
//             return head;
//         }
        
//         // check val from 2nd node since head.val is handled
//         ListNode curr = head;
//         while(curr != null & curr.next != null) {
//             if(curr.next.val == val) {
//                 curr.next = curr.next.next;
//             } else {
//                 curr = curr.next;
//             }
//         }
		
// 	    return head;
        
        ListNode f = new ListNode(-1, head);
        ListNode node = f;
        while( node != null && node.next != null){
            if(node.next.val == val)
                node.next = node.next.next;
            else
                node = node.next;
        }
        return f.next;
    
    }
}
