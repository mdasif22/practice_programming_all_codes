package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

/*
//********************* SORTING STRING WORD **************************
//This program is for string permutation weather both string are equals or not
public class StringProgram {

	public static void main(String[] args) {
		char temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
        String str1 = sc.nextLine();
        System.out.println("Enter second string");
        String str2 = sc.nextLine();
        
        if(str1.length()!=str2.length())
        {
        	System.out.println("Both Have different length so not equals");
        }
        else
        {
        	char charArray[] = str1.toCharArray();
            for(int i=0;i<charArray.length;i++)
            {
            	for(int j=i+1;j<charArray.length;j++)
                {
                	if(charArray[i]>charArray[j])
                	{
                		temp         = charArray[i];
                		charArray[i] = charArray[j];
                		charArray[j] = temp;
                	}
                }
            }
            
            //Sorting String 2
            char charArray1[] = str2.toCharArray();
            for(int i=0;i<charArray1.length;i++)
            {
            	for(int j=i+1;j<charArray1.length;j++)
                {
                	if(charArray1[i]>charArray1[j])
                	{
                		temp         = charArray1[i];
                		charArray1[i] = charArray1[j];
                		charArray1[j] = temp;
                	}
                }
            }
            
            System.out.println("Original String = "+str1 +" and "+str2);
            str1 = new String(charArray) ;
            str2 = new String(charArray1) ;
            System.out.println("After Sorting String = "+str1 +" and "+ str2);
            
            //Permutation checking
            if(str1.equals(str2))
            {
            	System.out.println("Both are equals");
            }
            else
            	System.out.println("Not equals");
        }
        
	}
}
*/

//***********************  OR ***************************
/*
public class StringProgram {

	public static void main(String[] args) {
		char temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
        String str1 = sc.nextLine();
        System.out.println("Enter second string");
        String str2 = sc.nextLine();
        
            //Sorting String 1
        	char charArray[] = str1.toCharArray();
        	Arrays.sort(charArray);
            //Sorting String 2
            char charArray1[] = str2.toCharArray();
            Arrays.sort(charArray1);
            
            System.out.println("Original String = "+str1 +" and "+str2);
            System.out.println("After Sorting String = "+new String(charArray) +" and "+new String(charArray1));
            
            //Permutation checking
            if(new String(charArray).equals(new String(charArray1)))
            {
            	System.out.println("Both are equals");
            }
            else
            	System.out.println("Not equals");
        }
        
	}
*/

//**************** SORTING STRING ELEMENTS ****************
/*
public class StringProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of String array");
		int size=sc.nextInt();
		String string[] = new String[size];
		System.out.println("Enter the elements in String array");
		
		for(int i=0;i<size;i++)
		{
			string[i]=sc.next();
		}
		
		for(int i=0; i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(string[i].compareToIgnoreCase(string[j])>0)
				{
					String temp = string[i];
					string[i] = string[j];
					string[j] = temp;
				}
			}
		}
		
		System.out.println("SORTED STRINGS ARE : ");
		for(int i=0;i<size;i++)
		{
			System.out.println(string[i]);
		}
	}
        
}
*/

//******************	INTEGER NUMBER SORTING  **********************
/*
public class StringProgram {

	public static void main(String[] args) {
		char temp;
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		char Array[] = str1.toCharArray();
		char Array1[] = str2.toCharArray();
		/*
		for(int i=0;i<Array.length;i++)
		{
			for(int j=i+1;j<Array.length;j++)
			{
				if(Array[i]>Array[j])
				{
					temp = Array[i];
					Array[i]=Array[j];
					Array[j]=temp;
				}
			}
		}
		
		Arrays.sort(Array);
		Arrays.sort(Array1);
		str1 = new String(Array);
		str2 = new String(Array1);
		int i = Integer.parseInt(str1);
		int i2 =  Integer.parseInt(str2);
		
		if(i==i2)
		{
			System.out.println("Yes Equals");
		}
		else
			System.out.println("No");
        }  
}
*/

//************************	DIVIDE STRING IN EQUAL PARTS *************
/*
public class StringProgram {

	public static void main(String[] args) {
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = sc.next();
		
		int length = str1.length();
		int n = 3; // n defines number of parts
	    int chars=length/n; // this defines that this much character will conatain in a part
		String array[] = new String[n]; // To store sub string in array
		
		if(length%n==0)
		{
			for(int i=0;i<length;i=i+chars)
			{
				String part = str1.substring(i,i+chars);
				array[temp]=part;
				temp++;
			}
			for(int i=0;i<array.length;i++)
			{
				System.out.println(array[i]);
			}
		}
		else
		{
			System.out.println("Cant divide in equals part");
		}			
    }  
}
*/

