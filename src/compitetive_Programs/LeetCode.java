package compitetive_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//class LeetCode
//{
//	public static boolean containsNearbyDuplicate(int[] nums, int k) {
//		
//		//My Approach
////      int n = nums.length;
////		for(int i=0;i<n;i++)
////		{
////			for(int j=i+1;j<n;j++)
////			{
////				if(nums[i]==nums[j])
////				{
////					//int l = Math.abs(i-j);
////					if((j-i)<=k)
////						return true;
////				}
////			}
////		}
////		
////		return false;
//		
//		// Google Approach
//		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//	        for (int i = 0; i < nums.length; i++)
//	        {
//	            if (map.containsKey(nums[i]))
//	            {
//	                if (Math.abs(i - map.get(nums[i])) <= Math.abs(k)) 
//	                {
//	                    return true;
//	                }
//	            }
//	            map.put(nums[i], i);
//	        }
//	        return false;
//    }
//
//	public static void main(String[] args) {
//		int[] nums = {1,2,3,1,2,3};
//		int k = 2;
//		boolean ans = containsNearbyDuplicate(nums,k);
//		System.out.println(ans);
//	}
//}


//Problem 1
//class LeetCode
//{
//	public static int[] twoSum(int[] nums, int target) {
//		int n = nums.length;
//        int i=0,j=0;
//        for( i=0;i<n;i++)
//        {
//        	for( j=i+1;j<n;j++)
//        	{
//        		if(nums[i]+nums[j] == target)
//        		{
//        			return new int[] {i,j};
//        		}
//        	}
//        }
//        return new int[] {i,j};
//    }
//
//	public static void main(String[] args) {
//		int[] nums = {11,15,2,7};
//		int target = 9;
//		int[] result = twoSum(nums,target);
//		System.out.println(Arrays.toString(result));
//	}
//}


//Problem 1572
//class LeetCode
//{
//	
//	public static int diagonalSum(int[][] mat) {
//		
//		int n = mat[0].length, j = n - 1, sum = 0;
//		for(int i = 0; i < n; i++){
//		if(i!=j){
//		sum = sum + mat[i][i] + mat[i][j];
//		}
//		else{
//		sum = sum + mat[i][i];
//		}
//		j--;
//		}
//		return sum;
//		}
//	public static void main(String[] args) {
//		int[][] mat = {{1,1,1,1},
//		               {1,1,1,1},
//		               {1,1,1,1},
//		               {1,1,1,1}};
//		
//		int ans = diagonalSum(mat);
//		System.out.println(ans);
//		
//	}
//}


//Problem 867
class LeetCode
{
	public static int[][] transpose(int[][] matrix) {
		int len=matrix.length;
		int[][] mat= new int[matrix[0].length][len];     
		
		for(int row=0;row<len;row++)
		{
			for(int col=0;col<matrix[row].length;col++)
			{
				mat[col][row] = matrix[row][col];
			}
			
		}
		return mat;
    }
	
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose matrix");
		int[][] ans = transpose(mat);
		//System.out.println(Arrays.toString(ans));
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans.length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}


