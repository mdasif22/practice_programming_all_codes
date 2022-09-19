package LinkedList;

import LinkedList.ListReverse.Node;

public class LLQ {

	Node head, tail;
	int size;

	LLQ() {
		this.size = 0;
	}

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
			size++;
		}

		Node(int data, Node next) {
			this.value = value;
			this.next = next;
			size++;
		}
	}

	public void last(int data) {
		Node nn = new Node(data);
		if (head == null) {
			head = nn;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = nn;
		
	}

	//duplicate
	public void duplicate() {
		Node temp = head;
		while (temp.next != null) {
			if (temp.value == temp.next.value) {
				temp.next = temp.next.next;
				 size--;
			} else {
				temp = temp.next;
			}

		}
		tail=temp;
		tail.next=null;
	}

	
	//merge
	public static LLQ merge(LLQ first, LLQ second) {
		
		Node f = first.head;
		Node s = second.head;
		LLQ ans = new LLQ();
		
		while(f != null && s!=null) {
			if(f.value<s.value) {
				ans.last(f.value);
				f=f.next;
			}
			else {
				ans.last(s.value);
				s=s.next;
			}
		}
		
		while(f!=null) {
			ans.last(f.value);
			f=f.next;
		}
		while(s!=null) {
			ans.last(s.value);
			s=s.next;
		}
		
		return ans;
	}
	
	//mid
	public void mid1() {
		Node temp = head;
		int count=0;
		
		while(temp!=null) {
			temp=temp.next;
			count++;
		}
		System.out.println(count);
		Node tem = head;
		for(int i=0;i<count/2;i++) {
			tem = tem.next;
		}
		System.out.println(tem.value);
	}
	
	Node mid(Node h1) {
		
		if(h1==null)
			return h1;
		
		Node s=h1;
		Node f=h1;
		while(f.next != null && f.next.next != null){
          s=s.next;
          f=f.next.next;
      }
      return s;
	}
	
	//Starting node of cycle in list
	public Node cycleStart() {
		Node f=head;
		Node s=head;
		while(f!=null && f.next!=null) {
			s=s.next;
			f=f.next.next;
			if(s==f) {
				break;
			}
		}
		s=head;
		while(s!=f)
		{
			s=s.next;
			f=f.next;
		}
		return s;
	}
	
	public Node Iterativereversel2(Node midhead) {
		if(midhead==null || midhead.next==null)
			return midhead;
		
		Node prev = null;
		Node current = midhead;
		
		while(current!=null) {
			Node next = current.next;
			current.next = prev;
			
			prev = current;
			current = next;
		}
		return prev;
		
	}
	
	public void swapNodes(Node head, int k) {
        Node middle = mid(head);
        Node second = Iterativereversel2(middle.next);
        Node ans = new Node(second.value);
        Node temp1=head;
    	Node temp2=second;
        for(int i=1;i<k;i++) {
        	temp1=temp1.next;
        	temp2=temp2.next;
        }
        int temp= temp1.value;
        temp1.value = temp2.value;
        temp2.value = temp;
        
        temp2.next = ans;
		
    }
	
	public Node removeElements(Node head, int val) {
	        
			 Node f = new Node(0, head);
			 Node node = f;
	        while( node != null && node.next != null){
	            if(node.next.value == val) {
	            	node.next = node.next.next;
	            }   
	            else
	                node = node.next;
	        }
	        return f.next;
    }
	
	public int getDecimalValue(Node head) {
		int result = head.value;
	    while(head.next!=null){
	        result = result*2 + head.next.value;
	        head=head.next;
	    }
	    
	    return result;
    }
	
	//display
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("End");
		
	}

	public static void main(String[] args) {

		LLQ l = new LLQ();
		l.last(1);
		l.last(0);
		l.last(1);
//		l.last(7);
//		l.last(7);
//		l.last(5);
//		l.last(6);
		
		l.getDecimalValue(l.head);
		
//		Node ans = l.removeElements(l.head, 7);
//		l.display(ans);
		
		//creating loop
		//l.head.next.next.next.next.next = l.head.next.next.next;
		//l.last(8);
//		l.display();
//		l.mid();
		
//		l.duplicate();
//		l.display();
		
//		LLQ first = new LLQ();
//		first.last(1);
//		first.last(3);
//		first.last(5);
//		first.last(9);
//		first.last(10);
//		
//		LLQ second = new LLQ();
//		second.last(1);
//		second.last(2);
//		second.last(4);
//		
//		
//		LLQ ans = LLQ.merge(first,second);
//		ans.display();
		
//		Node ans = l.cycleStart();
//		System.out.println("Starting node is "+ans.value);
		
	}

}
