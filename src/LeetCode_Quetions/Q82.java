package LeetCode_Quetions;

public class Q82 {
	public Node deleteDuplicates(Node head) {
		if(head == null || head.next == null) 
			return head;
		
        Node next = head.next;
        
        if(next.value == head.value){
            while(next != null && next.value == head.value) next = next.next;
            return deleteDuplicates(next);
        } else {
            head.next = deleteDuplicates(next);
            return head;
        }
	}
}
