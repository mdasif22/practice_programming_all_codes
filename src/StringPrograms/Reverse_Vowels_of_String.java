package StringPrograms;

public class Reverse_Vowels_of_String {
	
	public String reverseVowels(String s) {
        //My Approach
        int left=0,right=s.length()-1;
        char[] word = s.toCharArray();
        String ans="";
        for(int i=0;i<s.length();i++) {
        	if(word[left] == 'a' || word[left] == 'e' || word[left] == 'i' || word[left] == 'o' || word[left] == 'u' || word[left] == 'A' || word[left] == 'E' || word[left] == 'I' || word[left] == 'O' || word[left] == 'U') {
        		while(left<=right) {
        			if(word[right] == 'a' || word[right] == 'e' || word[right] == 'i' || word[right] == 'o' || word[right] == 'u' || s.charAt(right) == 'A' || word[right] == 'E' || word[right] == 'I' || word[right] == 'O' || word[right] == 'U') {
        				swap(left,right,word);
        				right--;
        				break;
        			}
        			right--;
        		}
        	}
        	left++;
        }
        
        for(int i=0;i<word.length;i++) {
        	ans+=word[i];
        }
        return ans;
    }

    private static void swap(int left, int right,char[] word) {
	char temp = word[left];
	word[left]=word[right];
	word[right]=temp;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