//Problem 268 (Missing number)
//************ METHOD 1 ***************
//class LeetCode {
//
//	public static int missingNumber(int[] nums) {
//		int expected_num = nums.length;
//		int total_sum = expected_num * (expected_num + 1) / 2;
//
//		int sum = 0;
//		for (int i = 0; i < nums.length; i++) {
//			sum = sum + nums[i];
//		}
//
//		return total_sum - sum;
//	}
//
//	public static void main(String[] args) {
//		int[] nums = { 6,3,1,2,0,4 };
//
//		int ans = missingNumber(nums);
//		System.out.println(ans);
//
//	}
//}
//****************** METHOD 2 BY KUNAL ***************
//class LeetCode {
//
//	public static int findDisappearedNumbers(int[] nums) {
//
//		int i = 0;
//		while (i < nums.length) {
//			int correct = nums[i] ; // if starts from 0 - n
//			//int correct = nums[i]+1 ; // if starts from 1 - n
//
//			if (nums[i]<nums.length && nums[i] != nums[correct]) {
//				swap(nums, i, correct);
//			} else
//				i++;
//
//		}
//
//		for (int j = 0; j < nums.length; j++) {
//			if (nums[j] != j) //if(nums[j] != j+1) if starts from 1 - n
//				
//				return j + 1;
//		}
//
//		return nums.length;
//
//	}
//
//	static void swap(int[] arr, int first, int second) {
//		int temp = arr[first];
//		arr[first] = arr[second];
//		arr[second] = temp;
//	}
//
//	public static void main(String[] args) {
//		int[] nums = { 1,0,3,2 };
//
//		int ans = findDisappearedNumbers(nums);
//		System.out.println(ans);
//
//	}
//}



//Problem 448 (All missing numbers)
//class LeetCode {
//
//	public static List<Integer> findDisappearedNumbers(int[] nums) {
//
//		int i = 0;
//		while (i < nums.length) {
//			int correct = nums[i] - 1; // Formula
//			if (nums[i] != nums[correct]) {
//				swap(nums, i, correct);
//			} else
//				i++;
//
//		}
//
//		List<Integer> result = new ArrayList<>();
//		for (int index = 0; index < nums.length; index++) {
//			if (nums[index] != index + 1) {
//				result.add(index + 1);
//			}
//		}
//
//		return result;
//	}
//
//	static void swap(int[] arr, int first, int second) {
//		int temp = arr[first];
//		arr[first] = arr[second];
//		arr[second] = temp;
//
//		// return arr;
//	}
//
//	public static void main(String[] args) {
//		int[] nums = { 4,3,2,7,8,2,3,1 }; // 4,3,2,7,8,2,3,1
//
//		List ans = findDisappearedNumbers(nums);
//		System.out.println(ans);
//
//	}
//}



//Problem 287 (Duplicate number)
//class LeetCode {
//
//	public static int findDisappearedNumbers(int[] nums) {

//      //Method 1  
//		int i=0;
//		while(i<nums.length) {
//			
//			if(nums[i] != i+1)
//			{
//				int correct = nums[i]-1;	//Formula
//				if(nums[i] != nums[correct] )
//				{
//					swap(nums,i,correct);
//				}
//				else
//					return nums[i];
//			}
//			
//			else
//				i++;
//			
//		}
//		
//		return -1;


		//Method 2
//		int i = 0;
//		while (i < nums.length) {
//			int correct = nums[i] - 1; // Formula
//			if (nums[i] != nums[correct]) {
//				swap(nums, i, correct);
//			} else
//				i++;
//		
//		}
//		
//		
//		for (int index = 0; index < nums.length; index++) {
//			if (nums[index] != index + 1) {
//				return nums[index];
//			}
//		}
//		
//		return -1;
//		
//		
//    }
//
//	static void swap(int[] arr, int first, int second) {
//		int temp = arr[first];
//		arr[first] = arr[second];
//		arr[second] = temp;
//	}
//	
//	public static void main(String[] args) {
//		int[] nums = {3,1,4,1,2 };
//
//		int ans = findDisappearedNumbers(nums);
//		System.out.println(ans);
//
//	}
//}





//Problem 442 (All Duplicate number)
//class LeetCode {
//
//	public static List<Integer> findDuplicates(int[] nums) {
//
//		int i = 0;
//		while (i < nums.length) {
//			int correct = nums[i] - 1; // Formula
//			if (nums[i] != nums[correct]) {
//				swap(nums, i, correct);
//			} else
//				i++;
//
//		}
//
//		List<Integer> result = new ArrayList<>();
//		for (int index = 0; index < nums.length; index++) {
//			if (nums[index] != index + 1) {
//				result.add(nums[index]);
//			}
//		}
//
//		return result;
//	}
//
//	static void swap(int[] arr, int first, int second) {
//		int temp = arr[first];
//		arr[first] = arr[second];
//		arr[second] = temp;
//	}
//	
//	public static void main(String[] args) {
//		int[] nums = {4,3,2,7,8,2,3,1};
//
//		List ans = findDuplicates(nums);
//		System.out.println(ans);
//
//	}
//}


