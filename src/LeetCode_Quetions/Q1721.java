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
class Q1721 {
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode slow=head;
        ListNode temp=head;
        ListNode fast=head;
        int count=1;
        
        while( temp!=null ){
            if( count < k ){
                 slow=slow.next;
            }else if( count > k)
            {
                fast=fast.next;
            }
            temp =temp.next;
            count++;
        }
        
        int swap=slow.val;
        slow.val=fast.val;
        fast.val=swap;
            
    return head;    
    }
}
