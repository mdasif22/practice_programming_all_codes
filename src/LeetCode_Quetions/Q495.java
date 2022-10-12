package LeetCode_Quetions;

class Q495 {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 0)
            return 0;
        int len = timeSeries.length-1;
        int sum=0;
		for(int i=0;i<len;i++) {
			sum +=Math.min(timeSeries[i+1] - timeSeries[i] , duration);	
		}
		return sum+duration;
    }
    
    public static void main(String[] args) {
		int[] timeSeries = {1,2};
		int duration = 2;
		int ans = findPoisonedDuration(timeSeries,duration);
		System.out.println(ans);
	}
}