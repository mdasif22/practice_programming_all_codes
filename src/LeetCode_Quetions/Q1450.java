package LeetCode_Quetions;

public class Q1450 {

	public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		int count=0;
        for(int i=0;i<startTime.length;i++) {
        	if(endTime[i]-startTime[i]>=queryTime || endTime[i]==queryTime) {
        	count++;	
        	}
        }
        return count;
    }

	public static void main(String[] args) {
		int[] startTime = {4}, endTime = {4};
		int queryTime = 4;
		int ans = busyStudent(startTime,endTime,queryTime);
		System.out.println(ans);
	}

}
