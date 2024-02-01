package Sliding_Window;

public class Q643_Maximum_Avg {
	public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        double maxAverage = Integer.MIN_VALUE;
        for (int left = 0, right = 0; right < nums.length; right++) {
            
            sum += nums[right];
            count++;
            
            if (k == count) {
                maxAverage = Math.max(maxAverage, (double)sum / k);
                sum -= nums[left];
                count--;
                left++;
            }
        }
    return maxAverage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
