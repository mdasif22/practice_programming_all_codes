package G4G;

import java.util.*;

	public class unionOfArray {

	public static ArrayList<Integer> Intersection(int[] arr1,int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		ArrayList list = new ArrayList();
		ArrayList set = new ArrayList();
		for(int i=0;i<n;i++) {
			set.add(arr1[i]);
		}
		for(int i=0;i<m;i++) {
			if(set.contains(arr2[i])) {
				list.add(arr2[i]);
			}
		}
		
		return list;
	}
	
	public static int IntersectionOf2Arrays(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			if (set.contains(arr2[i])) {
				list.add(arr2[i]);
				set.remove(arr2[i]);
			}
		}
		for (int item : list) {
			System.out.println(item);
		}
		return list.size();

	}
	
	public static ArrayList<Integer> unionUsingSet(int[] arr1,int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		ArrayList list = new ArrayList();
		SortedSet<Integer> set = new TreeSet();
		for(int i=0;i<n;i++) {
			set.add(arr1[i]);
		}
		for(int i=0;i<m;i++) {
			set.add(arr2[i]);
		}
		for(int item : set) {
			list.add(item);
		}
		return list;
	}
	
	static ArrayList<Integer> unionUsingHashMap(int arr1[], int arr2[]) {
		  HashMap <Integer,Integer > freq=new HashMap<>();
		  ArrayList<Integer> Union=new ArrayList<>();
		  int n = arr1.length;
		  int m = arr2.length;
		  for (int i = 0; i < n; i++)
		    freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
		    
		  for (int i = 0; i < m; i++)
		    freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
		  for (int it: freq.keySet())
		    Union.add(it);
		  return Union;
		}
	
	public static int UnionOf2Arrays(int[] arr1, int[] arr2) {
		//Or We can simply add both arrays in single HashSet(Set)
				Map<Integer, Integer> hm = new HashMap<>();
				for (int i = 0; i < arr1.length; i++) {
					if (!hm.containsKey(arr1[i])) {
						hm.put(arr1[i], 1);
					}
				}
				for (int i = 0; i < arr2.length; i++) {
					if (!hm.containsKey(arr2[i])) {
						hm.put(arr2[i], 1);
					}
				}
				for (int key : hm.keySet()) {
					System.out.println(key);
				}
				return hm.size();

			}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 4, 5};
		int[] arr2 = {2,4,6,1};
		
//		List ans = unionUsingSet(arr1,arr2);
//		System.out.println(ans);
		
		List ans = Intersection(arr1,arr2);
		System.out.println(ans);
		
		// int[] arr1= {7,3,9};
		// int[] arr2= {6,3,9,2,4};
		// //int ans = UnionOf2Arrays(arr1,arr2);
		// int ans = IntersectionOf2Arrays(arr1,arr2);
		// System.out.println("Length of Union is : "+ans);
	}

}
