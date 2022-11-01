package G4G;

public class Find_Nth_root_of_M {
	public static int NthRoot(int n,int m) {
		int low = 1, high = m;
        while(low <= high){
            int mid = low + (high - low) / 2;
            double t = Math.pow(mid, n);
            if(t == m){
                return mid;
            }
            if(t < m){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
        
        
    }
	
	public static void main (String[] args)
	{
		int n = 2,m=9;
		int ans = NthRoot(n,m);
		System.out.println(ans);
	}
}
