package Stack;

import java.util.Stack;

public class Delete_middle_element_of_stack {
		static int count=0;
	    //Function to delete middle element of a stack.
	    public static void deleteMid(Stack<Integer>s,int sizeOfStack){
	        // code here
	         if(sizeOfStack<=0)
	          return;
	         if(count==sizeOfStack/2)
	         {
	             s.pop();
	             return;
	         }
	         
	         int x = s.pop();
	         count++;
	         deleteMid(s,sizeOfStack);
	         s.push(x);
	    
		
//        int l=0;
//        Stack<Integer>s1=new Stack<>();
//        Stack<Integer>s2=new Stack<>();
//        int k= sizeOfStack/2;
//        
//        for(int i=0;i<sizeOfStack;i++){
//            if(s.isEmpty())
//            break;
//          // if(sizeOfStack%2!=0){
//            if(i!=(k)){
//              //l= s.pop();
//             s1.push(s.pop());
//            }
//            else{
//           // l=s.pop();
//            s2.push(s.pop());
//            }
//        
//        }
//        for(int i=0;i<(sizeOfStack-1);i++){
//            if(s1.isEmpty())
//            break;
//            
//            
//            l=s1.pop();
//            s.push(l);
//        }
        
		
		//My Approach (Accepted but not submitted)
//		Stack<Integer> st = new Stack();
//      int mid=sizeOfStack/2;
//      for(int i=0;i<sizeOfStack;i++){
//      	
//          if(i==mid)
//          {
//          	continue;
//          }
//          else {
//          	st.push(s.get(i));
//          }
//         
//      }
//      s.clear();
//      for(int i=0;i<st.size();i++) {
//      	s.push(st.get(i)); 
//      }
    
    } 

	public static void main(String[] args) {
		Stack<Integer> stack =  new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		deleteMid(stack,stack.size());
		System.out.println(stack);

	}

}
