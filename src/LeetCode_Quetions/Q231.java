package LeetCode_Quetions;

class Q231 {
    public boolean isPowerOfTwo(int n) {
        if(n==1)return true;
    
    if(n%2!=0 || n==0)return false;
    
    return isPowerOfTwo(n/2);
}
}
