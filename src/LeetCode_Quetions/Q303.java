package LeetCode_Quetions;
class Q303 {

    int[] arr;
    public NumArray(int[] nums) {
        this.arr=nums;
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        for(int i=left;i<=right;i++){
            sum+=arr[i];
        }
        return sum;
    }
}