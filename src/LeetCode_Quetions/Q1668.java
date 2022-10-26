package LeetCode_Quetions;

public class Q1668 {

	public static int maxRepeating(String sequence, String word) {
		 String str = word;
	        int count=0;
	        while(sequence.contains(str)){
	            str+=word;
	            count++;
	        }
	        return count;
    }
	
	public static void main(String[] args) {
				String sequence = "ababc", word = "ab";
				int ans = maxRepeating(sequence,word);
				System.out.println(ans);

	}

}
