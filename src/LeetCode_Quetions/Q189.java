package LeetCode_Quetions;

class Q189 {
    public void rotate(int[] nums, int k) {
        int r=k%nums.length;
        int arr[] = new int[r];
        int index=0;
        for(int i=nums.length-r;i<nums.length;i++){
            arr[index]=nums[i];
            index++;
        }
        for(int j=nums.length-1;j>=r;j--)
            nums[j]=nums[j-r];
        for(int i=0;i<r;i++)
            nums[i]=arr[i];
    }
}
