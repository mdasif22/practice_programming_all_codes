package Queue;

import java.util.Queue;
import java.util.Stack;

public class Reverse_First_K_elements_of_Queue {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> Queue, int k) {
       	Stack<Integer> st = new Stack<>();

		for (int i = 0; i < k; i++) {
			st.push(Queue.peek());
			Queue.remove();
		}
		/*
		 * Enqueue the contents of stack at the back of the queue
		 */
		while (!st.isEmpty()) {
			Queue.add(st.peek());
			st.pop();
		}
		/*
		 * Remove the remaining elements and enqueue them at the end of the Queue
		 */
		for (int i = 0; i < Queue.size() - k; i++) {
			Queue.add(Queue.peek());
			Queue.remove();
		}
		
		return Queue;
    }
}
