package ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

class Q119 {
	
	
	public static List<Integer> generate(int numRows) {
		 List<Integer> answer = new ArrayList();
	        long x = 1;
	        answer.add((int) x);
	        for(int i = 0;i<numRows;i++){
	            x = x*(numRows-i)/(i+1); 
	            answer.add((int)x);
	        }
	        return answer;
	}
	
	public static void main(String[] args) {
		int N = 3;
		List ans = generate(N);
		System.out.println(ans);
	}
	
}