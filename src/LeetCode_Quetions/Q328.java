package LeetCode_Quetions;

import LinkedList.LLQ.Node;

public class Q328 {
	public Node oddEvenList(Node head) {
        if(head == null || head.next==null)
        return head;

        Node odd = head, even=head.next, evenHead= even;

        //My Approach
        //firstly, it will connect first odd index to next odd index then it wil come to that next odd index.
        //similarly,it will connect first even index to next even index then it wil come to that next even index.  
        //lastly, connect the odd last element with first even index.
        while(odd.next!=null &&even.next!=null){
            odd.next=even.next;
            odd=even.next;
            even.next=odd.next;
            even=odd.next;
        }

        // while(odd.next!=null &&even.next!=null){
        //     odd.next=even.next;
        //     odd=odd.next;
        //     even.next=odd.next;
        //     even=even.next;
        // }

        odd.next=evenHead;
        return head;
    }
}
