package Resursion;

public class Print_1_To_N_Without_Loop {
	//print 1 to n
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

	//sum of first n natural numbers
	public static int SumOfoneTon1(int num) {
		if(num==0)
			return 0;
		
		return num + SumOfoneTon1(num-1);
	}
	
	//Method 2
	public static void SumOfoneTon2(int i,int num, int sum) {
		if(i==num) {
			sum+=i;
			System.out.println(sum);
			return;
		}
			
		sum+=i;
		SumOfoneTon2(i+1,num,sum);
		
	}
	
	//print n to 1 
	public static int nTo1Reverse(int num) {
		if(num==0) {
			return 0;
		}
		System.out.println(num);
		return nTo1Reverse(num-1);
	}
	
	public static int factorial(int num) {
		if(num==1)
			return 1;
		
		return num * factorial(num-1);
	}
	
	public static int factorial2(int num) {
		if(num==1)
			return 1;
		
		int fact_ans = factorial2(num-1);
		int fact_total = num * fact_ans;
		return fact_total;
	}
	
	public static void main(String args[])
    {
       
        int n = 10;
        //printNos(n);
        
        //nTo1Reverse(n);
        
       //System.out.println(SumOfoneTon1(n));
        
        //SumOfoneTon2(1,10,0);
        
        //System.out.println(factorial(5));
        
        System.out.println(factorial(5));
    }
}
