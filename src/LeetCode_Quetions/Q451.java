package LeetCode_Quetions;

import java.util.*;

class Q451 {
    public String frequencySort(String s) {
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            h.put(c, h.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> h.get(b) - h.get(a));
        pq.addAll(h.keySet());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char c = pq.remove();
            for(int i = 0; i < h.get(c); i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