//Problem 645 (Set Mismatched)
//class LeetCode {
//
//	public static int[] findDisappearedNumbers(int[] nums) {
//
//		int i = 0;
//		while (i < nums.length) {
//			int correct = nums[i] - 1; // Formula
//			if (nums[i] != nums[correct]) {
//				swap(nums, i, correct);
//			} else
//				i++;
//
//		}
//
//		for (int j = 0; j < nums.length; j++) {
//			if (nums[j] != j + 1)
//			{
//				return new int[] {nums[j],j+1};
//			}
//				
//		}
//
//		return new int[]{-1,-1};
//
//	}
//
//	static void swap(int[] arr, int first, int second) {
//		int temp = arr[first];
//		arr[first] = arr[second];
//		arr[second] = temp;
//	}
//
//	public static void main(String[] args) {
//		int[] nums = { 1,2,2,4 };
//
//		int[] ans = findDisappearedNumbers(nums);
//		System.out.println(Arrays.toString(ans));
//
//	}
//}


//Problem 41 (First positive number)
//class LeetCode {
//
//	public static int findDisappearedNumbers(int[] nums) {
//
//		int i = 0;
//		while (i < nums.length) {
//			int correct = nums[i] - 1; // Formula
//			if (nums[i]> 0 && nums[i]<=nums.length &&nums[i] != nums[correct]) {
//				swap(nums, i, correct);
//			} else
//				i++;
//
//		}
//
//		for (int j = 0; j < nums.length; j++) {
//			if (nums[j] != j + 1)
//				
//				return j + 1;
//		}
//
//		return nums.length+1;
//
//	}
//
//	static void swap(int[] arr, int first, int second) {
//		int temp = arr[first];
//		arr[first] = arr[second];
//		arr[second] = temp;
//	}
//
//	public static void main(String[] args) {
//		int[] nums = { 7,8,9,11,12 };
//
//		int ans = findDisappearedNumbers(nums);
//		System.out.println(ans);
//
//	}
//}


//Problem 1342
//public class LeetCode {
//	
//	public static int numberOfSteps(int num) {
//        int count = 0;
//        int temp = num;
//        for(int i =0;i<temp;i++)
//        {
//        	if(num==0)
//        		break;
//        	
//        	if(num%2==0)
//            {
//            	num = num /2;
//            	count++;
//            }
//            else {
//            	num = num-1;
//            	count++;
//    		}
//        }
//        
//		return count;
//    }
//	public static void main(String[] args) {
//		int num = 14;
//		int ans = numberOfSteps(num);
//		System.out.println(ans);
//	}
//}
//




//Problem 1859
//class LeetCode
//{
//	public static void main(String[] args) {
//		String str1 = "is2 this1 test4 a3";
//		String str2 = " ";
//		String[] word = str1.split(" ");
//		String[] temp = new String[word.length];
//		for(int i = 0; i<word.length; i++)
//		{
//			int index = word[i].charAt(word[i].length()-1)-'0';
//			temp[index - 1] = word[i].substring(0,word[i].length()-1);
//		}
//		for(int i=0;i<temp.length;i++) {
//			str2 = str2+temp[i]+" ";
//			
//		}
//		
//		System.out.println(str2.trim());
//		
//	}
//}


