package LeetCode_Quetions;

class Q1608 {
    public int specialArray(int[] nums) {
        for(int i=0;i<=nums.length;i++){
            int count=0;
            for(int ele : nums){
                if(ele >= i)
                    count++;
            }
            if(i==count)
                return i;
        }
        return -1;
    }
}
