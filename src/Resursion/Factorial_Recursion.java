package Resursion;

class Factorial_Recursion {
	 
	private static int recLen(int str)
    {
        if (str==1 || str==0)
            return 1;
       
        int f=recLen(str-1);
        int f2=str*f;
        return f2;
    }
 
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int  str =5;
        int ans =recLen(str);
        System.out.println(ans);
    }
}