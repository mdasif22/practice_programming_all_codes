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
class Q19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
            return null;
        
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        if(n==len)
            return head.next;
        
        int size=len-n;
        ListNode prev = head;
        while(size-->1){
            prev=prev.next;
        }
        prev.next = prev.next.next;
        
        return head;
    }
}
