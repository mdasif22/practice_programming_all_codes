package Practice;
//******************************************
/*
* 
* * 
* * * 
* * * * 
* * * * * 

 */

//public class Patterns {
//
//	public static void main(String[] args) {
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//
//	}
//
//}

//*******************************************
/*
	 * * * * * 
	 * * * * 
	 * * *
	 * *
	 *
 */
//public class Patterns {
//
//	public static void main(String[] args) {
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			for (int j = n; j >= i; j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//
//	}
//
//}


/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
 */
//class Patterns
//{
//	public static void main(String[] args) {
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for (int j = 1; j <= i; j++) 
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//	}
//}

//********************************
/*
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
*
 */
//class Patterns
//{
//	public static void main(String[] args) {
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for (int j = 1; j <= i; j++) 
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=n;i++)
//		{
//			for (int j = n; j > i; j--) 
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
//}

//********************************
class Patterns
{
	public static void main(String[] args) {
		
		int i, j, k;

		for (i = 1; i < 5; i++) {
			for (j = 5; j > i; j--) {
				System.out.printf("  ");

			}
			for (k = 1; k <= i; k++) {

				System.out.printf(" *  ");
			}
			System.out.println();
		}
		
//		for(int i=1;i<=n;i++)
//		{
//			for (int j = n; j > i; j--) 
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
	}
}
