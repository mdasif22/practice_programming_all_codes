package ArrayPrograms;

import java.util.*;
import java.util.Map.Entry;

public class hashmap {

	//Remove duplicates
	public static void Arrayduplicates(int[] arr) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i:arr) {
			if(!hm.containsKey(i)) {
				hm.put(i, 1);
			}
			else {
				hm.put(i, hm.get(i)+1);
			}
		}
		
		//To print method 1
//		Set<Integer> keys = hm.keySet();  
//        for (Integer x : keys) {  
//            if (hm.get(x) > 1) {  
//                System.out.println(x + "  is " + hm.get(x) + " times");  
//            }  
//        }  
        
        //To print method 2
//		for(Integer x : hm.keySet()) {
//			if(hm.get(x)>1)
//				System.out.println("Duplicate value is : "+x);
//		}
        
        //Printing method 3
        Set<Integer> l = new  LinkedHashSet<>();
        for(Entry<Integer, Integer> entry : hm.entrySet()) {
			if(entry.getValue()>1) {
				l.add(entry.getKey());
			}
		}
		System.out.println("Duplicates are : "+l);
		System.out.println("New Entry : "+hm);
	}
	
	//Duplicates in string
	public static void StringCharDuplicate(String str) {	//code decode
		HashMap<Character,Integer> hm = new HashMap<>();
		//char[] ch = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i),1);
			}
			else {
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
		}
		Set<Character> l = new  LinkedHashSet<>();
		Set<Character> keys = hm.keySet(); 
		
		//Printing method 2
