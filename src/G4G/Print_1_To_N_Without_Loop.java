package G4G;

public class Print_1_To_N_Without_Loop {
	public void printNos(int N)
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
}
