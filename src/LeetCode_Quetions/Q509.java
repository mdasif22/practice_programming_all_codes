package LeetCode_Quetions;

class Q509 {
    public int fib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        n = fib(n-1) + fib(n-2);
        
        return n;
    }
}
