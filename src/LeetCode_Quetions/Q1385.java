package LeetCode_Quetions;

class Q1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int max=0;
        int x=0;
        for(int i=0;i<arr1.length;i++) {
        	x=0;
        	for(int j=0;j<arr2.length;j++) {
        		int ans = Math.abs(arr1[i]-arr2[j]);
        		if( ans <= d) {
        			j=arr2.length;
        		}
                else{
                    x++;
                }
        	}
            if(x==arr2.length){
                max++;
            }
        }
        return max;
    }
}