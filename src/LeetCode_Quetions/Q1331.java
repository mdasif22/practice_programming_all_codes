package LeetCode_Quetions;

import java.util.Arrays;
import java.util.HashMap;

class Q1331
{
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
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] nums = {10,40,20};
		int[] ans = arrayRankTransform(nums);
		System.out.println(Arrays.toString(ans));
	}
}
