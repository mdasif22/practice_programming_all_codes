package LeetCode_Quetions;

import LinkedList.LLQ.Node;

public class Q2095 {

	public Node deleteMiddle(Node head) {
        if(head.next == null) return null;
        // For only 2 node , delete the second node and return head
        if(head.next.next == null) {
            head.next = null;
            return head;
        }

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.value=slow.next.value;
        slow.next=slow.next.next;

        return head;
    }
}
