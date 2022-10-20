package LeetCode_Quetions;

import java.util.ArrayList;

class Q922 {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]%2==0)
           {
               a.add(nums[i]);
           }else{
               b.add(nums[i]);
           }
        }
        
        int arr[]=new int[nums.length];
        int k=0,l=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
               arr[i] = a.get(k++);
            }else{
                arr[i]=b.get(l++);
            }
        }
        return arr;
    }
}
