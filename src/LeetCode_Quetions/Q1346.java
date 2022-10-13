package LeetCode_Quetions;

class Q1346
{
public static  boolean checkIfExist(int[] arr) {
	    //int a=0,b=arr.length-1;
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr.length;j++) {
        		if(i!=j && arr[i]== 2 * arr[j])
        			return true;
        	}
        }
        return false;
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] nums = {3,1,7,11};
		boolean ans = checkIfExist(nums);
		System.out.println(ans);
	}
}