//**************** FIBONACCI SERIES PROGRAM ***********************
/*
public class StringProgram
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int a=0,b=1;
		int sum=0;
		System.out.println(a+" "+b);
		for(int i=0;i<num1;i++)
		{
			sum=a+b;
			System.out.println(a+" + "+b+" = "+sum);
			a=b;
			b=sum;
		}
	}
}
*/

//*************** GREATEST WORD IN A STRING SENTANCE ************

//class StringProgram
//{
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		//String str = "india us australia uk maxico russia ";
//		int count = 0;
//		String ans = " ";
//		String str1[] = str.split(" ");
//		for(int i = 0;i<str1.length;i++)
//		{
//			if(str1[i].length() > count)
//			{
//				count = str1[i].length();
//				ans = str1[i];
//			}
//		}
//		System.out.println(ans);
//	}
//}

//**************** REMOVE DUPLICATE VALUES FROM ARRAY ************************
/*
public class StringProgram
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int arr[] = new int[num1];
		for(int i=0;i<num1;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int j = 0; 
      for (int i=0; i < num1-1; i++){  
          if (arr[i] != arr[i+1]){  
              arr[j++] = arr[i];  
          }  
		}
      
		arr[j++] = arr[num1-1];
		for(int i=0;i<j;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
*/
//*********** Remove duplicate values from String Array ***************

//public class StringProgram {
//	 public static void main(String[] args) {
//		 String colors1[] = {"red","blue","red","white","pink","blue","white" };
//		 //String colors2[] = [0,1, 2,3,4,5 ]
//		 String colors2[] = new String[colors1.length];
//		 //int j=0,i=0;
//		 int k=0,l=0;
//		 int count=0;
//		 Arrays.sort(colors1);
//		 System.out.println("Old colors : "+Arrays.toString(colors1));
//		 for(int i = 0; i <colors1.length-1; i++)
//		 {
//				 if(colors1[i] != colors1[i+1])
//				 {
//					 colors2[k] = colors1[i];
//					 k++;
//					 count++;
//				 }
//				 else
//					 System.out.println("\nDuplicate value is : "+colors1[i+1]);
//		 }
//		 
//		 colors2[k] = colors1[colors1.length-1];
//		 
//		 System.out.println("\nNew colors are: ");
//		 for(int i =0; i<=count; i++)
//		 {
//			 System.out.print(colors2[i]+" ");
//		 }
//		 
//	 }
//	}
	
//********** REVERSE STRING SENTENCE *********
//class StringProgram {
//	public static void main(String[] args) {
//		String str1 = "This is md asif";
//		String result="";
//		String[] str2 = str1.split(" ");
//		for(int i=str2.length-1;i>=0;i--) {
//			result += str2[i]+" "; 
//		}
//		System.out.println(result);
//	}
//
//}

//*********** DUBLICATE ALPHA IN STRING *************
/*public class StringProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  first string\n");
		String str1 = sc.nextLine();
		char string[] = str1.toCharArray();
		for(int i = 0;i<string.length;i++)
		{
			for(int j = i+1;j<string.length;j++)
			{
				if(string[i] == string[j])
				{
					System.out.println("Duplicate character is = "+string[j]);
				}
			}
		}
	}

}*/

//********* DUPLICATE WORD IN STRING ************
//public class StringProgram {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the string\n");
//		String str1 = sc.nextLine();
//		//char string[] = str1.toCharArray();
//		String str2[] = str1.split(" ");
//		empty=str2;
//		for(int i = 0;i<str2.length;i++)
//		{
//			for(int j = i+1;j<str2.length;j++)
//			{
//				if(str2[i].equals(str2[j]))
//				{	
//					System.out.println();	
//				}
//			}
//		}
//	}
//
//}
//Big black bug bit a big black dog on his big black nose

//******************* LOWEST AND GREATEST WORD IN STRING ********************
//Optimal solution is above
//public class StringProgram {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the string\n");
//		String str1 = sc.nextLine();
//		String low=" ";
//		String high = " ";
//		String str2[] = str1.split(" ");
//		for(int i=0;i<str2.length;i++)
//		{
//			for(int j=i+1;j<str2.length;j++)
//			{
//				if(str2[i].length() > (str2[j]).length())
//				{
//					high = str2[i];
//				}
//				else if(str2[i].length() < (str2[j]).length())
//				{
//					low = str2[i];
//				}
//			}
//		}
//		System.out.println("GREATEST WORD IN THE STRING ( Hardships often prepare ordinary people for an extraordinary destiny) = "+high);
//		System.out.println("LOWEST WORD IN THE STRING ( Hardships often prepare ordinary people for an extraordinary destiny) = "+low);
//	}
//
//}

//***************** SUM OF DIGITS IN STRING **********************
//
//public class StringProgram {
//
//	public static void main(String[] args) {
//
//			Scanner sc = new Scanner(System.in);
//			int sum=0,a=0;
//			String word = sc.next();
//			char ch[] = word.toCharArray();
//			for(int j=0;j<ch.length;j++)
//			{
//				if(Character.isDigit(ch[j]))
//					sum=sum+Character.getNumericValue(word.charAt(j));
//					
//			}
//			System.out.println(sum);
//	}
//}