//Problem 989
//public class LeetCode {
//	public static int[] sumZero(int n) {
//        
//		int[] temp = new int[n];
//		
//		if(n%2==0)
//		{
//			for(int i=0;i<n-1;i=i+2)
//			{
//				temp[i] = i+1;
//				temp[i+1] = -(i+1);
//			}
//		}
//		else {
//			for(int i=0;i<n-1;i=i+2)
//			{
//				temp[i] = i+1;
//				temp[i+1] = -(i+1);
//			}
//			temp[temp.length-1] = 0;
//		}
//		
//		return temp;
//    }
//
//	public static void main(String[] args) {
//		int n = 4;
//		int[] ans = sumZero(n);
//		System.out.println(Arrays.toString(ans));
//	}
//}


//Problem 66
//public class LeetCode {
//	
//	public static int[] plusOne(int[] digits) {
//        
//			int index = digits.length-1;
//			
//			while(index>=0)
//			{
//				if(digits[index]!=9)
//	        	{
//	        		digits[index] = digits[index]+1;
//	        		return digits;
//	        	}
//				
//				digits[index] = 0;
//				index--;
//			}
//			
//			int[] result = new int[digits.length+1];
//			result[0] = 1;
//			return result;
//    }
//	
//	public static void main(String[] args) {
//		int[] digits = {9};
//		int[] ans = plusOne(digits);
//		System.out.println(Arrays.toString(ans));
//	}
//}


//Problem 189(Right shift)
//class LeetCode
//{
//	public static int[] rotate(int[] nums, int k) {
//      
//		int index = nums.length-1;
//		for(int j=1;j<=k;j++)
//		{
//			int last = nums[index];
//			for(int i=index;i>0;i--)
//			{
//				nums[i] = nums[i-1];
//				
//			}
//			nums[0] = last;
//		}
//		
//		return nums;
//		
//  }
//	
//	public static void main(String[] args) {
//		int[] nums = {1,2,3,4,5,6,7}; 
//		int k = 3;
//		int[] ans = rotate(nums,k);
//		System.out.println(Arrays.toString(ans));
//	}
//}


//Problem 88
//class LeetCode {
//
//	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
//		 
//		 int j=0;
//		 for(int i=m;i<nums1.length;i++)
//		 {
//			 nums1[i] = nums2[j++];
//		 }
//		 Arrays.sort(nums1);
//		 //System.out.println(Arrays.toString(nums1));
//	 }
//
//	public static void main(String[] args) {
//		int[] arr1 = { 1,2,3,0,0,0 };
//		int[] arr2 = { 2,5,6 };
//		int m=3;
//		int n=3;
//		merge(arr1,m, arr2,n);
//		
//	}
//}


//Problem 283
//class LeetCode{
//	
//	public static void moveZeroes(int[] nums) {
//		int len = nums.length;
//		int j=0;
//        for(int i=0;i<len;i++)
//        {	
//        	if(nums[i] != 0)
//        	{
//        		int temp = nums[i];
//        		nums[i] = nums[j];
//        		nums[j] = temp;
//        		j++;
//        	}
//        }
//        System.out.println(Arrays.toString(nums));
//    }
//	
//	public static void main(String[] args) {
//		int[] nums= {0,1,0,3,12};
//		moveZeroes(nums);
//	}
//}


//Problem 83
/*
public class LeetCode {

	Node head, tail;
	int size;

	LeetCode() {
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

	public void duplicate() {
		Node temp = head;
		while (temp.next != null) {
			if (temp.value == temp.next.value) {
				temp.next = temp.next.next;
				// size--;
			} else {
				temp = temp.next;
			}

		}
//		tail=temp;
//		tail.next=null;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("End");
	}

	public static void main(String[] args) {

		LeetCode l = new LeetCode();
		l.last(1);
		l.last(1);
		l.last(2);
		l.last(3);
		l.last(3);
		l.display();

		l.duplicate();
		l.display();
	}

} 
 */

