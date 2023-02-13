package LeetCode_Quetions;

import java.util.*;

public class Q599 {
 public static String[] findRestaurant(String[] list1, String[] list2) {
	 HashMap<String,Integer> hm = new HashMap();
	 for(int i=0;i<list1.length;i++) {
		 hm.put(list1[i], i);
	 }
	 List<String> list = new ArrayList();
	 int total=0,min=Integer.MAX_VALUE;
	 for(int i=0;i<list2.length;i++) {
		 if(hm.get(list2[i])!=null) {
			 total=i+hm.get(list2[i]);
			 
			 if(total<min) {
				 list.clear();
				 list.add(list2[i]);
			 }
			 else if(total==min){
				 list.add(list2[i]);
			 }
			 min=Math.min(total, min);
		 }
	 }
	 String[] ans = new String[list.size()];	 
	 return list.toArray(ans);
	 
	 //My Approach
//        List<String> list = new ArrayList();
//        int max=Integer.MAX_VALUE;
//        for(int i=0;i<list1.length;i++) {
//        	int count=Integer.MAX_VALUE;
//        	for(int j=0;j<list2.length;j++) {
//        		if(list1[i]==list2[j]) {
//        			count=i+j;
//        		}
//        	}
//        	if(max>=count) {
//        		max=count;
//        		list.add(list1[i]);
//        	}
//        }
//        return list.toArray(new String[0]);
    }

	public static void main(String[] args) {
		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"}; 
		String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
		String[] ans = findRestaurant(list1,list2);
		System.out.println(Arrays.toString(ans));

	}

}