//*************** Number of Possible SubStrings ***************
//Number of Possible SubStrings
//class codechef{
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	String str = sc.next();
//	int n = str.length();
//	System.out.println("Possible Substrings are = "+(n*(n+1))/2);
//		
//	}
//}

//***************** String Upper to Lower or vise versa ********************
//Reverse the String Upper to Lower or vise versa
//class StringProgram{
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	String str = sc.nextLine();
//	StringBuilder s = new StringBuilder(str);
//	
//	for(int i =0;i<str.length();i++)
//	{
//		char c = s.charAt(i);
//		if(Character.isLowerCase(c))
//		{
//			s.replace(i, i+1, String.valueOf(c).toUpperCase());
//		}
//		else if(Character.isUpperCase(c))
//			s.replace(i, i+1, String.valueOf(c).toLowerCase());
//	}
//	System.out.println(new String(s));
//		
//	}
//}

//************** Char Counts in String *****************

//class StringProgram
//{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		
//		for(int i=0;i<str.length();i++)
//		{
//			int count = 0;
//			char c = str.charAt(i);
//			for(int j=0;j<str.length();j++)
//			{
//				if(str.charAt(i) == str.charAt(j))
//				{
//					count++;
//				}
//			}
//			
//			
//			System.out.println("Number of count of "+c+" is = "+count);
//		}
//	}
//}

////************** Char Counts in SubStrings *****************
//class StringProgram
//{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		int n = str.length();
//		for(int i=0;i<str.length();i++)
//		{
//			char c = str.charAt(i);
//			System.out.println("Count of "+c+" = "+(n-i)*(i+1)); //Formula = (n-i)*(i+1)
//		}
//	}
//}

//************** Vowels Counts in SubStrings *****************
//class StringProgram
//{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine().toLowerCase();
//		int n = str.length();
//		int sum = 0;
//		for(int i=0;i<str.length();i++)
//		{
//			char c = str.charAt(i);
//			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
//			//System.out.println("Count of "+c+" = "+(n-i)*(i+1)); //Formula = (n-i)*(i+1)
//				sum = sum + ((n-i)*(i+1));
//		}
//		System.out.println(sum);
//	}
//}

//Reassemble the string
//class StringProgram
//{
//	public static void main(String[] args) {
//		String str1 = "is2 this1 test4 a3";
//		String str2 = " ";
//		String[] word = str1.split(" ");
//		String[] temp = new String[word.length];
//		for(int i = 0; i<word.length; i++)
//		{
//			int index = word[i].charAt(word[i].length()-1)-'0';
//			temp[index - 1] = word[i].substring(0,word[i].length()-1);
//		}
//		for(int i=0;i<temp.length;i++) {
//			str2 = str2+temp[i]+" ";
//			
//		}
//		
//		System.out.println(str2.trim());
//		
//	}
//}


//*************** Remove a char from String ***********************
//class StringProgram{
//	public static void main(String[] args) {
//		String str = "baccadh";
//		String str2=" ";
//		
//		for(int i=0;i<str.length();i++) {
//			char c = str.charAt(i);
//			if(c!='a')
//			{
//				str2 += String.valueOf(c);		
//			}
//		}
//		System.out.println(str2);
//	}
//}

// ******************** Remove word from String **********************
//class StringProgram{
//	
//	public static void main(String[] args) {
//		String str = "baccappledh";
//			if(str.contains("apple"))
//			{
//				str = str.replace("apple", "");
//			}
//		System.out.println(str);
//	}
//}


//*************	STRING PERMUTATION *******************
//class StringProgram{
//	
//	static void permutation(String p,String up)
//	{
//		if(up.isEmpty())
//		{
//			System.out.println(p);
//			return;
//		}
//		
//		char ch = up.charAt(0);
//		for(int i=0;i<=p.length();i++)
//		{
//			
//			String f=p.substring(0,i);
//			String s=p.substring(i,p.length());
//			permutation(f+ch+s,up.substring(1));
//		}
//		
//	}
//	
//	public static void main(String[] args) {
//		String str = "abc";
//		permutation("",str);
//	}
//}

//************ STRING PERMUTATION METHOD 2 *********************
//class StringProgram{
//	
//	static void permutation(String up,String p)
//	{
//		if(up.isEmpty())
//		{
//			System.out.println(p);
//			return;
//		}
//		
//		
//		for(int i=0;i<up.length();i++)
//		{
//			char ch = up.charAt(i);
//			String f=up.substring(0,i);
//			String s=up.substring(i+1);
//			permutation(f+s,p+ch);
//		}
//		
//	}
//	
//	public static void main(String[] args) {
//		String str = "abc";
//		permutation(str,"");
//	}
//}