//****************	CYCLE IN LIST *************** 
//Problem 141 (Cycle in list)
//public class LeetCode {
//    public boolean hasCycle(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//        
//        while(fast!=null && fast.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow == fast)
//                return true;
//        }
//        
//        return false;
//    }
//}


//Starting node of Cycle or loop 
//public Node cycleStart() {
//	Node f=head;
//	Node s=head;
//	while(f!=null && f.next!=null) {
//		s=s.next;
//		f=f.next.next;
//		if(s==f) {
//			break;
//		}
//	}
//	s=head;
//	while(s!=f)
//	{
//		s=s.next;
//		f=f.next;
//	}
//	return s;
//}

//Problem (Length of Cycle of list)
//public class LeetCode {
//    public boolean hasCycle(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//        
//        while(fast!=null && fast.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow == fast)
//                ListNode temp = slow;
//            	  int length = 0;
//            	do {
//            		temp = temp.next;
//            		length++;
//            	}while(temp!=slow);
//            	return length;
//        }
//        
//        return 0;
//    }
//}
//****************************************************

//Problem 202 (Happy number)
//class LeetCode{
//	
//	public static int square(int n) {
//		int sum = 0;
//		while(n>0) {
//			int rem = n%10;
//			sum+=rem*rem;
//			n=n/10;
//		}
//		
//		return sum;
//	}
//	
//	public static  boolean isHappy(int n) {
//       int f=n;
//       int s=n;
//       
//       do {
//    	   s = square(s);
//    	   f = square(square(f));
//       }while(s!=f);
//		
//       if(s == 1)
//    	   return true;
//		
//		return false;
//    }
//	
//	public static void main(String[] args) {
//		int n = 19;
//		System.out.println(isHappy(n));
//	}
//}
//***************** OR *********************
//public class LeetCode {
//
//	static int square(int num) {
//		int sum = 0;
//		while(num>0) {
//			int rem = num%10;
//			sum+=rem*rem;
//			num/=10;
//		}
//		return sum;
//	}
//	
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int num = 84;
//	int result=num;
//	
//	while(result!=1 && result != 4) {
//		result = square(result);
//	}
//	
//	if(result == 1)
//		System.out.println("It is happy number");
//	else if(result == 4)
//		System.out.println("It is not happy number");
//	
//	}
//
//}

//Problem 876 (Middle of List)
//Method 1 by kunal
//class Solution {
//    public ListNode middleNode(ListNode head) {
//        ListNode f=head;
//        ListNode s=head;
//        
//        while(f!=null && f.next!=null){
//            s=s.next;
//            f=f.next.next;
//        }
//        return s;
//    }
//}

//**************** OR ******************
// My method 2
//public void mid() {
//	Node temp = head;
//	int count=0;
//	
//	while(temp!=null) {
//		temp=temp.next;
//		count++;
//	}
//	System.out.println(count);
//	Node tem = head;
//	for(int i=0;i<count/2;i++) {
//		tem = tem.next;
//	}
//	System.out.println(tem.value);
//}

//Problem 234 
//Check Palindrom
//	public boolean isPalindrome(Node head) {
//      if(head==null || head.next==null)
//      	return true;
//      
//      Node middle = mid(head);
//      Node first = head;
//      Node second = Iterativereversel2(middle.next);
//      
//      while(first!=null&&second!=null) {
//      	if(first.data!=second.data) {
//      		return false;
//      	}
//      	first=first.next;
//      	second=second.next;
//      }
//		return true;
//  }


//Problem 143
//	public void reorder(Node head) {
//		if(head==null || head.next==null) {
//			return;
//		}
//		
//		Node middle = mid(head);
//		Node firsthead = head;
//		Node secondhead = Iterativereversel2(middle);
//		
//		while(firsthead!=null && secondhead!=null) {
//			Node temp = firsthead.next;
//			firsthead.next = secondhead;
//			firsthead=temp;
//			
//			temp = secondhead.next;
//			secondhead.next = firsthead;
//			secondhead=temp;
//		}
//		if(firsthead!=null)
//			firsthead.next=null;
//	}

