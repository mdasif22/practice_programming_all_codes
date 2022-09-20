package LeetCode_Quetions;

class Q152 {
	public static int maxProduct(int[] nums) {
		int max_prod = Integer.MIN_VALUE;
		int curr = 1;
		for (int i = 0; i < nums.length; i++) {
			curr *= nums[i];
			max_prod = Math.max(max_prod, Math.max(curr, nums[i]));
			if (curr == 0)
				curr = 1;
		}
		
		curr = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			curr *= nums[i];
			max_prod = Math.max(max_prod, curr);
			if (curr == 0)
				curr = 1;
		}
		return max_prod;
	}
	
	public static void main(String[] args) {
		int[] num = {2,3,-2,4};
		int ans = maxProduct(num);
		System.out.println(ans);
	}
	
}
