package Resursion;

public class total_sum_subset {
	//it will return those elements that are equals to target
	public static void TargetSumSubsets(int[] arr,int index,String set,int sumofsubset,int target){
		if(index==arr.length) {
			if(sumofsubset==target) {
				System.out.println(set+".");
			}
			return;
		}
		//taking current element and adding to sum
		TargetSumSubsets(arr,index+1,set+arr[index]+", ", sumofsubset+arr[index],target);
		//ignoring current element and not adding to sum
		TargetSumSubsets(arr,index+1,set, sumofsubset,target);
	}

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		TargetSumSubsets(arr1,0,"",0,70);
	}

}