///Problem 61 (Rotate list)
//public Node rotate(Node head,int k) {
//	if(k<=0 || head==null || head.next==null)
//		return head;
//	
//	Node temp = head;
//	int length = 1;
//	while(temp.next!=null) {
//		temp=temp.next;
//		length++;
//	}
//	temp.next=head;
//	
//	int rotation = k % length; 
//	int size = length - rotation;
//	Node lastnode = head;
//	
////	while(size-->1)
////		lastnode=lastnode.next;
//	
//	for(int i=0;i<size-1;i++) {
//		lastnode=lastnode.next;
//	}
//	
//	head = lastnode.next;
//	lastnode.next=null;
//	
//	return head;
//}


//Problem 19
//public ListNode removeNthFromEnd(ListNode head, int n) {
//    if(head.next==null)
//        return null;
//    
//    ListNode temp = head;
//    int len = 0;
//    while(temp!=null){
//        temp=temp.next;
//        len++;
//    }
//    if(n==len)
//        return head.next;
//    
//    int size=len-n;
//    ListNode prev = head;
//    while(size-->1){
//        prev=prev.next;
//    }
//    prev.next = prev.next.next;
//    
//    return head;
//}



//Problem 2 ( add 2 numbers )
//public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//    
//    ListNode dummy = new ListNode();
//    ListNode temp = dummy;
//    int carry=0;
//    while(l1!=null || l2!=null || carry ==1){
//        int sum=0;
//        if(l1!=null){
//            sum+=l1.val;
//            l1=l1.next;
//        }
//        if(l2!=null){
//            sum+=l2.val;
//            l2=l2.next;
//        }
//        
//        sum+=carry;
//        carry=sum/10;
//        ListNode node = new ListNode(sum%10);
//        temp.next=node;
//        temp=temp.next;
//        
//    }
//	return dummy.next;
//}


//Problem 237 (Delete Node in a Linked List)
//class Solution {
//    public void deleteNode(ListNode node) {
//        node.val = node.next.val;
//        node.next=node.next.next;
//    }
//}


//Problem 1721 ( swap 2 numbers )
//public ListNode swapNodes(ListNode head, int k) {
//Node slow=head;
//Node temp=head;
//Node fast=head;
//int count=1;
//
//while( temp!=null ){
//    if( count < k ){
//         slow=slow.next;
//    }else if( count > k)
//    {
//        fast=fast.next;
//    }
//    temp =temp.next;
//    count++;
//}
//
//int swap=slow.data;
//slow.data=fast.data;
//fast.data=swap;
//
//return head;
//}


//Problem 203
//public Node removeElements(Node head, int val) {
//    
//	 Node f = new Node(-1, head); // creating dummy node nd pointing to head
//	 Node node = f;
//   while( node != null && node.next != null){
//       if(node.next.value == val)
//           node.next = node.next.next;
//       else
//           node = node.next;
//   }
//   return f.next;
//}


//Problem 1290 ( binary to decimal )
//public int getDecimalValue(Node head) {
//	int result = head.value;
//    while(head.next!=null){
//        result = result*2 + head.next.value;
//        head=head.next;
//    }
//    
//    return result;
//}

//*********************** NUMBERS PROBLEMS *************
//Problem 231
//class numbers{
//	
//	public static boolean isPowerOfTwo(int n) {
//      
//		if(n==1)return true;
//	    
//	    if(n%3!=0 || n==0)return false;
//	    
//	    return isPowerOfTwo(n/3);
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(isPowerOfTwo(20));
//		
//	}
//}


//Problem 326
//class numbers{
//	
//	public static boolean isPowerOfThree(int n) {
//      
//		if(n==1)return true;
//	    
//	    if(n%3!=0 || n==0)return false;
//	    
//	    return isPowerOfThree(n/3);
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(isPowerOfThree(20));
//		
//	}
//}

