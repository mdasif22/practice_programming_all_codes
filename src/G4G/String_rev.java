package G4G;

class String_rev
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        return reverse;
    }
}