//        for (Character x : keys) {  
//            if (hm.get(x) > 1) {  
//            	l.add(x);
//                System.out.println(x + "  is " + hm.get(x) + " times");  
//            }  
//        } 
        
		//Printing method 3
		for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if(entry.getValue()>1) {
				l.add(entry.getKey());
			}
		}
		
        System.out.println("Duplicates are : "+l);
        System.out.println("New String is : "+hm.keySet());
	}
	
	public static void StringWordDuplicate(String str) {
		HashMap<String,Integer> hm = new HashMap<>();
		Set<String> set = new LinkedHashSet<>();
		String[] string = str.split(" ");
		for(String s : string) {
			if(!hm.containsKey(s)) {
				hm.put(s,1);
			}
			else {
				hm.put(s, hm.get(s)+1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : hm.entrySet()) {
			if(entry.getValue()>1) {
				set.add(entry.getKey());
			}
		}
		System.out.println("Original String : "+hm.keySet());
		System.out.println("Duplicates :"+set);
	}
	
	//Two sum using hashMap LeetCode problem 1
	public static int[] twoSum(int[] arr,int target) throws Exception{
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			hm.put(arr[i], i);
		}
		
		for(int i=0;i<arr.length;i++) {
			int second = target-arr[i];
			if(hm.containsKey(second)&& hm.get(second)!=i)
			{
				return new int[] {i,hm.get(second)};
			}
		}
		
		return new int[] {-1,-1};
	}
	
	//Largest subarray with sum 0
	public static int LargestSubarray(int[] arr) {
		int max = 0;
		int sum = 0;
		int i=-1;
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(sum, i);
		while(i<arr.length-1) {
			i++;
			sum+=arr[i];
			if(!hm.containsKey(sum)) {
				hm.put(sum, i);
			}
			else {
				int len = i - hm.get(sum);
				if(len>max)
					max=len;
			}
		}
		return max;
	}
	
	//Count of Largest subarray with sum 0
	public static int LargestSubarrayCount(int[] arr) {
		int count = 0;
		int sum = 0;
		int i=-1;
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(sum, i);
		while(i<arr.length-1) {
			i++;
			sum+=arr[i];
			if(!hm.containsKey(sum)) {
				hm.put(sum, i);
			}
			else {
				count+=hm.get(sum);
				hm.put(sum, hm.get(sum)+1);
				//OR
				//count++;
			}
		}
		return count;
	}
	
	//Problem 3 Longest Substring Without Repeating Characters
	//public static int LongestSubstring(String s) {
		
//		int max=0;
//		Set set = new HashSet();
//		int count =0;
//		for(int i=0;i<s.length();i++) {
//			char c = s.charAt(i);
//			if(set.contains(c)) {
//				count=0;
//				set.remove(c);
//			}
//			else {
//				set.add(c);
//				count++;
//				if(count>max)
//					max=count;
//			}
//		}
//		return max;
//	}
	
	
	//Word Pattern in String (My Approach)
	public static boolean wordPattern(String pattern,String s) {
		//Method 1
//		HashMap<Character,String> map = new HashMap<>();
//		String[] str = pattern.split(" ");
//		
//		for(int i=0;i<s.length();i++) {
//			char ch = s.charAt(i);
//			if(str.length!=s.length())
//                return false;
//			if(!map.containsKey(ch)) {
//				if(map.containsValue(str[i])) {
//					return false;
//				}
//				map.put(ch, str[i]);
//			}
//			else if(map.containsKey(ch)) {
//				if(!map.get(ch).equals(str[i]))
//					return false;
//			}
//		}
//		//&& !map.containsValue(str[i])
//		return true;
		
		//Method 2
		HashMap<Character,String> map = new HashMap<>();
		String[] str = s.split(" ");
		
		for(int i=0;i<pattern.length();i++) {
			char ch = pattern.charAt(i);
			if(str.length!=pattern.length())
                return false;
            
            if(map.containsKey(ch)) {
				if(!map.get(ch).equals(str[i]))
					return false;
			}
            
			else {
				if(map.containsValue(str[i])) {
					return false;
				}
				map.put(ch, str[i]);
			}
			
		}
		return true;
	}
	
	//Problem 525 Contiguous array, Longest Subarray with Equal 0's and 1's
	public static int findMaxLength(int[] nums) {
        HashMap hm = new HashMap();
        int sum=0,max=0;
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]==0)
        		sum+=-1;
        	else if(nums[i]==1){
        		sum+=1;
        	}
        	
        	if(hm.containsKey(sum)) {
        		int index = (int) hm.get(sum);
        		int len = i - index;
        		if(len>max)
        			max=len;
        	}
        	else {
        		hm.put(sum, i);
        	}
        }
        return max;
    }
	
	//Pairs with equal sum
	public static boolean equalSum(int[] arr) {
		HashSet set = new HashSet();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int sum = arr[i]+arr[j];
				if(set.contains(sum))
					return true;
				else
					set.add(sum);
			}
		}
		return false;
	}
	
	// Rank of each element
	public static int[] arrayRankTransform(int[] arr) {
        int[] copy=arr.clone();
       Arrays.sort(copy);
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=0;
        for(int i=0;i<copy.length;i++){
            int ele=copy[i];
            if(!map.containsKey(ele)){
                rank++;
                map.put(ele,rank);
            }
        }
        int[] ranks=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ranks[i]=map.get(arr[i]);
        }
        return ranks;
		
    }
	
	public static void main(String[] args) throws Exception {
		//Variables declaration
		int[] arr1= {1,2,3,1,4,5,3,1,0};
		int[] arr2= {3,2,4};
		int[] arr3= {2,8,-3,-5,2,-4,6,1,2,1,-3,4};
		int[] arr4= {0,1,0};
		int[] arr5= {2,9,3,5,8,6,4};
		int[] arr6 = {10,40,20};
		
		String str1 ="pwwkew";
		String pattern ="abba";
		String str ="dog cat cat dog";
		int target=6;
		
		//Function calls
		//Arrayduplicates(arr1);
		
//		int[] ans = twoSum(arr2,target);
//		System.out.println(Arrays.toString(ans));
		
		//StringCharDuplicate("i am asifs");
		
		//StringWordDuplicate("i am am learning java java");
		
//		int ans = LargestSubarray(arr3);
//		System.out.println(ans);
		
//		int ans = LargestSubarrayCount(arr3);
//		System.out.println(ans);
		
//		int ans = LongestSubstring(str1);
//		System.out.println(ans);
		
		//System.out.println(wordPattern(pattern,str));
		
//		int ans = findMaxLength(arr4);
//		System.out.println(ans);
		
//		boolean ans = equalSum(arr5);
//		System.out.println(ans);
		
		int[] ans = arrayRankTransform(arr6);
		System.out.println(Arrays.toString(ans));
	}

}