//Problem 342
//class numbers {
//
//	public static boolean isPowerOfFour(int n) {
//
//		if (n == 1)
//			return true;
//
//		if (n % 4 != 0 || n == 0)
//			return false;
//
//		return isPowerOfFour(n / 4);
//	}
//
//	public static void main(String[] args) {
//		System.out.println(isPowerOfFour(0));
//
//	}
//}


//Problem 168
//class numbers{
//
//public static String convertToTitle(int columnNumber) {
//    String result = "";
//    int n = columnNumber;
//    while(n>0){
//        char c = (char) ('A' + (n-1)%26);
//        result = c+result;
//        n=(n-1)/26;
//    }
//    
//    return result;
//}
//
//public static void main(String[] args) {
//	System.out.println(convertToTitle(2));
//}
//}


//Problem 628
//class numbers{
//	
//	 public static int maximumProduct(int[] nums) {
//	        Arrays.sort(nums);
//	        int len = nums.length;
//	            int a = nums[0] * nums[1] * nums[len -1];
//	            int b = nums[len - 1] * nums[len - 2] * nums[len - 3];
//	            
//	            return a > b ? a : b;
//	    }
//	
//	public static void main(String[] args) {
//		int[] num= {-100,-98,-1,2,3,4};
//		System.out.println(maximumProduct(num));
//	}
//}


//Problem 70(Not completed)
//public int climbStairs(int n) {
//    // not completed
//     if(n<0)
//        return 0;
//     if(n==0)
//         return 1;
//     int ans = climbStairs(n-1) + climbStairs(n-2);
//    
//     return ans;
//}

//**************** ARRAY ***************
//Problem 989
//public static List<Integer> addToArrayForm(int[] num, int k) {
//    List list = new ArrayList();
//    int len = num.length-1;
//    int carry = 0;
//    
//    for(int i=len;i>=0;i--) {
//    	int sum=0;
//    		int rem = k%10;
//        	sum=num[len]+rem+carry;
//        	list.add(sum%10);
//        	carry = sum/10;
//        	k=k/10;
//        	len--;
//    }
//    k=k+carry;
//    while(k!=0) {
//    	list.add(k%10);
//    	k=k/10;
//    }
//    
//    Collections.reverse(list);
//    return list;
//}


//Problem 1380. Lucky Numbers in a Matrix
/*
public static List luckyNumbers(int[][] matrix) {
	int m = matrix.length;
	int n = matrix[0].length;
	ArrayList ar = new ArrayList();
	int ak[] = new int[m];
	int a[] = new int[n];
	for (int i = 0; i < m; i++) // find min element in each row
	{
		int min = matrix[i][0];
		for (int j = 0; j < n; j++) {
			if (matrix[i][j] < min)
				min = matrix[i][j];
		}
		ak[i] = min;
	}
	for (int j = 0; j < n; j++) // find max element in each column
	{
		int max = matrix[0][j];
		for (int i = 0; i < m; i++) {
			if (matrix[i][j] > max)
				max = matrix[i][j];
		}
		a[j] = max;
	}
	for (int i = 0; i < m; i++) // now comapring max element of each column with min element of each row if
								
	{
		for (int j = 0; j < n; j++) {
			if (ak[i] == a[j])
				ar.add(ak[i]);
		}
	}
	return ar;
}

public static void main(String[] args) {
	int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
	List res = luckyNumbers(matrix);
	System.out.println(res);
	
}
*/


//Problem 53. Maximum Subarray
//public static int maxSubArray(int[] nums) {
//    int sum=0;
//    int max=nums[0];
//    for(int i=0;i<nums.length;i++) {
//    	sum+=nums[i];
//    	if(sum>max) {
//    		max=sum;
//    	}
//    	if(sum<0) {
//    		sum=0;
//    	}
//    }
//    return max;
//}


