package LeetCode_Quetions;

class Q55 {
    public boolean canJump(int[] nums) {
    
       int reachable = 0;
        for(int i=0;i<nums.length;i++){
            if(reachable<i)
                return false;
            reachable = Integer.max(reachable, i+nums[i]);
        }
        return true;
    }
}