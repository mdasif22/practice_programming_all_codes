package LeetCode_Quetions;

import java.util.*;

class Q347 {
    public int[] topKFrequent(int[] nums, int k) {

    //SOLUTION 1 
    List<Integer>[] bucket = new List[nums.length + 1];
	HashMap<Integer, Integer> hm = new HashMap<>();

	for (int i =0; i< nums.length; i++) 
		hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
	
	for (int key : hm.keySet()) {
		int frequency = hm.get(key);
		if (bucket[frequency] == null) {
			bucket[frequency] = new ArrayList<>();
		}
		bucket[frequency].add(key);
	}

    int ans[] = new int[k];
    int count = 0;
    for (int i = bucket.length - 1; i >= 0 ; i--) {
		if (bucket[i] != null) {
			for(int j =0; j <bucket[i].size(); j++)
              ans[count++] = bucket[i].get(j);
		}
        if(count == k) break;
   	}
              
    return ans;


        //Solution 2
        /*
        HashMap<Integer,Integer>map=new LinkedHashMap<>();
        ArrayList<Integer>a=new ArrayList<>();
        int arr[]=new int[k];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            a.add(e.getValue());
        }
        
        Collections.sort(a);
        
        int j=a.size()-1;
        for(int i=0;i<arr.length;i++){
            for(Map.Entry<Integer,Integer>e:map.entrySet()){
                if(a.get(j)==e.getValue()){
                    arr[i]=e.getKey();
                    map.remove(e.getKey());
                    j--;
                    break;
                }
            }
        }
        return arr;
        */
    }
}
