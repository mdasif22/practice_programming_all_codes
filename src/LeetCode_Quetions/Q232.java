package LeetCode_Quetions;

import java.util.Stack;

//Actual solution
class Q232 {
  private Stack<Integer> data = new Stack<Integer>();;
  public Q232() {
   
  }
  
  public void push(int x) {
      this.data.push(x);
  }
  
  public int pop() {
      Stack<Integer> temp = new Stack<Integer>();
      while(this.data.size() !=1){
          temp.push(this.data.pop());
      }
      int y = this.data.pop();
      while(temp.size()!=0){
          this.data.push(temp.pop());
      }
      return y;
  }
  
  public int peek() {
      Stack<Integer> temp = new Stack<Integer>();
      while(this.data.size() !=1){
          temp.push(this.data.pop());
      }
      int y = this.data.peek();
      while(temp.size()!=0){
          this.data.push(temp.pop());
      }
      return y;
  }
  
  public boolean empty() {
      return this.data.isEmpty();
  }
}

/*class MyQueue {
  private ArrayList<Integer> array;

  public MyQueue() {
      array = new ArrayList<>();
  }
  
  public void push(int x) {
      array.add(x);
  }
  
  public int pop() {
      int x = this.array.get(0);
      array.remove(0);
      return x;
  }
  
  public int peek() {
      return array.get(0);
  }
  
  public boolean empty() {
      return array.isEmpty();
  }
}
*/