//Problem 121. Best Time to Buy and Sell Stock
//public class Max_Profit {
//	
//	public static int maxProfit(int[] prices) {
//        int len = prices.length;
//        
//        //Method 1
//        int min = prices[0];
//        int max = 0,sub=0;
//        for(int i =0;i<len;i++) {
//        	if(prices[i]<min) {
//        		min = prices[i];
//        	}
//        	sub =  prices[i]-min;
//        	if(sub>max)
//        		max = sub;
//        }
//        
//        
//        //Method 2
////        int max = 0;
////        int min=Integer.MAX_VALUE;
////        for(int i=0;i<len;i++) {
////        	if(prices[i] < min) {
////        		min = prices[i];
////        	}
////        	else if(prices[i] - min > max) {
////        		max = prices[i] - min;
////        	}
////        }
////        
//        return max;
//    }
//	
//	public static void main(String[] args) {
//		int[] num = {2,4,1}; // 2 4 1
//		int ans = maxProfit(num);
//		System.out.println(ans);
//	}
//}

//Problem 66
//public int[] plusOne(int[] digits) {
//    
//	int index = digits.length-1;
//	
//	while(index>=0)
//	{
//		if(digits[index]!=9)
//    	{
//    		digits[index] = digits[index]+1;
//    		return digits;
//    	}
//		
//		digits[index] = 0;
//		index--;
//	}
//	
//	int[] result = new int[digits.length+1];
//	result[0] = 1;
//	return result;
//
//}

//Problem 26 Remove duplicates
//public static int removeDuplicates(int[] nums) {
//	int i=0;
//    for(int j=1;j<nums.length;j++){
//        if(nums[j]!=nums[i]){
//            i++;
//            nums[i] = nums[j];
//        }
//    }
//    
//    return i+1;
//}


//Problem 1217 Min cost to move chips
//public int minCostToMoveChips(int[] position) {
//    
//    int odd=0,even=0;
//    for(int i=0;i<position.length;i++) {
//    	if(position[i]%2==0) {
//    		even++;
//    	}
//    	else {
//    		odd++;
//    	}
//    }
//    
//    return Integer.min(odd, even);
//
//}


//Problem 238. Product of Array Except Self
//public static int[] productExceptSelf(int[] nums) {
//    
//    int mul=1;
//    int[] answer = new int[nums.length];
//    
//	//Left array
//    for(int i=0;i<nums.length;i++) {
//    	answer[i] = mul;
//    	mul*=nums[i];
//    }
//    
//    //Right array
//    mul=1;
//    for(int i=nums.length-1;i>=0;i--) {
//    	answer[i] = answer[i]*mul;
//    	mul*=nums[i];
//    }
//    
//    return answer;
//}


//Problem 55 Jump game
//class Solution {
//    public boolean canJump(int[] nums) {
//    
//       int reachable = 0;
//        for(int i=0;i<nums.length;i++){
//            if(reachable<i)
//                return false;
//            reachable = Integer.max(reachable, i+nums[i]);
//        }
//        return true;
//    }
//}



//Problem 75 Sort Colors
/*
public static void sortColors(int[] nums) {
    int temp,low=0,mid=0,high=nums.length-1;
    while(mid<=high) {
    	switch(nums[mid]) {
    	case 0:{
    		temp = nums[low];
    		nums[low]=nums[mid];
    		nums[mid]=temp;
    		
    		low++;
    		mid++;
    		break;
    	}
    	
    	case 1:{
    		mid++;
    		break;
    	}
    	
    	case 2:{
    		temp=nums[mid];
    		nums[mid]=nums[high];
    		nums[high]=temp;
    		
    		high--;
    		break;
    	}
    	
    	}
    }
    
}

public static void main(String[] args) {
	
	int[] nums = {2,0,2,1,1,0};
	sortColors(nums);
	System.out.println(Arrays.toString(nums));
}
*/





