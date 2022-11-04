package Sliding_Window;

import java.util.HashMap;

public class Longest_Substring_With_Exactly_K_Distinct_Characters {

	public static int Longest_Substring_With_Exactly_K_Distinct_Characters1(String str,int k) {
		int i=-1,j=-1,ans=0;
		HashMap<Character,Integer> map = new HashMap<>();
		
		while(true) {
			boolean f1=false;
			boolean f2=false;
			
			//aquire
			while(i<str.length()-1) {
				f1=true;
				i++;
				char ch = str.charAt(i);
				map.put(ch, map.getOrDefault(ch, 0) + 1);
				
				if(map.size() < k) {
					continue;
				}
				else if(map.size()==k) {
					int len = i-j;
					if(len>ans)
						ans=len;
				}
				else
					break;
			}
			
			//release
			while(j<i) {
				f2=true;
				j++;
				
				char ch = str.charAt(j);
				if(map.get(ch)==1)
					map.remove(ch);
				else {
					map.put(ch, map.get(ch)-1);
				}
				
				if(map.size() > k) {
					continue;
				}
				else if(map.size()==k) {
					int len = i-j;
					if(len>ans)
						ans=len;
					break;
				}
				
				
			}
			
			if(f1==false && f2==false) {
				break;
			}
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		String str = "abbacbcdbadbdbbdcb"; //abbacbcdbadbdbbdcb   aabcbcdbca
		int k=2;
		int ans = Longest_Substring_With_Exactly_K_Distinct_Characters1(str,k);
		System.out.println(ans);
	}
}
