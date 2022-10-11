import java.util.*;
class Q349 {
    public int[] intersection(int[] arr1, int[] arr2) {
       Set list1 = new HashSet();
       Set list2 = new HashSet();
       for(int i=0;i<arr1.length;i++){
           list1.add(arr1[i]);
       }
       for(int i=0;i<arr2.length;i++){
           if(list1.contains(arr2[i])){
               list2.add(arr2[i]);
           }
       }
       int[] ans = new int[list2.size()];
       int i=0;
       for(Object ele : list2){
           ans[i++]=(int)ele;
           //System.out.println(ele);
       }
       //System.out.println(Arrays.toString(ans));
        return ans;
    }
   
}