package Resursion;

import java.util.*;

public class SubSequence_Array {
	
	 //Subsequence using iterative apprch
	 public static List<List<Integer>> subsetsIterative(int[] nums) {
	        List<List<Integer>> ans = new ArrayList<List<Integer>>();
	        int n = nums.length;
	        ans.add(new ArrayList<Integer>()); 

	        //Arrays.sort(nums); 

	        for(int i = 0; i < n; i++){
	            int j = ans.size();
	            while(j-- > 0){
	                List<Integer> subset = new ArrayList<Integer>(ans.get(j));
	                subset.add(nums[i]);
	                ans.add(subset);
	            }
	        }
	        
	        return ans;
	    }
	
	//Subset/ Subsequence using recursion
	public static void subsequence(int index,List<Integer> list,int[] arr,int len) {
		if(index==len)
		{
			for(int ele : list) {
				System.out.print(ele + " ");
			}
			System.out.println();
			return;
		}
		
		list.add(arr[index]);
		subsequence(index+1, list, arr, len);
		list.remove(list.size()-1);
		subsequence(index+1, list, arr, len);
	}
	
	//Q78 ka first part
	public static List<List<Integer>> subsets(int[] nums) {
        //Approach: Using Backtracking 
        List<List<Integer>> ans = new ArrayList<>();
        //base case 
        if(nums==null || nums.length==0) return ans;

        //call our backtrack method
        backtrack(nums, ans, new ArrayList<>(), 0);
        return ans;

    }
	
	//Q78 ka second part
	 public static void backtrack(int[] nums, List<List<Integer>> ans, List<Integer> inner_list, int idx){
	        //base case
	        if(idx==nums.length){
	            ans.add(new ArrayList<>(inner_list));
	            return;
	        }

	        //case 1: we pick the element
	        //add to inner_list
	        inner_list.add(nums[idx]);
	        //call recursion
	        backtrack(nums, ans, inner_list, idx+1);
	        
	        //remove element from inner_list
	        inner_list.remove(inner_list.size()-1);

	        //case 2: we dont pick the element 
	        backtrack(nums, ans, inner_list, idx+1);

	    }
	 
	
	 
	 //Q90 part 2 by take u for
	 public static void findSubsets(int ind, int[] nums, List<Integer> ds, List<List<Integer>> ansList) {
	        ansList.add(new ArrayList<>(ds)); 
	        for(int i = ind;i<nums.length;i++) {
	            if(i!=ind && nums[i] == nums[i-1]) continue; 
	            ds.add(nums[i]); 
	            findSubsets(i+1, nums, ds, ansList); 
	            ds.remove(ds.size() - 1);
	        }
	        
	    }
	 //Q90 part 1 by take u for
	    public static List<List<Integer>> subsetsWithDup(int[] nums) {
	        Arrays.sort(nums); 
	        List<List<Integer>> ansList = new ArrayList<>(); 
	        findSubsets(0, nums, new ArrayList<>(), ansList); 
	        return ansList; 
	    }
	
	//Subset sum by take u forward
	public static void subsequenceSum(int index,int sum,ArrayList<Integer> arr,int len,ArrayList<Integer> sumSubset) {
		if(index==len)
		{
			sumSubset.add(sum);
			return;
		}
		
		//pick the element to add
		subsequenceSum(index+1, sum + arr.get(index), arr, len,sumSubset);
		//not pick the element
		subsequenceSum(index+1, sum, arr, len,sumSubset);
	}
	

	public static void main(String[] args) {
		int[] arr= {3,1,2};
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> sumSubset = new ArrayList<>();
		
		list2.add(3);
		list2.add(1);
		list2.add(2);
		
		subsequence(0,list1,arr,arr.length);
		
//		subsequenceSum(0,0,list2,list2.size(),sumSubset);
//		Collections.sort(sumSubset);
//		System.out.println(sumSubset);
		
		
		//System.out.println(subsetsIterative(arr));
	}

}
