package Resursion;

public class Print_1_To_N_Without_Loop {
	public static void printNos(int N)
    {
        if(N==1) {
            System.out.print(1);
            return;
        }
        else{
            printNos(N-1);
            System.out.print(" " + N);
        }
    }
	public static void main(String args[])
    {
       
        int n = 10;
        printNos(n);
        // Function calling
        //System.out.println(findMinRec(A, n));
    }
}
