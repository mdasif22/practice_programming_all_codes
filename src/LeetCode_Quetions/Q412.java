package LeetCode_Quetions;

import java.util.*;

public class Q412 {
	
	public static List<String> fizzBuzz(int n) {
        List list = new ArrayList();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }
            else if(i%3==0){
                list.add("Fizz");
            }
            else if(i%5==0){
                list.add("Buzz");
            }
            else{
                list.add(i);
            }
        }
        return list;
    }

	public static void main(String[] args) {
		int n = 5;
		List ans = fizzBuzz(n);
		System.out.println(ans);

	}

}
